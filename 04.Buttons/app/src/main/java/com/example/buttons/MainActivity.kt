package com.example.buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

// below kotlin synthetic code can only function if you apply extensions in your gradle plugin. This line of code is for eleminating findviewbyid.
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // in Java, we need to write findViewByID(). But in Kotlin, we can remove findViewById() as we can directly call the button by its ID.
        // We do need to import the button with bthApply as it's is to be used here. Press ALT+ENTER.
        btnApply.setOnClickListener {
            // onClickListener can be applied to all kinds of views so you can listen to onClick events no matter what kind of viewer is.
            // convert text to String by using toString()
            val firstName = etFirstName.text.toString()
            val lastName = etLastName.text.toString()
            val gender = etGender.text.toString()
            val age = etAge.text.toString()
            val birthDate = etBirthDate.text.toString()
            val country = etCountry.text.toString()
            // to find log, you need to import android.util.log. We can now insert the string that we extracted from the Edittext.
            // to insert string here, we add $.
            Log.d("MainActivity", "$firstName $lastName, $gender, $age, born on $birthDate, from $country just applied to the formula.")
            // to view Log.d message, go to Logcat below, type in MainActivity, and you will see the log messages on its right side.
        }


    }

}