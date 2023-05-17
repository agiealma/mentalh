package com.example.mentalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login_Activity : AppCompatActivity() {
    lateinit var edt_email: EditText
    lateinit var edt_pass: EditText
    lateinit var btnlogin: Button
    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        edt_email = findViewById(R.id.Edt_loginEmail)
        edt_pass = findViewById(R.id.Edt_loginPassword)
        auth = FirebaseAuth.getInstance()
        btnlogin = findViewById(R.id.btn_login)

        btnlogin.setOnClickListener {
            login()
        }


    }

    private fun login() {
        val email = edt_email.text.toString()
        val pass = edt_pass.text.toString()
        // calling signInWithEmailAndPassword(email, pass)
        // function using Firebase auth object
        // On successful response Display a Toast
        auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Successfully LoggedIn", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Mental_Activity::class.java)
                startActivity(intent)
            } else
                Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()
        }
    }
}