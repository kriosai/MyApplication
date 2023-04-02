package com.example.poxuy

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity() {
    companion object {
    }

    private val file = "SharedPreferences"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val text = findViewById<TextView>(R.id.textView)
        val sharedPreferences = getSharedPreferences(file, Context.MODE_PRIVATE)
        val pulOut = sharedPreferences.getString("key", "Ты гей")
        text.text = pulOut

        }
    }