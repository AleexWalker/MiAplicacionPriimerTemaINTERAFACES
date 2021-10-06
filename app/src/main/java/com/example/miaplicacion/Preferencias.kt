package com.example.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_preferencias.*

class Preferencias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferencias)

        var option = ""
        var chequed = false

        radioGroup.setOnCheckedChangeListener( object : RadioGroup.OnCheckedChangeListener {

            override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
                val checkedRadioButton = radioGroup.findViewById<RadioButton>(checkedId)
                option = checkedRadioButton.text as String
                chequed = true
            }
        })

        fab2.setOnClickListener {
            if (radioButton.isChecked || radioButton2.isChecked || radioButton3.isChecked || radioButton4.isChecked || radioButton5.isChecked)
                Toast.makeText(getApplicationContext(), option.toString(), Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(getApplicationContext(), "Necesitas elegir una opcion", Toast.LENGTH_SHORT).show()
        }

        rb.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener{ratingBar, rating, fromUser ->
            sb.progress = rating.toInt()
        }

        sb.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar , progress: Int, fromUser: Boolean) {
                rb.rating = progress.toFloat()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }
        })
    }
}