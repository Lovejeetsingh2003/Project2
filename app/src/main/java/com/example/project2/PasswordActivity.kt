package com.example.project2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class PasswordActivity : AppCompatActivity() {

    lateinit var llPasw : LinearLayout
    lateinit var etNewPsw : EditText
    lateinit var etConPsw : EditText
    lateinit var btnUpdate : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        llPasw = findViewById(R.id.llPasw)
        etNewPsw = llPasw.findViewById(R.id.etNewPsw)
        etConPsw = llPasw.findViewById(R.id.etConPsw)
        btnUpdate = llPasw.findViewById(R.id.btnUpdate)

        btnUpdate.setOnClickListener {
            if(etNewPsw.text.toString().isEmpty())
            {
                etNewPsw.error = "Enter Password"
            }
            else if(etConPsw.text.toString().isEmpty())
            {
                etConPsw.error = "Confirm Password"
            }
            else{
                val Password = etNewPsw.text.toString()
                val Confirm = etConPsw.text.toString()
                if (Password.equals(Confirm)) {
                    Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, FirstPageActivity::class.java)
                    startActivity(intent)
                }
                else{
                    etConPsw.error = "Confirm Password"
                }
            }
        }
    }
}