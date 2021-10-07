package com.example.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.chip.ChipGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_generos.*

class Generos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generos)

        val bottomAppBar = findViewById(R.id.bottom_appbar) as BottomAppBar
        bottomAppBar.replaceMenu(R.menu.menu_main)

        val fab: FloatingActionButton = findViewById(R.id.fab)

        fab.setOnClickListener {
            Snackbar.make(it, "Desplazando el boton" , Snackbar.LENGTH_SHORT).show()
        }

        //chip_group.setOnCheckedChangeListener(object : ChipGroup.OnCheckedChangeListener)

        //}

        val items = ArrayList<Tarjeta>()
        items.add(Tarjeta(R.string.nota1))
        items.add(Tarjeta(R.string.nota2))
        items.add(Tarjeta(R.string.nota3))
        items.add(Tarjeta(R.string.nota4))
        items.add(Tarjeta(R.string.nota5))
        items.add(Tarjeta(R.string.nota6))
        items.add(Tarjeta(R.string.nota7))
        items.add(Tarjeta(R.string.nota8))
        items.add(Tarjeta(R.string.nota9))
        items.add(Tarjeta(R.string.nota10))
        items.add(Tarjeta(R.string.nota11))
        items.add(Tarjeta(R.string.nota12))
        items.add(Tarjeta(R.string.nota13))
        items.add(Tarjeta(R.string.nota14))
        items.add(Tarjeta(R.string.nota15))
        items.add(Tarjeta(R.string.nota16))

        val recView = findViewById<RecyclerView>(R.id.recyclerView1)

        recView.setHasFixedSize(true)

        val adaptador = CardsAdapter(items)
        recView.adapter = adaptador
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        adaptador.onClick = {
            Toast.makeText(this, ""+ items[recView.getChildAdapterPosition(it)].cadena.toString(), Toast.LENGTH_LONG).show()
        }
    }
}