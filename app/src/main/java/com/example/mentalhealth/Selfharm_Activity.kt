package com.example.mentalhealth

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class Selfharm_Activity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selfharm)
        val listview=findViewById<ListView>(R.id.ListView)
        val names= arrayOf("Pulling out hair", "Punching walls", "Overdosing drugs", "Burning their skin")
        val arrayAdapter:ArrayAdapter<String> =
            ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        listview.adapter=arrayAdapter



    }
}