package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 : Button=findViewById(R.id.button)
        val button2 : Button=findViewById(R.id.button2)
        val button3 : Button=findViewById(R.id.button3)
        val button4 : Button=findViewById(R.id.button4)

        button1.setOnClickListener(View.OnClickListener {

        })
    }








}