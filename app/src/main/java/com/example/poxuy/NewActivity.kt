package com.example.poxuy

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity() {
    companion object {
    //   const val INTENT_NAME1 = "button1"
      // const val INTENT_NAME2 = "load"
    }

    private val file = "SharedPreferences"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val text = findViewById<TextView>(R.id.textView)
        val sharedPreferences = getSharedPreferences(file, Context.MODE_PRIVATE)
        val pulOut = sharedPreferences.getString("key", "Ты гей")
        text.text = pulOut


    //  val sharedPreferences = getSharedPreferences(file, Context.MODE_PRIVATE)


       // val text2 = findViewById<TextView>(R.id.textView2)

        //val extra1 = intent.getStringExtra(INTENT_NAME1)
        //text1.text = extra1
       // val extra2 = intent.getStringExtra(INTENT_NAME2)
       // text2.text = extra2
        }
    }