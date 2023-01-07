package com.example.textviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0 // set a variable count to 0.

        btnCount.setOnClickListener {
            // each time we click on the count, we want to increase it by 1, so we write count++
            count++
            // the textView id is tvCount.
            // we want to update the text on our textview.
            // insert the count by putting $.
            tvCount.text = "Let\'s count together: $count" // must put \ after apostrophe', otherwise it won't run.
        }

        btnCount2.setOnClickListener {
            count += 5
            tvCount.text = "Let\'s count together: $count"
        }
    }
}