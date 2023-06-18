package com.example.applicationlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var standardServiceBtnVar: Button
    lateinit var jobIntentBtnVar: Button
    lateinit var stopBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        standardServiceBtnVar = findViewById(R.id.standardServiceId)
        jobIntentBtnVar = findViewById(R.id.jobIntentBtnId)
        stopBtn = findViewById(R.id.stopBtnId)

        standardServiceBtnVar.setOnClickListener{
            var intentVar = Intent(this@MainActivity, ClassicService::class.java)
            startService(intentVar)
        }
        jobIntentBtnVar.setOnClickListener{

        }
        stopBtn.setOnClickListener{
            var intentVar = Intent(this@MainActivity, ClassicService::class.java)
            stopService(intentVar)
        }
    }
}