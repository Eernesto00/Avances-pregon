package com.pregon.apppregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class producto7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto7)

        val volver7=findViewById<Button>(R.id.atras7)
        volver7.setOnClickListener {
            val lanzar = Intent(this, catalogo::class.java)
            startActivity(lanzar)
        }
    }
}