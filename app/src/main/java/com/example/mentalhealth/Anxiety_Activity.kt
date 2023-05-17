package com.example.mentalhealth

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Anxiety_Activity : AppCompatActivity() {
    lateinit var txt_anxiety:TextView
    lateinit var txt_one:TextView
    lateinit var txt_second:TextView
    lateinit var Edt_swt:EditText
    lateinit var Edt_trm:EditText
    lateinit var Edt_feel:EditText
    lateinit var Edt_rpd:EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anxiety)
        txt_anxiety=findViewById(R.id.txtanxiety)
        txt_one=findViewById(R.id.txtone)
        txt_second=findViewById(R.id.txtsecond)
        Edt_swt=findViewById(R.id.edt_swt)
        Edt_trm=findViewById(R.id.edt_trm)
        Edt_feel=findViewById(R.id.edt_feel)
        Edt_rpd=findViewById(R.id.edt_rpd)


    }
}