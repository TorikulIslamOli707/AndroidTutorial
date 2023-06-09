package com.example.generalinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MohonaActivity : AppCompatActivity() {
    lateinit var mohonaImgVar: ImageView
    lateinit var mohonaTxtVar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mohona)

        mohonaTxtVar = findViewById(R.id.mohonaTxtId)

        mohonaTxtVar.text = "Mohona Sheikh \n\nId: 02190501\n\nClass: 9 (IX)\n\nHobby: None"
    }
}