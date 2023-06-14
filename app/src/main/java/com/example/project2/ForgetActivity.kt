package com.example.project2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import com.example.project2.OtpActivity

class ForgetActivity : AppCompatActivity() {

    lateinit var llForget : LinearLayout
    lateinit var etEmail3 : EditText
    lateinit var btnForget : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget)

        llForget = findViewById(R.id.llForget)
        etEmail3 = llForget.findViewById(R.id.etEmail3)
        btnForget = llForget.findViewById(R.id.btnForget)

        btnForget.setOnClickListener {
            val email = etEmail3.text.toString()
            if(etEmail3.text.toString().isEmpty())
            {
                etEmail3.error = "Enter the Email id"
            }
            else{
                Toast.makeText(this,"Otp Sent",Toast.LENGTH_LONG).show()
                val intent = Intent(this, OtpActivity::class.java)
                intent.putExtra("Email",email)
                startActivity(intent)
                finish()
            }
        }

    }
}