package com.example.generalinformation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var listViewVariable: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listViewVariable = findViewById(R.id.listViewId)

        var names = resources.getStringArray(R.array.names)
        var arAdapter = ArrayAdapter(this,
            R.layout.design_layout,
            names)

        listViewVariable.adapter = arAdapter

        listViewVariable.setOnItemClickListener{parent, view, position, id->
            if(names[position] == "Al Imran"){
                startActivity(Intent(this@MainActivity, AliActivity::class.java))
            }else if (names[position] == "Jhorna Khan"){
                startActivity(Intent(this@MainActivity, JhornaActivity::class.java))
            }else if (names[position] == "Mohona Sheikh"){
                startActivity(Intent(this@MainActivity, MohonaActivity::class.java))
            }

        }
    }
}