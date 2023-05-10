package com.example.mentalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Bipolar_Activity : AppCompatActivity() {
    lateinit var FirstText:TextView
    lateinit var SecondText:TextView
    lateinit var ThirdText:TextView
    lateinit var ButtonBack:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bipolar)
        FirstText=findViewById(R.id.txt_b)
        SecondText=findViewById(R.id.txt_bi)
        ThirdText=findViewById(R.id.txt_bip)
        ButtonBack=findViewById(R.id.Btn_Back_b)

        ButtonBack.setOnClickListener {
            val intent=Intent(this,ButtonBack::class.java)
            startActivity(intent)
        }
    }
}