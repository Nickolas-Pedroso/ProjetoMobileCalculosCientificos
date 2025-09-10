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

class exer5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exer5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val temperaturaF = findViewById<EditText>(R.id.editTemperaturaF)
        val botao5 = findViewById<Button>(R.id.btnCalcEx5)
        val resultado5 = findViewById<TextView>(R.id.txtResultEx5)

        // Botão para calcular valores
        botao5.setOnClickListener {
            try {
                val tempF = temperaturaF.text.toString().toDouble()
                val total = (9 * tempF + 160) / 5
                resultado5.text = total.toString()

            } catch (e: Exception) {
                Toast.makeText(this, "Digite um valor válido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}