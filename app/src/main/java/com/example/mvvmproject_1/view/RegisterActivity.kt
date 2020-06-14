package com.example.mvvmproject_1.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmproject_1.R
import com.example.mvvmproject_1.viewmodel.RegisterActivityViewModel

class RegisterActivity : AppCompatActivity() {
    private var context:Context? =null
    private var btnRegister: AppCompatButton? = null
    private var etFullName: EditText? = null
    private var etEmail: EditText? = null
    private var etPhone: EditText?= null
    private var etPass: EditText? = null
    private var etConformPassword: EditText?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)
        //val registerActivityViewModel: RegisterActivityViewModel = ViewModelProvider(this).get<RegisterActivityViewModel>(RegisterActivityViewModel::class.java)

        etFullName = findViewById(R.id.etFullName) as EditText
        etEmail = findViewById(R.id.etEmail) as EditText
        etPhone = findViewById(R.id.etPhone) as EditText
        etPass = findViewById(R.id.etPass) as EditText
        etConformPassword = findViewById(R.id.etConformPassword) as EditText
        btnRegister = findViewById(R.id.btnRegister) as AppCompatButton
        btnRegister!!.setOnClickListener{
            startActivity(Intent(context, DashboardActivity::class.java))
        }


    }

}