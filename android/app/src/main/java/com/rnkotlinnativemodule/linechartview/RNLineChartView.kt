package com.rnkotlinnativemodule.linechartview

import android.util.Log
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class RNLineChartView: SimpleViewManager<LineChartView>() {
    override fun getName() = "RNLineChartView"

    companion object {
        val DEBUG_KEY = "RNLineChartView"
    }

    @ReactProp(name = "data")
    fun setData(view: LineChartView, newData: ReadableArray) {
        Log.d(DEBUG_KEY, "${(newData.toArrayList()[0] as HashMap<String, Float>)["x"]}")
        val coords = newData.toArrayList() as ArrayList<HashMap<String, Float>>
        view.coords = coords
        view.data = chartDataFromCoords(coords)
    }

    private fun chartDataFromCoords(coords: ArrayList<HashMap<String, Float>>): LineData {
        val entries = coords.mapIndexed { index, coord ->
            if (coord["y"] == null) {
                null
            } else {
                Entry(index.toFloat(), coord["y"]!!)
            }
        }

        val dataSet = LineDataSet(entries, null)
        val lineData = LineData(dataSet)
        return lineData
    }

    override fun createViewInstance(reactContext: ThemedReactContext): LineChartView {
        return LineChartView(reactContext)
    }
}