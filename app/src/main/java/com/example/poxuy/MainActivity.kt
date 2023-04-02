package com.example.poxuy

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val file = "SharedPreferences"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = getSharedPreferences(file, Context.MODE_PRIVATE)
        val edit = sharedPreferences.edit()



        val save = findViewById<Button>(R.id.save)
        val editText = findViewById<EditText>(R.id.editText)
        val load = findViewById<Button>(R.id.load)
        val intent = Intent(this, NewActivity::class.java)


        save.setOnClickListener {
            val textSave = editText.text.toString()
            edit.putString("key", textSave).apply()
        }
        load.setOnClickListener {
            sharedPreferences.getString("key", "Ты гей")
            startActivity(intent)
        }

    }
}