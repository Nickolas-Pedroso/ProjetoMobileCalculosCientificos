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

class exer6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exer6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val valorA = findViewById<EditText>(R.id.editValorA)
        val valorB = findViewById<EditText>(R.id.editValorB)
        val valorC = findViewById<EditText>(R.id.editValorC)
        val botao6 = findViewById<Button>(R.id.btnCalcEx6)
        val resultado6 = findViewById<TextView>(R.id.txtResultEx6)

        // Botão para calcular valores
        botao6.setOnClickListener {
            try {
                val ValA = valorA.text.toString().toDouble()
                val ValB = valorB.text.toString().toDouble()
                val ValC = valorC.text.toString().toDouble()
                val total = ValA * ValB * ValC
                resultado6.text = total.toString()

            } catch (e: Exception) {
                Toast.makeText(this, "Digite um valor válido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}