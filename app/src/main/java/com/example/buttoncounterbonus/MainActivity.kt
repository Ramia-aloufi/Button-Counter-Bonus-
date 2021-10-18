package com.example.buttoncounterbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    lateinit var btn1: Button
    lateinit var btn2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView)
        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)
        btn1.setOnClickListener { tv.text = "${tv.text.toString().toInt() + 1}" }
        btn2.setOnClickListener { tv.text = "${tv.text.toString().toInt() - 1}" }
    }
}