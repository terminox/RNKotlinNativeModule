package com.rnkotlinnativemodule

import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext

class RNBasicView: SimpleViewManager<BasicView>() {
    override fun getName() = "RNBasicView"

    override fun createViewInstance(reactContext: ThemedReactContext): BasicView {
        val basicView = BasicView(reactContext)
        return basicView
    }
}