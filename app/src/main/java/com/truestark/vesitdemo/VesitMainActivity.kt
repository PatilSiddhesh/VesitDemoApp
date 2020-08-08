package com.truestark.vesitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import com.truestark.vesitdemo.adapter.StudentAdapter
import com.truestark.vesitdemo.models.Person
import kotlinx.android.synthetic.main.activity_main.*

class VesitMainActivity : AppCompatActivity() {

    val TAG = "VESIT"
    var studentList = mutableListOf<Person>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        prepareList()

        student_list_view.layoutManager = LinearLayoutManager(this)
        student_list_view.adapter = StudentAdapter(studentList,this)

    }


    /**
     * This prepares our list of students
     */
    fun prepareList(){
        val john = Person("John",91919191919,"VES","INFT")
        val jane = Person("Jane",80010101012,"MU","CMPN")
        val edward = Person("Edward",3232323245,"VES","CMPN")
        val joe = Person("Joe",95000,"VES","MECH")
        val raj = Person("Raj",91000,"MU","CMPN")
        val james = Person("James",92000,"VES","CMPN")

        // -- Add people to the list -- //
        studentList.add(john)
        studentList.add(jane)
        studentList.add(edward)
        studentList.add(joe)
        studentList.add(raj)
        studentList.add(james)

        Log.d(TAG,"List is created")

    }
}