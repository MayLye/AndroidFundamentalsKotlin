package com.example.passingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnApply.setOnClickListener {
            // convert edittext to String
            val name = etName.text.toString()
            // convert edittext to String then to integer
            val age = etAge.text.toString().toInt()
            // convert edittext to String
            val gender = etGender.text.toString()
            val country = etCountry.text.toString()
            val person = Person(name, age, gender, country) // refer to the Person.class

            Intent(this, SecondActivity::class.java).also {
                // to pass data onto the new activities we use key value pairs inside functions.
                // putExtra() generally passes the basic types such as Int, Float, Char, Double, Boolean, String along with IntArray.
                // use CTRL+P to view the data inside the parentheses.
                it.putExtra("EXTRA_PERSON", person) // refer to Person.class

                // the code below no longer needed because we only want to put that person into
                /*
                it.putExtra("EXTRA_NAME", name) // to extract particular name here, EXTRA_NAME is for unique name.
                it.putExtra("EXTRA_AGE", age)
                it.putExtra("EXTRA_GENDER", gender)
                it.putExtra("EXTRA_COUNTRY", country)
                */

                startActivity(it)
            }
        }
    }
}