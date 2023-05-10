package com.example.mentalhealth

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Depression_Activity : AppCompatActivity() {
    lateinit var Firsttext:TextView
    lateinit var Secondtext:TextView
    lateinit var Thirdtext:TextView
    lateinit var Buttonback:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_depression)
        Firsttext=findViewById(R.id.Txt_d)
        Secondtext=findViewById(R.id.Txt_de)
        Thirdtext=findViewById(R.id.Txt_dep)
        Buttonback=findViewById(R.id.btn_back_d)

        Buttonback.setOnClickListener {
            val intent=Intent(this,Buttonback::class.java)
            startActivity(intent)
        }


    }
}