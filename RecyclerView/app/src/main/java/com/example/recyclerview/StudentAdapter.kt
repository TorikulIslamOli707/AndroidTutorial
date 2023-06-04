package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(
    var studentNameClass: ArrayList<String>,
    var studentDetailsClass: ArrayList<String>,
    var studentImageClass: ArrayList<Int>,
    var context: Context
): RecyclerView.Adapter<StudentAdapter.StudentAdapterHolder>(){
    class StudentAdapterHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var studentNameView: TextView = itemView.findViewById(R.id.nameId)
        var studentDetailsView: TextView = itemView.findViewById(R.id.detailsId)
        var studentImageView: ImageView = itemView.findViewById(R.id.aliImgId)
        var cardV: CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapterHolder {
        var view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view, parent, false)

        return StudentAdapterHolder(view)
    }

    override fun getItemCount(): Int {
        return studentNameClass.size
    }

    override fun onBindViewHolder(holder: StudentAdapterHolder, position: Int) {
        holder.studentNameView.text = studentNameClass[position]
        holder.studentDetailsView.text = studentDetailsClass[position]
        holder.studentImageView.setImageResource(studentImageClass[position])

        holder.cardV.setOnClickListener{
            Toast.makeText(context, "You clicked on ${studentNameClass[position]}", Toast.LENGTH_LONG)
                .show()
        }
    }
}