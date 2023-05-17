package com.example.mentalhealth

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mentalhealth.R.id.txt_cut

class Selfharm_Activity : AppCompatActivity() {
    lateinit var textharm:TextView
    lateinit var textcut:TextView
    lateinit var textpull:TextView
    lateinit var textburn:TextView
    lateinit var textmisuse:TextView
    lateinit var textpncg:TextView
    lateinit var texthere:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selfharm)
        textharm=findViewById(R.id.Txt_harm)
        textcut=findViewById(txt_cut)
        textpull=findViewById(R.id.txt_pull)
        textburn=findViewById(R.id.txt_burn)
        textmisuse=findViewById(R.id.txt_misuse)
        textpull=findViewById(R.id.txt_punch)
        texthere=findViewById(R.id.txt_here)
        texthere.setOnClickListener {
            val intent=Intent(this,Exercise_Activity::class.java)
            startActivity(intent)

        }


    }
}