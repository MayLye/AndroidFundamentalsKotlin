package com.example.services

import android.app.IntentService
import android.content.Intent
import android.util.Log

// Intents service is used to do background work. It will continue to work even our app is minimized.
// It will work on different thread therefore it will not be blocking our UI thread (main thread).

class MyIntentService : IntentService("MyIntentService") {

    init {
        instance = this
    }

    companion object {
        private lateinit var instance: MyIntentService
        var isRunning = false
    }

    @Deprecated("Deprecated in Java")
    override fun onHandleIntent(p0: Intent?) {
        try {
            isRunning = true
            while (isRunning) {
                Log.d("MyIntentService", "Service is running...")
                Thread.sleep(1000)
            }
        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
        }
    }
}