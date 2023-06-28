package com.pregon.apppregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class addproducto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addproducto)

        val seguridadvolver=findViewById<Button>(R.id.salir)
        seguridadvolver.setOnClickListener {
            val lanzar = Intent(this, seguridad::class.java)
            startActivity(lanzar)
        }

    }
}