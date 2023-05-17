package com.example.mentalhealth

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Home_Activity : AppCompatActivity() {
    lateinit var Text_home:TextView
    lateinit var Buttonanxiety:Button
    lateinit var Buttonbipolar:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Text_home=findViewById(R.id.Txt_home)
        Buttonanxiety=findViewById(R.id.btn_anx)
        Buttonbipolar=findViewById(R.id.btn_bipolar)

        Buttonanxiety.setOnClickListener {
            val intent=Intent(this,Anxiety_Activity::class.java)
            startActivity(intent)
        }
        Buttonbipolar.setOnClickListener {
            val intent=Intent(this,Bipolar_Activity::class.java)
            startActivity(intent)
        }
        
    }
}