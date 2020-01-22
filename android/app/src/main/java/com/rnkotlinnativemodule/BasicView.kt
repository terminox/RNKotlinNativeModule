package com.rnkotlinnativemodule

import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout

class BasicView(context: Context): LinearLayout(context) {
    init {
        LayoutInflater.from(context).inflate(R.layout.basic_view, this, true)
    }
}