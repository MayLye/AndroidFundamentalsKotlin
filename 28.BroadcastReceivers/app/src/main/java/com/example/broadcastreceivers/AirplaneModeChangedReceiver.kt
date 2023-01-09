package com.example.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        // ?: check whether is it null, if null it will return, so we won't continue with following statement.
        val isAirplaneModeEnabled = intent?.getBooleanExtra("state", false) ?: return
        if(isAirplaneModeEnabled) {
            Toast.makeText(context, "Airplane Mode enabled", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "Airplane Mode disabled", Toast.LENGTH_LONG).show()
        }
    }
}