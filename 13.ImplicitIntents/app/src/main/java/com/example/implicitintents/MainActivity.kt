package com.example.implicitintents

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTakePhoto.setOnClickListener {
            // ACTION_GET_CONTENT could allow user to create the data as it runs
            Intent(Intent.ACTION_GET_CONTENT).also {
                // image/* is consider a mime type which look for all images.
                it.type = "image/*"
                // start an external activity and expect to get result from that activity,
                // here we expect to get the choosen image.
                startActivityForResult(it, 0)
            }
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        // onActivityResult is used to send data back to the previous activity.
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK && requestCode == 0) {
            // data which is our intent and it is nullable.
            val uri = data?.data
            ivPhoto.setImageURI(uri)
        }
    }

}