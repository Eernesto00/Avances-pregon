package com.pregon.apppregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class carrito : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        val boton2=findViewById<Button>(R.id.buttonvolver)
        boton2.setOnClickListener {
            val lanzar = Intent(this,catalogo::class.java)
            startActivity(lanzar)
        }

    }
}

