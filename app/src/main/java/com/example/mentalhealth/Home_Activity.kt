package com.example.mentalhealth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Home_Activity : AppCompatActivity() {
    lateinit var Text_home:TextView
     lateinit var Buttondepression:Button
     lateinit var Buttonanxiety:Button
     lateinit var Buttonbipolar:Button
     lateinit var Buttonptsd:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Text_home=findViewById(R.id.Txt_home)
       Buttondepression=findViewById(R.id.Btn_Dprss)
        Buttonanxiety=findViewById(R.id.Btn_Anx)
        Buttonbipolar=findViewById(R.id.Btn_Bp)
        Buttonptsd=findViewById(R.id.Btn_Ptsd)

        Buttondepression.setOnClickListener {
    val intent=Intent(this,Depression_Activity::class.java)
            startActivity(intent)
        }
        Buttonanxiety.setOnClickListener {
            val intent=Intent(this,Anxiety_Activity::class.java)
            startActivity(intent)
        }
        Buttonbipolar.setOnClickListener {
            val intent=Intent(this,Bipolar_Activity::class.java)
        }
        Buttonptsd.setOnClickListener {
            val intent=Intent(this,PTSD_Activity::class.java)
        }
    }
}