package com.example.webapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    lateinit var webVariable: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webVariable = findViewById(R.id.webId)
        webVariable.loadUrl("https://www.youtube.com/")
    }

    override fun onBackPressed(){
        if (webVariable.canGoBack()){
            webVariable.goBack()
        }else{
            super.onBackPressed()
        }
    }
}