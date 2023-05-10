package com.example.mentalhealth

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PTSD_Activity : AppCompatActivity() {
    lateinit var firstText:TextView
    lateinit var secondText:TextView
    lateinit var thirdText:TextView
    lateinit var buttonBack:Button
    lateinit var buttonNext:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ptsd)
        firstText=findViewById(R.id.Txt_p)
        secondText=findViewById(R.id.Txt_pt)
        thirdText=findViewById(R.id.Txt_pts)
        buttonBack=findViewById(R.id.btn_back_p)
        buttonNext=findViewById(R.id.btn_next)

        buttonBack.setOnClickListener {
            val intent=Intent(this,buttonBack::class.java)
            startActivity(intent)
        }
        buttonNext.setOnClickListener {
            val intent=Intent(this,buttonNext::class.java)
            startActivity(intent)
        }
    }
}