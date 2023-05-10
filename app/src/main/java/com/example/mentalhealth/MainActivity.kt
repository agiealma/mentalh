package com.example.mentalhealth

//import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
//import com.example.mentalhealth.R.id.etSEmailAddress
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    lateinit var EdtEmail: EditText
    lateinit var Edtpass: EditText
    lateinit var Edtconfirmpass: EditText
    lateinit var Btnsignup: Button
    lateinit var TvDirectLogin: TextView
    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        EdtEmail = findViewById(R.id.etSEmailAddress)
        Edtpass = findViewById(R.id.etSPassword)
        Edtconfirmpass = findViewById(R.id.etSConfPassword)
        Btnsignup = findViewById(R.id.btnSSigned)
        TvDirectLogin = findViewById(R.id.tvRedirectLogin)
        auth=Firebase.auth

        TvDirectLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        Btnsignup.setOnClickListener {
            SignUpUser()

        }
    }

    private fun SignUpUser() {
        val email = EdtEmail.text.toString()
        val pass = Edtpass.text.toString()
        val confirmpass = Edtconfirmpass.text.toString()

        if (email.isBlank() || pass.isBlank() || confirmpass.isBlank()) {
            Toast.makeText(this, "Please email and password cannot be blank", Toast.LENGTH_LONG)
                .show()
            return

        } else if (pass != confirmpass) {
            Toast.makeText(this, "password do not match", Toast.LENGTH_LONG).show()
            return
        }
        auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Signed Successfully", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Failed to create", Toast.LENGTH_LONG).show()
            }
        }
    }
}

