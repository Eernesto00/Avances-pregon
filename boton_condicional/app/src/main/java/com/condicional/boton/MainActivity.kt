package com.condicional.boton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val confirmar= findViewById<Button>(R.id.confirmar)
        confirmar.setOnClickListener {
            val lanzar = Intent(this, pagina2::class.java)
            startActivity(lanzar)
        }
    }
}