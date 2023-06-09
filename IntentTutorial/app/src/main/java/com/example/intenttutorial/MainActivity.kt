package com.example.intenttutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var nameETxtVar: EditText
    lateinit var ageETxtVar: EditText
    lateinit var sendBtnVar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameETxtVar = findViewById(R.id.nameETxtId)
        ageETxtVar = findViewById(R.id.ageETxtId)
        sendBtnVar = findViewById(R.id.sendBtnId)

        sendBtnVar.setOnClickListener{
            var userName = nameETxtVar.text.toString()
            var userAge = ageETxtVar.text.toString().toInt()

            var intentVar = Intent(this@MainActivity, MsgShowActivity::class.java)

            intentVar.putExtra("username", userName)
            intentVar.putExtra("userage", userAge)

            startActivity(intentVar)
        }
    }
}