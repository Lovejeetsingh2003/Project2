package com.example.project2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import com.example.project2.PasswordActivity
import com.example.project2.R

class OtpActivity : AppCompatActivity() {

    lateinit var et1 : EditText
    lateinit var et2 : EditText
    lateinit var et3 : EditText
    lateinit var et4 : EditText
    lateinit var btnChange : Button

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)
        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        et3 = findViewById(R.id.et3)
        et4 = findViewById(R.id.et4)
        btnChange = findViewById(R.id.btnChange)

        val intent = intent
        val email = intent.getStringExtra("Email")

        val tvEmail4 = findViewById<TextView>(R.id.tvEmail4)
        tvEmail4.text = "$email"

        et1.doOnTextChanged { text, start, before, count ->
            if((text?.length?:0) > 0) {
                et2.requestFocus()
            }
        }
        et2.doOnTextChanged { text, start, before, count ->
            if((text?.length?:0) > 0){
                et3.requestFocus()
            }
        }
        et3.doOnTextChanged { text, start, before, count ->
            if((text?.length?:0) > 0){
                et4.requestFocus()
            }
        }


        btnChange.setOnClickListener {


            if (et1.text.toString().isEmpty() || et2.text.toString().isEmpty() ||
                et3.text.toString().isEmpty() || et4.text.toString().isEmpty()){
                Toast.makeText(this,"Write Otp",Toast.LENGTH_LONG).show()
            }
            else {
                val One = et1.text.toString()
                val two = et2.text.toString()
                val three = et3.text.toString()
                val four = et4.text.toString()

                val otp = One + two + three + four
                if (otp == "1234")
                {
                    Toast.makeText(this, "Change Password", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, PasswordActivity::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this,"OTP Incorrect",Toast.LENGTH_LONG).show()
                }

            }

        }
    }
}