package com.example.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.get
import  kotlinx.android.synthetic.main.activity_new_player.*

class NewPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_player)

        val telefono = arrayOf("Telefono 1", "Telefono 2", "Telefono 3", "Telefono 4",)
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, telefono)

        spinner.adapter = adaptador
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(applicationContext, parent!!.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
                editTextTextPersonName5.setText(spinner.selectedItem.toString())
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        })
    }
}