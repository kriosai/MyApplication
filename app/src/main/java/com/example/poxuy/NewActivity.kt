package com.example.poxuy

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity() {
    companion object {
        const val INTENT_NAME1 = "button1"
        const val INTENT_NAME2 = "button2"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val text1 = findViewById<TextView>(R.id.textView1)
        val text2 = findViewById<TextView>(R.id.textView2)

        val extra1 = intent.getStringExtra(INTENT_NAME1)
        text1.text = extra1
        val extra2 = intent.getStringExtra(INTENT_NAME2)
        text2.text = extra2
        }
    }