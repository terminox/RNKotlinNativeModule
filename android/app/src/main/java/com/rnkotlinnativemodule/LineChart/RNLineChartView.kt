package com.rnkotlinnativemodule.LineChart

import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext

class RNLineChartView: SimpleViewManager<LineChartView>() {
    override fun getName() = "RNLineChartView"

    override fun createViewInstance(reactContext: ThemedReactContext): LineChartView {
        val lineChartView = LineChartView(reactContext)
        return lineChartView
    }
}