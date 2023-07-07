package com.pregon.elpregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Catalogo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)
    }
    fun atras(view: View){
        val intent= Intent(this,MainActivity::class.java).apply {  }
        startActivity(intent)
    }
    fun prod_uno (view: View){
        val intent= Intent(this, Producto_uno::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_dos (view: View){
        val intent= Intent(this, Producto_dos::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_tres (view: View){
        val intent= Intent(this, Producto_tres::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_cuatro (view: View){
        val intent= Intent(this, Producto_cuatro::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_cinco (view: View){
        val intent= Intent(this, Producto_cinco::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_seis (view: View){
        val intent= Intent(this, Producto_seis::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_siete (view: View){
        val intent= Intent(this, Producto_siete::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_ocho (view: View){
        val intent= Intent(this, Producto_ocho::class.java).apply {  }
        startActivity(intent)
        }
    }