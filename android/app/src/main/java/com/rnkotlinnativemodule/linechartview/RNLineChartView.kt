package com.rnkotlinnativemodule.linechartview

import android.content.Context
import android.graphics.Color
import androidx.core.content.ContextCompat
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.utils.ColorTemplate
import com.rnkotlinnativemodule.R

class RNLineChartView: SimpleViewManager<LineChartView>() {
    override fun getName() = "RNLineChartView"

    @ReactProp(name = "data")
    fun setData(view: LineChartView, newData: ReadableArray) {
        val coords = newData.toArrayList() as ArrayList<HashMap<String, Float>>
        view.coords = coords
        view.data = chartDataFromCoords(coords, view.context)
    }

    private fun chartDataFromCoords(coords: ArrayList<HashMap<String, Float>>, context: Context): LineData {
        val entries = coords.mapIndexed { index, coord ->
            if (coord["y"] == null) {
                null
            } else {
                Entry(index.toFloat(), coord["y"]!!)
            }
        }

        val dataSet = LineDataSet(entries, null)
        dataSet.lineWidth = 2f
        dataSet.color = ColorTemplate.rgb("#47C6F1")
        dataSet.highLightColor = ColorTemplate.rgb("#47C6F1")
        dataSet.circleHoleColor = ColorTemplate.rgb("#47C6F1")
        dataSet.circleRadius = 3f
        dataSet.circleHoleRadius = 1.5f
        dataSet.fillDrawable = ContextCompat.getDrawable(context, R.drawable.gradient)
        dataSet.setCircleColor(Color.WHITE)
        dataSet.setDrawCircleHole(false)
        dataSet.setDrawCircles(false)
        dataSet.setDrawValues(false)
        dataSet.setDrawHorizontalHighlightIndicator(false)
        dataSet.setDrawFilled(true)

        val lineData = LineData(dataSet)
        return lineData
    }

    override fun createViewInstance(reactContext: ThemedReactContext): LineChartView {
        return LineChartView(reactContext)
    }
}