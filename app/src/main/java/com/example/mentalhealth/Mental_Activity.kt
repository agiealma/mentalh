package com.example.mentalhealth

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Mental_Activity : AppCompatActivity() {
    lateinit var textone:TextView
    lateinit var texttwo:TextView
    lateinit var textthree:TextView
    lateinit var textfour:TextView
    lateinit var textfive:TextView
    lateinit var textsix:TextView
    lateinit var textseven:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mental)
        textone=findViewById(R.id.txt_me)
        texttwo=findViewById(R.id.txt_men)
        textthree=findViewById(R.id.txt_ment)
        textfour=findViewById(R.id.txt_menta)
        textfive=findViewById(R.id.txt_mental)
        textsix=findViewById(R.id.txt_Mm)
        textseven=findViewById(R.id.txt_Mn)

        textseven.setOnClickListener {
            val intent=Intent(this,Home_Activity::class.java)
            startActivity(intent)
        }
    }
}