package com.example.mentalhealth

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Bipolar_Activity : AppCompatActivity() {
    lateinit var txtbipolar: TextView
    lateinit var Txt_first: TextView
    lateinit var Txt_two: TextView
    lateinit var txtclick:TextView
    lateinit var edten: EditText
    lateinit var edtsd: EditText
    lateinit var edtfeel: EditText
    lateinit var edtloss: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bipolar)
        txtbipolar = findViewById(R.id.Textbp)
        Txt_first = findViewById(R.id.Txtfirst)
        Txt_two = findViewById(R.id.Txttwo)
        txtclick=findViewById(R.id.text_click)
        edten = findViewById(R.id.Edt_en)
        edtsd = findViewById(R.id.Edt_sd)
        edtfeel = findViewById(R.id.Edt_Feel)
        edtloss = findViewById(R.id.Edt_Loss)

        txtclick.setOnClickListener {
            val intent=Intent(this,Selfharm_Activity::class.java)
            startActivity(intent)
        }



    }
}