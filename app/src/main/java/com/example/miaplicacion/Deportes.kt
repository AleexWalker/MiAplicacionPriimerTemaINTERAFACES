package com.example.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_deportes.*
import kotlinx.android.synthetic.main.activity_preferencias.*
import kotlinx.android.synthetic.main.item_deportes.*

class Deportes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deportes)

        val recView = findViewById<RecyclerView>(R.id.recyclerView10)

        recView.setHasFixedSize(true)
        recView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        val itemsDeportes = ArrayList<TarjetaDeportes>()
        itemsDeportes.add(TarjetaDeportes(R.string.baloncesto , R.mipmap.ic_baloncesto_foreground))
        itemsDeportes.add(TarjetaDeportes(R.string.beisbol , R.mipmap.ic_beisbol_foreground))
        itemsDeportes.add(TarjetaDeportes(R.string.ciclismo , R.mipmap.ic_ciclismo_foreground))
        itemsDeportes.add(TarjetaDeportes(R.string.futbol , R.mipmap.ic_futbol_foreground))
        itemsDeportes.add(TarjetaDeportes(R.string.golf , R.mipmap.ic_golf_foreground))
        itemsDeportes.add(TarjetaDeportes(R.string.natacion , R.mipmap.ic_natacion_foreground))
        itemsDeportes.add(TarjetaDeportes(R.string.pinpon , R.mipmap.ic_pinpon_foreground))
        itemsDeportes.add(TarjetaDeportes(R.string.tenis , R.mipmap.ic_tenis_foreground))

        val adaptador = CardsAdapterDeporte(itemsDeportes)

        recView.adapter = adaptador
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        adaptador.onClick = {
            Toast.makeText(this, ""+ resources.getString(itemsDeportes[recView.getChildAdapterPosition(it)].checkBox), Toast.LENGTH_LONG).show()
        }

        floatingActionButton.setOnClickListener {
            //if (checkBox.isChecked
            Toast.makeText(this, ""+ resources.getString(itemsDeportes[recView.getChildAdapterPosition(it)].checkBox), Toast.LENGTH_LONG).show()
        }
    }
}