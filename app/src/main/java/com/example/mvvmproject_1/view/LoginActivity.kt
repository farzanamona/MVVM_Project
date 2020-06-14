package com.example.mvvmproject_1.view


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmproject_1.R
import com.example.mvvmproject_1.viewmodel.LoginActivityViewModel


class LoginActivity : AppCompatActivity() {
    private var context: Context? = null
    private var btnSignin: AppCompatButton? = null
    var etEmail: EditText? = null
    var etPass: EditText? = null

    private var email: String? = null
    private var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        val loginActivityViewModel: LoginActivityViewModel = ViewModelProvider(this).get<LoginActivityViewModel>(LoginActivityViewModel::class.java)

        btnSignin = findViewById(R.id.btnSignin)as AppCompatButton
        etEmail = findViewById(R.id.etEmail)as EditText
        etPass = findViewById(R.id.etPass)as EditText
        btnSignin!!.setOnClickListener{
            startActivity(Intent(context, RegisterActivity::class.java))
//            email = etEmail!!.text.toString()
//            password = etPass!!.text.toString()

            //loginActivityViewModel.passEmailValidateion()

        }
    }



}