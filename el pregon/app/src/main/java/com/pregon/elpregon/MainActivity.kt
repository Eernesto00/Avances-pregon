package com.pregon.elpregon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawerlayout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            when(it.itemId) {

                R.id.inicio -> {var intento1 = Intent(this, Catalogo::class.java)
                    startActivity(intento1)}
                //Toast.makeText(this, "Iniciar Catalogo", Toast.LENGTH_LONG).show()//

                R.id.mesa -> {var intento1 = Intent(this, Agregar::class.java)
                    startActivity(intento1)}

                    //Toast.makeText(this, "Agregado", Toast.LENGTH_LONG).show()//
                R.id.soporte -> {var intento1 = Intent(this, Registro::class.java)
                    startActivity(intento1)}
                    //Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_LONG).show()//
                R.id.clave -> Toast.makeText(this, "Bienvenido al Manual", Toast.LENGTH_LONG).show()

            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)){

            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
