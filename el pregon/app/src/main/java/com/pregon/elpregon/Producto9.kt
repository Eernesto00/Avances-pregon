package com.pregon.elpregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Producto9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto9)
    }

    fun atras(view: View){
        val intent= Intent(this,Catalogo::class.java).apply {  }
        startActivity(intent)
    }
}