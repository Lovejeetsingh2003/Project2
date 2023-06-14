package com.example.project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class LoginPageActivity : AppCompatActivity() {

    lateinit var llLogin : LinearLayout
    lateinit var etUsername : EditText
    lateinit var etPassword : EditText
    lateinit var tvForget : TextView
    lateinit var llLogin1 : LinearLayout
    lateinit var btnLogin1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        llLogin = findViewById(R.id.llLogin)
        etUsername = llLogin.findViewById(R.id.etUsername)
        etPassword = llLogin.findViewById(R.id.etPassword)
        tvForget = llLogin.findViewById(R.id.tvForget)
        llLogin1 = llLogin.findViewById(R.id.llLogin1)
        btnLogin1 = llLogin1.findViewById(R.id.btnLogin1)

        btnLogin1.setOnClickListener {
            if(etUsername.text.toString().isEmpty())
            {
                etUsername.error = "Enter Your Email id"
            }
            else if(etPassword.text.toString().isEmpty())
            {
                etPassword.error = "Enter Password"
            }
            else
            {
                Toast.makeText(this,"Login successfully",Toast.LENGTH_LONG).show()
                val intent = Intent(this,LoginPageActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        tvForget.setOnClickListener {
            val intent = Intent(this,ForgetActivity::class.java)
            startActivity(intent)
        }

    }
}