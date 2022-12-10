package com.example.practiceintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class temp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp)

        var tempoo :TextView = findViewById(R.id.textView)

        val intent = getIntent()
        val strr = intent.getStringExtra("details")
        val st =intent.getStringExtra("neww")
        tempoo.text = "$strr   $st"
    }
}