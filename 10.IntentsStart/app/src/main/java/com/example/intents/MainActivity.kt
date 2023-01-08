package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

// inherit from AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpenActivity.setOnClickListener {
            // Intent means the intention to do sthg.
            // 'also' expressions does some additional processing on the object it was invoked.
            Intent(this, SecondActivity::class.java).also {
                // refer with 'it' to our intent object here. This is enough to start the new activity.
                startActivity(it)
            }
        }
    }
}