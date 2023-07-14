package com.pregon.elpregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

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
        val intent= Intent(this, Producto1::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_dos (view: View){
        val intent= Intent(this, Producto2::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_tres (view: View){
        val intent= Intent(this, Producto3::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_cuatro (view: View){
        val intent= Intent(this, Producto4::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_cinco (view: View){
        val intent= Intent(this, Producto5::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_seis (view: View){
        val intent= Intent(this, Producto6::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_siete (view: View){
        val intent= Intent(this, Producto7::class.java).apply {  }
        startActivity(intent)
        }
    fun prod_ocho (view: View){
        val intent= Intent(this, Producto8::class.java).apply {  }
        startActivity(intent)
        }

    fun prod_9 (view: View){
        val intent= Intent(this, Producto9::class.java).apply {  }
        startActivity(intent)
    }

    fun prod_10 (view: View){
        val intent= Intent(this, Producto10::class.java).apply {  }
        startActivity(intent)
    }
    }