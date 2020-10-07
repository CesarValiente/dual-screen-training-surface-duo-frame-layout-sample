package com.cesarvaliente.surfaceduoframelayoutsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.device.dualscreen.core.DisplayPosition
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        move_to_start.setOnClickListener { duo_wrapper.surfaceDuoDisplayPosition = DisplayPosition.START }
        move_to_end.setOnClickListener { duo_wrapper.surfaceDuoDisplayPosition = DisplayPosition.END }
        span.setOnClickListener { duo_wrapper.surfaceDuoDisplayPosition = DisplayPosition.DUAL }
    }
}