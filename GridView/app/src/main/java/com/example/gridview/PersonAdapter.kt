package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.NonDisposableHandle.parent

class PersonAdapter(
    var con: Context,
    var txtViewCdf: ArrayList<String>,
    var imgViewCdf: ArrayList<Int>
): BaseAdapter() {
    override fun getCount(): Int{
        return txtViewCdf.size
    }

    override fun getItem(p0: Int): Any?{
        return null
    }

    override fun getItemId(p0: Int): Long{
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View{
        var view: View = LayoutInflater.from(p2!!.context)
            .inflate(R.layout.grid_custom_view, p2, false)

        var studentName: TextView = view.findViewById(R.id.txtVeiw)
        var img: ImageView = view.findViewById(R.id.imgId)

        studentName.text = txtViewCdf[p0]
        img.setImageResource(imgViewCdf[p0])

        return view
    }
}