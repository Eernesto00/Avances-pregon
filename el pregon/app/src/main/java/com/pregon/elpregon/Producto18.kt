package com.pregon.elpregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Producto18 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto18)
    }
    fun atras(view: View){
        val intent= Intent(this,Catalogo::class.java).apply {  }
        startActivity(intent)
    }
}