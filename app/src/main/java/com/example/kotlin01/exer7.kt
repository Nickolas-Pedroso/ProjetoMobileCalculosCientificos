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

class exer7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exer7)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val editV0 = findViewById<EditText>(R.id.editV0)
        val editA = findViewById<EditText>(R.id.editA)
        val editDeltaS = findViewById<EditText>(R.id.editDeltaS)
        val botao7 = findViewById<Button>(R.id.btnCalcEx7)
        val resultado7 = findViewById<TextView>(R.id.txtResultEx7)

        // Botão para calcular valores
        botao7.setOnClickListener {
            try {
                val v0 = editV0.text.toString().toDouble()
                val a = editA.text.toString().toDouble()
                val deltaS = editDeltaS.text.toString().toDouble()

                // Fórmula de Torricelli: v² = v0² + 2*a*Δs
                val total = v0 * v0 + 2 * a * deltaS
                resultado7.text = total.toString()

            } catch (e: Exception) {
                Toast.makeText(this, "Digite um valor válido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}