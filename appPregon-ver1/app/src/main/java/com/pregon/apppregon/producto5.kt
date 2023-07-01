package com.pregon.apppregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class producto5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto5)

        val volver5=findViewById<Button>(R.id.atras5)
        volver5.setOnClickListener {
            val lanzar = Intent(this, catalogo::class.java)
            startActivity(lanzar)
        }
    }
}