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

class exer1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exer1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val velocidade = findViewById<EditText>(R.id.editVelocidade)
        val tempo = findViewById<EditText>(R.id.editTempo)
        val botao = findViewById<Button>(R.id.btnCalcEx1)
        val resultado = findViewById<TextView>(R.id.txtResultEx1)

        // Botão para dividir valores
        botao.setOnClickListener {
            try {
                val vel = velocidade.text.toString().toDouble()
                val temp = tempo.text.toString().toDouble()
                val total = vel / temp
                resultado.text = total.toString()

            } catch (e: Exception) {
                Toast.makeText(this, "Digite um valor válido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}