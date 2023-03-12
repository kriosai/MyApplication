package com.example.poxuy

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity() {
    companion object {
        const val INTENT_NAME = "text"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val button = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.textView)

        val extra = intent.getStringExtra(INTENT_NAME)
        text.text = extra
        }
    }