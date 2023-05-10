package com.example.mentalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Anxiety_Activity : AppCompatActivity() {
    lateinit var firsttext:TextView
    lateinit var secondtext:TextView
    lateinit var thirdtext:TextView
    lateinit var buttonback:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anxiety)
        firsttext=findViewById(R.id.Txt_a)
        secondtext=findViewById(R.id.Txt_an)
        thirdtext=findViewById(R.id.Txt_anx)
        buttonback=findViewById(R.id.Btn_back_a)

        buttonback.setOnClickListener {
            val intent=Intent(this,buttonback::class.java)
            startActivity(intent)

        }
    }
}