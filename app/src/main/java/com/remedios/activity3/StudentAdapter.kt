package com.remedios.activity3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView


class StudentAdapter(private val studentList:ArrayList<StudentData>):RecyclerView.Adapter<StudentAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = studentList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text = currentItem.heading
        holder.tvCourses.text = currentItem.course

    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val titleImage: ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvHeading:TextView = itemView.findViewById(R.id.textView_course)
        val tvCourses:TextView = itemView.findViewById(R.id.textView_course1)

    }
}