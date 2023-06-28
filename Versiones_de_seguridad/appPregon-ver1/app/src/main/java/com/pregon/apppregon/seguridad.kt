package com.pregon.apppregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class seguridad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_seguridad)

        val cancelar = findViewById<Button>(R.id.btncancel)
        cancelar.setOnClickListener {
            val lanzar=Intent(this, catalogo::class.java)
            startActivity(lanzar)
        }

        val validar = findViewById<Button>(R.id.validar)
        validar.setOnClickListener {
            val lanzar=Intent(this, addproducto::class.java)
            startActivity(lanzar)
        }



    }
}