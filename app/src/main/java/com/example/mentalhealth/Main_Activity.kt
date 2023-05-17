package com.example.mentalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Main_Activity : AppCompatActivity() {
    lateinit var texttologin:TextView
    lateinit var edt_name:EditText
    lateinit var edt_Email:EditText
    lateinit var edt_Pass:EditText
    lateinit var btnsignup:Button
    lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texttologin=findViewById(R.id.Txt_gotoLogin)
        edt_name=findViewById(R.id.Edt_name)
        edt_Email=findViewById(R.id.Edt_email)
        edt_Pass=findViewById(R.id.Edt_pass)
        btnsignup=findViewById(R.id.btn_signup)
        auth= Firebase.auth


        texttologin.setOnClickListener {
            val intent=Intent(this,Login_Activity::class.java)
            startActivity(intent)}

        btnsignup.setOnClickListener {
            signup()
        }

    }
    private fun signup(){
        val email=edt_Email.text.toString()
        val pass=edt_Pass.text.toString()
        if (email.isBlank() || pass.isBlank()){
            Toast.makeText(this,"Please Email and password cant be blank", Toast.LENGTH_LONG).show()
            return}
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
            if (it.isSuccessful){
                Toast.makeText(this,"Signed successfully",Toast.LENGTH_LONG).show()
                finish()
            }else{
                Toast.makeText(this,"Failed to create",Toast.LENGTH_LONG).show()
            }

        }

    }
}