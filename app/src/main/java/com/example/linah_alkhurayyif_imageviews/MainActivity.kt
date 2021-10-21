package com.example.linah_alkhurayyif_imageviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image1.setOnClickListener {
            bg_color.setBackgroundColor(Color.parseColor("#095548"))
            
            imageView.setImageResource(R.drawable.img1)
        }
        image2.setOnClickListener {
            bg_color.setBackgroundColor(Color.BLACK)
            imageView.setImageResource(R.drawable.img2)
        }
    }
}