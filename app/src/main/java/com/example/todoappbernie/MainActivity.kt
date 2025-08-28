package com.example.todoappbernie

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val listOfTasks = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // 1.Let's detect when the user clicks on the add button
        // findViewById<Button>(R.id.button).setOnClickListener {  it:View!
        // Code In here is going to be executed when the user clicks on a button
        Log.i("tajusteb-alt", "User clickled on button")
    }

    listOfTasks.add("Do laundry")
    listOfTasks.add("Go for a walk")

    //Look up recyclerview in layout
    val recyclerView = findViewById<recycleView>(R.id.recycleView)
    // Create adapter passing in the sample user data
    val adapter = TaskItemAdapter(listOfTasks)

}
