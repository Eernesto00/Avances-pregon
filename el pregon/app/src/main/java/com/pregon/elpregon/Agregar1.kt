package com.pregon.elpregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Agregar1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar1)
    }
    fun volver1(view: View){
        val intent= Intent(this,seguridad::class.java).apply {  }
        startActivity(intent)}
}