package com.example.project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class FirstPageActivity : AppCompatActivity() {
    lateinit var llBtn : LinearLayout
    lateinit var btnLogin : Button
    lateinit var btnSignup : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)

        llBtn = findViewById(R.id.llBtn)
        btnLogin = llBtn.findViewById(R.id.btnLogin)
        btnSignup = llBtn.findViewById(R.id.btnSignup)

        btnLogin.setOnClickListener {
            Toast.makeText(this,"Log In" , Toast.LENGTH_LONG).show()
            val intent = Intent(this,LoginPageActivity::class.java)
            startActivity(intent)
        }
        btnSignup.setOnClickListener {
            Toast.makeText(this,"Sign Up" , Toast.LENGTH_LONG).show()
            val intent = Intent(this,SignupPageActivity::class.java)
            startActivity(intent)
        }
    }
}