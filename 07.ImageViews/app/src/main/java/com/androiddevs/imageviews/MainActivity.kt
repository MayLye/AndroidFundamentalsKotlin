package com.androiddevs.imageviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // the button id is btnAddImage.
        btnAddImage.setOnClickListener {
            // our imageView id is ivImage.
            // add the function setImageResource, and then add in our image from our drawable folder.
            ivImage.setImageResource(R.drawable.buddha_bg)
        }
    }
}