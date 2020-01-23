package com.rnkotlinnativemodule.linechartview

import android.content.Context
import android.graphics.Color
import android.graphics.DashPathEffect
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.utils.ColorTemplate
import com.rnkotlinnativemodule.R
import kotlinx.android.synthetic.main.line_chart_view.view.*
import kotlin.properties.Delegates

class LineChartView(context: Context): LinearLayout(context) {

    var coords: ArrayList<HashMap<String, Float>> = arrayListOf()

    var data: LineData? = null
        set(value) {
            lineChartView.data = value
            lineChartView.invalidate()
        }

    init {
        // Inflate layout
        LayoutInflater.from(context).inflate(R.layout.line_chart_view, this, true)

        // Style chart
        lineChartView.description = null
        lineChartView.axisRight.isEnabled = false
        lineChartView.legend.isEnabled = false
        lineChartView.isDoubleTapToZoomEnabled = false
        lineChartView.isScaleXEnabled = false
        lineChartView.isScaleYEnabled = false
        lineChartView.minOffset = 0f
        lineChartView.isHighlightPerTapEnabled = false
        lineChartView.isHighlightPerDragEnabled = false
        lineChartView.isDragYEnabled = false
        lineChartView.marker = null

        val extraTopOffset = 16.0f
        val markerHeight = 28.0f
        lineChartView.extraTopOffset = extraTopOffset + markerHeight

        val xAxis = lineChartView.xAxis
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.textColor = ColorTemplate.rgb("#8DA2B9")
        xAxis.textSize = 10f
        xAxis.setDrawLabels(false)
        xAxis.setDrawAxisLine(false)
        xAxis.setDrawGridLines(false)

        val leftAxis = lineChartView.axisLeft
        leftAxis.gridColor = ColorTemplate.rgb("#D4DCE6")
        leftAxis.textColor = ColorTemplate.rgb("#8DA2B9")
        leftAxis.textSize = 10f
        leftAxis.setGridDashedLine(DashPathEffect(floatArrayOf(5f, 5f), 5f))
        leftAxis.setDrawAxisLine(false)
        leftAxis.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART)
    }
}