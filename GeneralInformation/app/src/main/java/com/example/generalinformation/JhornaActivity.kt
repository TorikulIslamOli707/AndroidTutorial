package com.example.generalinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class JhornaActivity : AppCompatActivity() {
    lateinit var jhornaTxtVar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jhorna)

        jhornaTxtVar = findViewById(R.id.jhornaTxtId)

        jhornaTxtVar.text = "Jhorna Khan \n\nId: 0123459\n\nOccupation: House Wife\n\nHobby: Cooking"
    }
}