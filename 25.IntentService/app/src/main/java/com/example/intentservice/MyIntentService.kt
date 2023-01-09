package com.example.intentservice

import android.app.IntentService
import android.content.Intent
import android.util.Log

// Intents service is used to do background work. It will continue to work even our app is minimized.
// It will work on different thread therefore it will not be blocking our UI thread (main thread).

class MyIntentService : IntentService("MyIntentService") {

    init {
        instance = this
    }

    // companion object allows you to have properties or functions without having an instance of the class.
    companion object {
        // lateinit is used to declare those variables that are guaranteed to be initialized in the future.
        private lateinit var instance: MyIntentService
        var isRunning = false

        fun stopService() {
            Log.d("MyIntentService", "Service is stopping...")
            isRunning = false
            // this instance is the instance of our account service class.
            instance.stopSelf()
        }
    }

    @Deprecated("Deprecated in Java")
    // onHandleIntent() allows you to perform a long running task, for example, waiting for something to happen.
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