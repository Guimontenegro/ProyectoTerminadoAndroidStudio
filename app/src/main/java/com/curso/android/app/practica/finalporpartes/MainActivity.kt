package com.curso.android.app.practica.finalporpartes

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View?) {
        val txt1: EditText = findViewById(R.id.texto1)
        val txt2: EditText = findViewById(R.id.texto2)
        val textoRta: TextView = findViewById(R.id.resultado)

        val texto1 = txt1.text.toString()
        val texto2 = txt2.text.toString()

        if (texto1 == texto2) {
            textoRta.text = "LOS TEXTOS SON IGUALES"
        } else {
            textoRta.text = "LOS TEXTOS NO COINCIDEN"
        }
    }
}
