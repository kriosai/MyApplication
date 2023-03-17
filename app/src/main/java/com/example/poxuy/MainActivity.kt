package com.example.poxuy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val resultText1 = "Кнопка 1"
        val resultText2 = "Кнопка 2"

        val intent1 = Intent(this, NewActivity::class.java)
        val intent2 = Intent(this, NewActivity::class.java)

        button1.setOnClickListener {
            intent1.putExtra(NewActivity.INTENT_NAME1,resultText1)
            startActivity(intent1)
        }
        button2.setOnClickListener {
            intent2.putExtra(NewActivity.INTENT_NAME2,resultText2)
            startActivity(intent2)
        }
    }
}