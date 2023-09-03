package com.curso.android.app.practica.finalporpartes

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var txt1: EditText
    private lateinit var txt2: EditText
    private lateinit var textoRta: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt1 = findViewById(R.id.texto1)
        txt2 = findViewById(R.id.texto2)
        textoRta = findViewById(R.id.resultado)
        button = findViewById(R.id.botonComparar)

        button.setOnClickListener {
            onButtonClick()
        }
    }

    private fun onButtonClick() {
        val texto1 = txt1.text.toString()
        val texto2 = txt2.text.toString()

        if (texto1 == texto2) {
            textoRta.text = "LOS TEXTOS COINCIDEN"
        } else {
            textoRta.text = "LOS TEXTOS NO SON COINCIDENTES"
        }
    }
}
