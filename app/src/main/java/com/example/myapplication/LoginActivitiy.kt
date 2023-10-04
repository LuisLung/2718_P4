package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivitiy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activitiy)

        //instance

        val btnLogin: Button = findViewById(R.id.buttonLogin)

        val txtUsername: EditText = findViewById(R.id.editTextUsername)

        val txtPassword: EditText = findViewById(R.id.editTextPassword)

//event saat button Login click

        btnLogin.setOnClickListener{it: View!

//Login cek

            if(txtUsername.text.toString().equals("stevi") && txtPassword.text.toString().equals("amikom")){

//call homepage

                val intent = Intent( packageContext: this, HomeActivity::class.java) startActivity(intent)

            }else{

                Toast.makeText( context this, text: "Login gagal, cek username dan password", Toast.LENGTH_SHORT).show(

            }

        }

    }
}