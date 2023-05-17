package com.example.mentalhealth

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Exercise_Activity : AppCompatActivity() {
    lateinit var txtchange:TextView
    lateinit var txtlisten:TextView
    lateinit var txtcry:TextView
    lateinit var txturges:TextView
    lateinit var txthold:TextView
    lateinit var txtmove:TextView
    lateinit var txtjournal:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)
        txtchange=findViewById(R.id.txt_change)
        txtlisten=findViewById(R.id.txt_listen)
        txtcry=findViewById(R.id.txt_cry)
        txturges=findViewById(R.id.txt_urges)
        txthold=findViewById(R.id.txt_hold)
        txtmove=findViewById(R.id.txt_move)
        txtjournal=findViewById(R.id.txt_journal)
        txtjournal.setOnClickListener {
            val intent=Intent(this,Journal_Activity::class.java)
            startActivity(intent)
        }
    }
}