package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    // creating recycler view.
    lateinit var countryRecyclerView: RecyclerView
    lateinit var adapter: StudentAdapter

    var studentName = ArrayList<String>()
    var studentDetails = ArrayList<String>()
    var studentImage = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countryRecyclerView = findViewById(R.id.recyclerViewId)

        // Set the view for recycler.
        countryRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        // adding students name in the student array.
        studentName.add("Al Imran")
        studentName.add("Mohona Sheikh")
        studentName.add("Rahim Mia")

        // adding students details
        studentDetails.add("B.Sc. in Computer Science.")
        studentDetails.add("Studying in Class Nine.")
        studentDetails.add("Searching for something Good.")

        // adding images of the student array.
        studentImage.add(R.drawable.ali)
        studentImage.add(R.drawable.panda)
        studentImage.add(R.drawable.burger)

        adapter = StudentAdapter(studentName, studentDetails, studentImage, this@MainActivity)
        countryRecyclerView.adapter = adapter
    }
}