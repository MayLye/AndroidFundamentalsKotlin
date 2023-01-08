package com.example.checkboxradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button id is btnOrder.
        btnOrder.setOnClickListener {
            // radioGroup id is rgMeat.
            val checkedMeatRadioButtonId = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cheese = cbCheese.isChecked // to get the current state of the checkbox.
            val onions = cbOnions.isChecked
            val dressing = cbDressing.isChecked
            // put \n to have a line break.
            val orderString = "You ordered a burger with:\n" +
                    // use $ for insertion.
                    // we wants to insert whatever the text of our checked radio button.
                    "${meat.text}" +
                    (if(cheese) "\nCheese" else "") +   // if cheese is checked, insert that cheese string with a line.
                                                        // if it is not checked, don't insert anything.
                    (if(onions) "\nOnions" else "") +
                    (if(dressing) "\nDressing" else "")
            tvOrder.text = orderString
        }
    }
}