package com.example.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val recView = findViewById<RecyclerView>(R.id.recyclerView2)

        recView.setHasFixedSize(true)
        recView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        val itemsFotos = ArrayList<TarjetaFoto>()
        itemsFotos.add(TarjetaFoto(R.string.nota18 , R.string.nota17 , R.mipmap.ic_ballena_foreground))
        itemsFotos.add(TarjetaFoto(R.string.nota20 , R.string.nota19 , R.mipmap.ic_girasol_foreground))
        itemsFotos.add(TarjetaFoto(R.string.nota22 , R.string.nota21 , R.mipmap.ic_bosque_foreground))
        itemsFotos.add(TarjetaFoto(R.string.nota24 , R.string.nota23 , R.mipmap.ic_desierto_foreground))
        itemsFotos.add(TarjetaFoto(R.string.nota26 , R.string.nota25 , R.mipmap.ic_rio_foreground))
        itemsFotos.add(TarjetaFoto(R.string.nota28 , R.string.nota27 , R.mipmap.ic_arbol_foreground))
        itemsFotos.add(TarjetaFoto(R.id.textView5 , R.id.textView2 , R.mipmap.ic_tucan_foreground))
        itemsFotos.add(TarjetaFoto(R.id.textView5 , R.id.textView2 , R.mipmap.ic_tortuga_foreground))

        val adaptador = CardsAdapterFoto(itemsFotos)
        recView.adapter = adaptador
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        adaptador.onClick = {
            Toast.makeText(this, ""+ resources.getString(itemsFotos[recView.getChildAdapterPosition(it)].cadenaAbajo), Toast.LENGTH_LONG).show()
        }
    }

}