package com.example.applicationlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    lateinit var goBackBtnVar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        goBackBtnVar = findViewById(R.id.goBackBtnId)

        goBackBtnVar.setOnClickListener{
            var secondIntent = Intent(this@SecondActivity, MainActivity::class.java)

            startActivity(secondIntent)
        }

        Log.d("Message:", "Second Oncreate()")
    }
    override fun onResume(){
        super.onResume()
        Log.d("Message", "Second OnResume()")
    }
    override fun onStart(){
        super.onStart()
        Log.d("Message", "Second OnStart()")
    }
    override fun onPause(){
        super.onPause()
        Log.d("Message", "Second OnPause")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d("Message", "Second OnDestroy")
    }
    override fun onStop(){
        super.onStop()
        Log.d("Message", "Second OnStop")
    }
}