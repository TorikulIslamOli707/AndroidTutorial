package com.example.generalinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AliActivity : AppCompatActivity() {
    lateinit var aliTxtVar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ali)

        aliTxtVar = findViewById(R.id.aliTxtId)
        aliTxtVar.text = "S.M Al Imran \n\nId: 0219050120323\n\nClass: Varsity 1st year\n\nHobby: Reading"
    }
}