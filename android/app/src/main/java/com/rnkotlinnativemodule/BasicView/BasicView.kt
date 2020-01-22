package com.rnkotlinnativemodule.BasicView

import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.rnkotlinnativemodule.R

class BasicView(context: Context): LinearLayout(context) {
    init {
        LayoutInflater.from(context).inflate(R.layout.basic_view, this, true)
    }
}