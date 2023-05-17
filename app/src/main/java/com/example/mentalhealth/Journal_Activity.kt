package com.example.mentalhealth

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Journal_Activity : AppCompatActivity() {
     lateinit var titleEditText:EditText
     lateinit var contentEditText: EditText
     lateinit var saveButton:Button
    lateinit var txanswer:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_journal)

        titleEditText = findViewById(R.id.TitleEditText)
        contentEditText = findViewById(R.id.ContentEditText)
        saveButton = findViewById(R.id.SaveButton)
        txanswer=findViewById(R.id.textView2)

        saveButton.setOnClickListener {
            val title = titleEditText.text.toString()
            val content = contentEditText.text.toString()

            if (title.isEmpty()||content.isEmpty()){
                txanswer.text="Please fill in all details"

            }else

            // Implement your logic to save the journal entry (e.g., to a database or file).
            // You can use SQLite, Room, SharedPreferences, or any other storage mechanism.

            // Display a success message or perform any other action after saving the data.
            Toast.makeText(this, "Journal entry saved!", Toast.LENGTH_SHORT).show()
        }
    }
}
