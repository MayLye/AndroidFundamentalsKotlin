package com.androiddevs.toastcontext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            // for normal toast, use the following:
            // Toast.makeText(applicationContext, "Hi, I'm a toast!", Toast.LENGTH_LONG).show()

            // to create custome toast, use the following:
            Toast(this).apply { // create a toast instance.
                // refer to the toast.
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast, clToast) //inflate layout
                show()
            }
        }
    }
}