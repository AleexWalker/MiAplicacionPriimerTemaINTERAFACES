package com.example.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_preferencias.*

class Preferencias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferencias)

        var option = ""

        radioGroup.setOnCheckedChangeListener( object : RadioGroup.OnCheckedChangeListener {

            override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
                val checkedRadioButton = radioGroup.findViewById<RadioButton>(checkedId)
                option = checkedRadioButton.text as String
            }
        })

        fab2.setOnClickListener {
            Toast.makeText(getApplicationContext(), option.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}