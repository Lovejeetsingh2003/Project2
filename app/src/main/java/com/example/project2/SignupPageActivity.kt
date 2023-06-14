package com.example.project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.LocaleList
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class SignupPageActivity : AppCompatActivity() {

    lateinit var llSignup : LinearLayout
    lateinit var etName : EditText
    lateinit var etEmail1 : EditText
    lateinit var etPhone : EditText
    lateinit var rgReg : RadioGroup
    lateinit var rbFirst : RadioButton
    lateinit var rbSecond : RadioButton
    lateinit var rbThird: RadioButton
    lateinit var etPsw : EditText
    lateinit var etConfirm :EditText
    lateinit var llLogin1 : LinearLayout
    lateinit var btnSignup1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)

        llSignup = findViewById(R.id.llSignup)
        etName = llSignup.findViewById(R.id.etName)
        etEmail1 = llSignup.findViewById(R.id.etEmail1)
        etPhone = llSignup.findViewById(R.id.etPhone)
        rgReg = llSignup.findViewById(R.id.rgReg)
        rbFirst = llSignup.findViewById(R.id.rbFirst)
        rbSecond = llSignup.findViewById(R.id.rbSecond)
        rbThird = llSignup.findViewById(R.id.rbThird)
        etPsw = llSignup.findViewById(R.id.etPsw)
        etConfirm = llSignup.findViewById(R.id.etConfirm)
        llLogin1 = llSignup.findViewById(R.id.llLogin1)
        btnSignup1 = llLogin1.findViewById(R.id.btnSignup1)

        val value1 = etPsw
        val value2 = etConfirm

        btnSignup1.setOnClickListener {
            if(etName.text.toString().isEmpty())
            {
                etName.error = "Enter Your Name"
            }
            else if(etEmail1.text.toString().isEmpty())
            {
                etEmail1.error = "Enter Your Email id"
            }
            else if(etPhone.text.toString().length < 10)
            {
                etPhone.error = "Enter Your Phone Number"
            }
            else if(etPsw.text.toString().isEmpty())
            {
                etPsw.error = "Enter Password"
            }
            else if(etConfirm.text.toString().isEmpty())
            {
                etConfirm.error = "Confirm Password"
            }
            else{
                val value1 = etPsw.text.toString()
                val value2 = etConfirm.text.toString()
                if(value1 == value2)
                    {
                    Toast.makeText(this, "Sign Up", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, LoginPageActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                else{
                    etConfirm.error = "Confirm Password"
                }
            }
        }
    }
}