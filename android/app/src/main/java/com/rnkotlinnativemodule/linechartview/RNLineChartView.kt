package com.rnkotlinnativemodule.linechartview

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

class RNLineChartView: SimpleViewManager<LineChartView>() {
    override fun getName() = "RNLineChartView"

    @ReactProp(name = "data")
    fun setData(view: LineChartView, newData: ReadableArray) {
        
    }

    override fun createViewInstance(reactContext: ThemedReactContext): LineChartView {
        val lineChartView = LineChartView(reactContext)
        return lineChartView
    }
}