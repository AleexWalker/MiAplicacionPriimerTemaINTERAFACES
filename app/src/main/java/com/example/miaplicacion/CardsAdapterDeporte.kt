package com.example.miaplicacion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_fotos.*

class CardsAdapterDeporte(var items: ArrayList<TarjetaDeportes>) : RecyclerView.Adapter<CardsAdapterDeporte.TarjViewHolder>() {
    lateinit var onClick : (View) -> Unit
    //lateinit var suggestionList : List<CheckBox>

    init {
        this.items = items
    }

    class TarjViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private lateinit var FotoDeportes : ImageView
        private lateinit var checkBoxSeleccion : CheckBox

        init {
            checkBoxSeleccion = itemView.findViewById(R.id.checkBox)
            FotoDeportes = itemView.findViewById(R.id.imageView15)
        }

        fun bindTarjeta(t: TarjetaDeportes, onClick: (View) -> Unit) = with(itemView) {
            FotoDeportes.setImageResource(t.imagenDeportes)
            checkBoxSeleccion.setText(t.checkBox)

            setOnClickListener { onClick(itemView) }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): TarjViewHolder {
        val itemView = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_deportes, viewGroup, false)
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