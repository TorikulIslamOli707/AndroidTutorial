package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var lstView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lstView = findViewById(R.id.lstVw)

        var products = resources.getStringArray(R.array.products)
        var arAdapter = ArrayAdapter(this, R.layout.my_text, products)

        lstView.adapter = arAdapter

        lstView.setOnItemClickListener{parent, view, position, id ->
            val productName = parent.getItemAtPosition(position).toString()

            Toast.makeText(applicationContext, "You selected ${productName}", Toast.LENGTH_LONG).show()
        }
    }
}