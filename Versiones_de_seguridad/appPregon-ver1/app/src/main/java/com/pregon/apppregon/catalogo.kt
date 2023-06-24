package com.pregon.apppregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class catalogo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)

        val boton1=findViewById<Button>(R.id.btncarro)
        boton1.setOnClickListener {
            val lanzar = Intent(this,carrito::class.java)
            startActivity(lanzar)
        }

        val botondetalles=findViewById<Button>(R.id.detalles)
        botondetalles.setOnClickListener {
            val lanzar = Intent(this, producto::class.java)
            startActivity(lanzar)
        }

        val botondetalles2=findViewById<Button>(R.id.detalles2)
        botondetalles2.setOnClickListener {
            val lanzar = Intent(this, producto2::class.java)
            startActivity(lanzar)
        }

        val botondetalles3=findViewById<Button>(R.id.detalles3)
        botondetalles3.setOnClickListener {
            val lanzar = Intent(this, producto3::class.java)
            startActivity(lanzar)
        }

        val botondetalles4=findViewById<Button>(R.id.detalles4)
        botondetalles4.setOnClickListener {
            val lanzar = Intent(this, producto4::class.java)
            startActivity(lanzar)
        }

        val botondetalles5=findViewById<Button>(R.id.detalles5)
        botondetalles5.setOnClickListener {
            val lanzar = Intent(this, producto5::class.java)
            startActivity(lanzar)
        }

        val botondetalles6=findViewById<Button>(R.id.detalles6)
        botondetalles6.setOnClickListener {
            val lanzar = Intent(this, producto6::class.java)
            startActivity(lanzar)
        }

        val botondetalles7=findViewById<Button>(R.id.detalles7)
        botondetalles7.setOnClickListener {
            val lanzar = Intent(this, producto7::class.java)
            startActivity(lanzar)
        }

        val botondetalles8=findViewById<Button>(R.id.detalles8)
        botondetalles8.setOnClickListener {
            val lanzar = Intent(this, producto8::class.java)
            startActivity(lanzar)
        }
    }
}