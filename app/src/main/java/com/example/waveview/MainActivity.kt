package com.example.waveview

import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val waveView = findViewById<WaveView>(R.id.wave_view)
        waveView.setDuration(7000)
        waveView.setStyle(Paint.Style.FILL)
        waveView.setColor(Color.parseColor("#3666FA"))
        waveView.setInterpolator(LinearOutSlowInInterpolator())
        waveView.start()
//
//        waveView.postDelayed({
//            waveView.stop()
//        }, 10000)
    }
}