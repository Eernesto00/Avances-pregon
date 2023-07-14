package com.pregon.elpregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class seguridad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seguridad)
    }
    fun validar(view: View){
        val intent= Intent(this,Agregar1::class.java).apply {  }
        startActivity(intent)
    }
    fun volver(view: View){
        val intent= Intent(this,MainActivity::class.java).apply {  }
        startActivity(intent)
    }
}