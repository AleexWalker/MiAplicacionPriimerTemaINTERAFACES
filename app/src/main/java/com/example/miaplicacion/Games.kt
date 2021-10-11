package com.example.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_games.*
import kotlinx.android.synthetic.main.activity_preferencias.*

class Games : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games)

        val arrayCheckBox = arrayListOf<CheckBox>()

        arrayCheckBox.add(checkBox2)
        arrayCheckBox.add(checkBox3)
        arrayCheckBox.add(checkBox4)
        arrayCheckBox.add(checkBox5)
        arrayCheckBox.add(checkBox6)
        arrayCheckBox.add(checkBox7)
        arrayCheckBox.add(checkBox8)

        floatingActionButton2.setOnClickListener {
            var string = "Has seleccionado: "
            var validez = false

            for (button in arrayCheckBox) {
                if (button.isChecked) {
                    validez = true
                    string += button.text.toString()
                }
            }

            if (validez)
                Toast.makeText(this, string , Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "No has selecionado ninguna opcion", Toast.LENGTH_SHORT).show()
        }
    }
}