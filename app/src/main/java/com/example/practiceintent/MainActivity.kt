package com.example.practiceintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputt : EditText =findViewById(R.id.Name)

        var butt : Button =findViewById(R.id.button)

        val one = "is doing mca 2021"

        butt.setOnClickListener {

            val  inn =inputt.text.toString()

            val intent = Intent(this,temp ::class.java)
            intent.putExtra("details",inn)
            intent.putExtra("neww",one)

            startActivity(intent)

        }


    }
}