package com.example.applicationlifecycle

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ClassicService: Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("Service", "Service has created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("Service", "Service has Started")
        Log.d("Service Thread", Thread.currentThread().name)
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        Log.d("Service", "Service has Destroyed.")
        super.onDestroy()
    }
}