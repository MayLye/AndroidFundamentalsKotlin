package com.androiddevs.passingdata
import java.io.Serializable

// 'data class' tells Kotlin that the only purpose of this class is to hold data.
data class Person (
    val name: String,
    val age: Int,
    val country: String
) : Serializable // Serialization is the process of reading data from an external source and converting it into a runtime object.


// if we want to be able to send this class btw activities, so to pass this class to an intent object,
// we need to mark this class as 'serializable' so that is just to tell kotlin that we want to be
// able to pass this class to an object that can be transferred btw activities and can be passed to an intent.