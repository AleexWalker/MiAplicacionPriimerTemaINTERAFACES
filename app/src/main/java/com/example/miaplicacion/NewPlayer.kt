package com.example.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import  kotlinx.android.synthetic.main.activity_new_player.*

class NewPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_player)

        val telefono = arrayOf("Telefono 1", "Telefono 2", "Telefono 3", "Telefono 4",)
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, telefono)

        spinner.adapter = adaptador


    }
}