package com.example.poxuy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)


        val text = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val intent = Intent(this, NewActivity::class.java)

        button.setOnClickListener {
            val resultText1 = editText.text.toString()
            intent.putExtra(NewActivity.INTENT_NAME, resultText1)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val resultText2 = editText.text.toString()
            intent.putExtra(NewActivity.INTENT_NAME, resultText2)
            startActivity(intent)
        }
    }
}