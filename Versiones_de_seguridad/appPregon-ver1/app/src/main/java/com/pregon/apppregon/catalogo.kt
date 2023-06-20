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
    }
}