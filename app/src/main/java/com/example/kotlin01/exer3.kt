package com.example.kotlin01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class exer3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exer3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val massa = findViewById<EditText>(R.id.editMassa2)
        val veloc = findViewById<EditText>(R.id.editAcelera2)
        val botao3 = findViewById<Button>(R.id.btnCalcEx3)
        val resultado3 = findViewById<TextView>(R.id.txtResultEx3)

        // Botão para calcular valores
        botao3.setOnClickListener {
            try {
                val mass = massa.text.toString().toDouble()
                val acele = veloc.text.toString().toDouble()
                val total = (mass * (acele * acele)) / 2
                resultado3.text = total.toString()

            } catch (e: Exception) {
                Toast.makeText(this, "Digite um valor válido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}