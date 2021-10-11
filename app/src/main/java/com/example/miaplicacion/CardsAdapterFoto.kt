package com.example.miaplicacion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_fotos.*

class CardsAdapterFoto(var items: ArrayList<TarjetaFoto>) : RecyclerView.Adapter<CardsAdapterFoto.TarjViewHolder>() {
    lateinit var onClick : (View) -> Unit

    init {
        this.items = items
    }

    class TarjViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private lateinit var Foto : ImageView
        private var textoArriba: TextView
        private var textoAbajo : TextView

        init {
            textoArriba = itemView.findViewById(R.id.textView5)
            textoAbajo = itemView.findViewById(R.id.textView2)
            Foto = itemView.findViewById(R.id.imageView8)
        }

        fun bindTarjeta(t: TarjetaFoto, onClick: (View) -> Unit) = with(itemView) {
            Foto.setImageResource(t.foto)
            textoArriba.setText(t.cadenaArriba)
            textoAbajo.setText(t.cadenaAbajo)
            setOnClickListener { onClick(itemView) }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): TarjViewHolder {
        val itemView = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_fotos, viewGroup, false)
        return TarjViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: TarjViewHolder, pos: Int) {
        val item = items.get(pos)
        viewHolder.bindTarjeta(item, onClick)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}