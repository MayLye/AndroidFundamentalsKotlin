package com.androiddevs.savingdata

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val isAdult = cbAdult.isChecked

            editor.apply {
                putString("name", name)
                putInt("age", age)
                putBoolean("isAdult", isAdult)
                // commit()
                // prefer to use apply() so it can run asynchronously so it won't block your main thread.
                apply()
            }
        }

        btnLoad.setOnClickListener {
            // put 'null' in case name doesn't exist, then the name will be null.
            // Shared Preferences allow the activities or applications to store and retrieve data in the form of key and value.
            val name = sharedPref.getString("name", null)
            val age = sharedPref.getInt("age", 0)
            val isAdult = sharedPref.getBoolean("isAdult", false)

            etName.setText(name)
            etAge.setText(age.toString())
            cbAdult.isChecked = isAdult
        }
    }
}