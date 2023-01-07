package com.example.edittexts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            // convert the edittext into String and then into Integer.
            val firstNumber = etFirstNumber.text.toString().toInt()
            val secondNumber = etSecondNumber.text.toString().toInt()
            // save the result in variable
            val result = firstNumber + secondNumber
            // set the result into textview
            tvResult.text = result.toString()
        }

        btnMinus.setOnClickListener {
            val firstNumber = etFirstNumber.text.toString().toInt()
            val secondNumber = etSecondNumber.text.toString().toInt()
            val result = firstNumber - secondNumber
            tvResult.text = result.toString()
        }
    }
}