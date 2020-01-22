package com.rnkotlinnativemodule.LineChart

import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.rnkotlinnativemodule.R

class LineChartView(context: Context): LinearLayout(context) {
    init {
        LayoutInflater.from(context).inflate(R.layout.line_chart_view, this, true)
    }
}