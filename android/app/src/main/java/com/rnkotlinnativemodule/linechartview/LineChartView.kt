package com.rnkotlinnativemodule.linechartview

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.rnkotlinnativemodule.R
import kotlinx.android.synthetic.main.line_chart_view.view.*

class LineChartView(context: Context): LinearLayout(context) {
    init {
        LayoutInflater.from(context).inflate(R.layout.line_chart_view, this, true)

        val revenueComp1 = arrayListOf(10000f, 20000f, 30000f, 40000f)
        val revenueComp2 = arrayListOf(12000f, 23000f, 35000f, 48000f)

        val entries1 = revenueComp1.mapIndexed { index, revenue ->
            Entry(index.toFloat(), revenue)
        }

        val entries2 = revenueComp2.mapIndexed { index, revenue ->
            Entry(index.toFloat(), revenue)
        }

        val lineDataSet1 = LineDataSet(entries1, "Company 1")
        lineDataSet1.color = Color.RED
        lineDataSet1.setDrawValues(false)
        lineDataSet1.axisDependency = YAxis.AxisDependency.LEFT

        val lineDataSet2 = LineDataSet(entries2, "Company 2")
        lineDataSet2.color = Color.BLUE
        lineDataSet1.setDrawValues(false)
        lineDataSet1.axisDependency = YAxis.AxisDependency.LEFT

        val lineDataSets = arrayListOf(lineDataSet1, lineDataSet2) as List<LineDataSet>
        val lineData = LineData(lineDataSets)
        lineChartView.data = lineData
        lineChartView.invalidate()
    }
}