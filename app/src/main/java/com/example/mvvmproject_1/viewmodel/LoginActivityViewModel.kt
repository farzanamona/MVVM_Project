package com.example.mvvmproject_1.viewmodel

import android.content.Context
import android.text.TextUtils
import androidx.lifecycle.ViewModel
import com.example.mvvmproject_1.utils.AlertMessage

class LoginActivityViewModel : ViewModel() {
    var context: Context? = null
    private var email: String? = null
    private var password: String? = null

    fun passEmailValidateion(){

        if(TextUtils.isEmpty(email)){
            //Toast.makeText(applicationContext,"Email is empty",Toast.LENGTH_SHORT).show()
            context?.let { it1 -> AlertMessage.showMessage(it1,"Alert!","Email is empty!") }
        }else if(!isEmailValid(email!!)){
            context?.let { it1 -> AlertMessage.showMessage(it1,"Alert!","Input a valid email!") }

        }else if(TextUtils.isEmpty(password)){
            context?.let { it1 -> AlertMessage.showMessage(it1,"Alert!","Password is empty!") }

        }else{
            //login(email!!, password!!);

        }
    }
    fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

}