package com.pregon.apppregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class producto2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto2)

        val volver2=findViewById<Button>(R.id.atras2)
        volver2.setOnClickListener {
            val lanzar = Intent(this, catalogo::class.java)
            startActivity(lanzar)
        }

    }
}