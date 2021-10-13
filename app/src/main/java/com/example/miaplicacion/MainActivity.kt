package com.example.miaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        
        val titulo = findViewById<TextView>(R.id.textView4)
        titulo.typeface = ResourcesCompat.getFont(this, R.font.courgette_regular)

        button5.setOnClickListener { lanzarNewPlayer() }

        button6.setOnClickListener { lanzarPreferencias() }

        button.setOnClickListener { lanzarGames() }

        button7.setOnClickListener { lanzarAbout() }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_settings)
            lanzarGeneros()
        if (id == R.id.action_deportes)
            lanzarDeportes()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    fun lanzarNewPlayer(){
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }

    fun lanzarGeneros(){
        val i = Intent(this, Generos::class.java)
        startActivity(i)
    }

    fun lanzarPreferencias(){
        val i = Intent(this, Preferencias::class.java)
        startActivity(i)
    }

    fun lanzarGames(){
        val i = Intent(this, Games::class.java)
        startActivity(i)
    }

    fun lanzarAbout(){
        val i = Intent(this, About::class.java)
        startActivity(i)
    }

    fun lanzarDeportes(){
        val i = Intent(this, Deportes::class.java)
        startActivity(i)
    }
}