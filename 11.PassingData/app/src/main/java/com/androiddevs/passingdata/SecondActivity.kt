package com.androiddevs.passingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // we want to save the name vairable that we put into that intent object in that variable name here and set it equal to intent.
        // getStringExtra() method is for getting the data(key) that is sent by the above method.
        // default value means if sthg went wrong with that intent or if that extra we provided doesn't exist.
        // use CTRL + Q for extra documentation.
        // for String you can return null in Java, but for Int you cannot.

        /* refer below lines of code to Person.class
        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE",0) // in Kotlin, you can make nullable integer.
        val country = intent.getStringExtra("EXTRA_COUNTRY")
        */

        /* we don't need this personString anymore as we already have the Person.class
        val personString = "$name is $age years old and lives in $country"
        tvPerson.text = personString
         */

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        tvPerson.text = person.toString()

    }
}