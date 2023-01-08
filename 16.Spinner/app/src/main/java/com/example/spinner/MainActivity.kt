package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // CTRL+SHIFT+/ to comment out multiple lines.
        // use 'this' to pass context.
        // this@MainActivity for anonymous class.
        // CTRL+I to show the Implement Members. Press on Shift to select more than one implement members.

        // Spinner 1
        val customList = listOf("First", "Second", "Third", "Fourth")
        val adapter = ArrayAdapter<String>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,
            customList)
        spNumbers.adapter = adapter
        spNumbers.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity,
                    "You selected ${parent?.getItemAtPosition(position).toString()}", Toast.LENGTH_LONG).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        // Spinner 2
        spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity,
                    "You selected ${parent?.getItemAtPosition(position).toString()}", Toast.LENGTH_LONG).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }
}