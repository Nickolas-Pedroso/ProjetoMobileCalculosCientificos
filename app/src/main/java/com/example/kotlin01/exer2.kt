package com.example.kotlin01

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class exer2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exer2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val massa = findViewById<EditText>(R.id.editMassa)
        val acelera = findViewById<EditText>(R.id.editAcelera)
        val botao2 = findViewById<Button>(R.id.btnCalcEx2)
        val resultado2 = findViewById<TextView>(R.id.txtResultEx2)

        // Botão para calcular valores
        botao2.setOnClickListener {
            try {
                val mass = massa.text.toString().toDouble()
                val acel = acelera.text.toString().toDouble()
                val total = mass * acel
                resultado2.text = total.toString()

            } catch (e: Exception) {
                Toast.makeText(this, "Digite um valor válido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}