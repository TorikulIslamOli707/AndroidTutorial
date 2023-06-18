package com.example.viewbinding

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingVar: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingVar = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingVar.root

        setContentView(view)

        bindingVar.pressBtnId.setOnClickListener{
            bindingVar.txtViewId.text = bindingVar.editTxtId.text.toString()
        }
    }
}