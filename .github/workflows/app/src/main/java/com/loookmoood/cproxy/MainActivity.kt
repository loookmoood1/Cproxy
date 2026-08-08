package com.loookmoood.cproxy

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this).apply {
            text = "Cproxy\n\nПрограмма запущена"
            textSize = 22f
            setPadding(40, 80, 40, 40)
        }

        setContentView(text)
    }
}
