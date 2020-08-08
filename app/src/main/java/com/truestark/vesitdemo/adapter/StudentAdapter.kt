package com.truestark.vesitdemo.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.truestark.vesitdemo.R
import com.truestark.vesitdemo.models.Person

class StudentAdapter(val studentList: List<Person>, val context: Context) : RecyclerView.Adapter<StudentItemViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.student_item_view_llt,parent,false)
        return StudentItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onBindViewHolder(holder: StudentItemViewHolder, position: Int) {
        holder.nameTv.text = "Name: ${studentList[position].name}"
        holder.collegeNameTv.text = "College Name: ${studentList[position].collegeName}"
        holder.deptNameTv.text = "From department: ${studentList[position].department}"
        holder.phNumberTv.text = "Phone number: ${studentList[position].phoneNumber}"

        holder.phNumberTv.setOnClickListener {
            val intentToDial = Intent(Intent.ACTION_DIAL)
            intentToDial.data = Uri.parse("tel:${studentList[position].phoneNumber.toString()}")
            context.startActivity(intentToDial)
        }

    }
}

class StudentItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val nameTv : TextView = itemView.findViewById(R.id.student_name_tv)
    val phNumberTv : TextView = itemView.findViewById(R.id.student_number_tv)
    val deptNameTv : TextView = itemView.findViewById(R.id.student_department_tv)
    val collegeNameTv : TextView = itemView.findViewById(R.id.student_college_tv)
}