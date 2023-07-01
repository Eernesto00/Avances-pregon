package com.pregon.apppregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class producto3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto3)

        val volver3=findViewById<Button>(R.id.atras3)
        volver3.setOnClickListener {
            val lanzar = Intent(this, catalogo::class.java)
            startActivity(lanzar)
        }
    }
}