package com.example.mvvmproject_1.view

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmproject_1.R
import com.example.mvvmproject_1.viewmodel.EditProfileActivityViewModel

class EditProfileActivity :AppCompatActivity() {
    private var image_view: ImageView?=null
    private var etFullName: EditText? = null
    private var etEmail: EditText? = null
    private var etPhone: EditText?= null
    private var etAddress: EditText?=null
    private var btnUpdateProfile: AppCompatButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_profile_activity)
        val editProfileActivityViewModel: EditProfileActivityViewModel = ViewModelProvider(this).get<EditProfileActivityViewModel>(EditProfileActivityViewModel::class.java)

        image_view = findViewById(R.id.image_view) as ImageView
        etFullName = findViewById(R.id.etFullName) as EditText
        etEmail = findViewById(R.id.etEmail) as EditText
        etPhone = findViewById(R.id.etPhone) as EditText
        etAddress = findViewById(R.id.etAddress) as EditText
        btnUpdateProfile = findViewById(R.id.btnUpdateProfile) as AppCompatButton

    }
}