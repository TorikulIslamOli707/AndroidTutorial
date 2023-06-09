package com.example.intenttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MsgShowActivity : AppCompatActivity() {
    lateinit var showTxtVar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_msg_show)

        showTxtVar = findViewById(R.id.showTxtId)

        var namTxt: String = intent.getStringExtra("username").toString()
        var agTxt: Int = intent.getIntExtra("userage", 0)

        showTxtVar.text = "Your name is: $namTxt\nYour age is: $agTxt"
    }
}
