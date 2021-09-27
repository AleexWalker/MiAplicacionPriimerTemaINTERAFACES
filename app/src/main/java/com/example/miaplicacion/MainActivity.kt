package com.example.miaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jugador = findViewById(R.id.button5) as Button
        
        val titulo = findViewById<TextView>(R.id.textView4)
        titulo.typeface = ResourcesCompat.getFont(this, R.font.courgette_regular)

        jugador.setOnClickListener { lanzarNewPlayer() }
        
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            (R.id.action_search) -> {
                Toast.makeText(this, "HOLA SOC EL BOLA", Toast.LENGTH_SHORT).show()
                return true
            }
            (R.id.action_add) -> {return true}
            else -> {return super.onOptionsItemSelected(item)} }
    }

    fun lanzarNewPlayer(){
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }
}