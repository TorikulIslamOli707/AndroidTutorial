package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var gridViewCdf: GridView
    var titleImageCdf = ArrayList<String>()
    var imageCdf = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridViewCdf = findViewById(R.id.gridXId)

        fillArrays()

        var gdAdapter = PersonAdapter(this, titleImageCdf, imageCdf)
        gridViewCdf.adapter = gdAdapter

        gridViewCdf.setOnItemClickListener { _, _, position, _ ->

            Toast.makeText(applicationContext,"You selected the ${titleImageCdf[position]}"
                ,Toast.LENGTH_LONG).show()

        }

    }

    fun fillArrays(){
        titleImageCdf.add("Ali")
        titleImageCdf.add("Burger")
        titleImageCdf.add("Panda")

        imageCdf.add(R.drawable.ali)
        imageCdf.add(R.drawable.burger)
        imageCdf.add(R.drawable.panda)
    }
}

private fun GridView.setOnClickListener(function: (View, Any?, Any?, Any?) -> Unit) {

}
