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

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val valor1 = findViewById<EditText>(R.id.edtv1)
        val valor2 = findViewById<EditText>(R.id.edtv2)
        val botaoSoma = findViewById<Button>(R.id.button)
        val resultado = findViewById<TextView>(R.id.txtresult)

        // Botão para somar valores
        botaoSoma.setOnClickListener {
            try {
                val v1 = valor1.text.toString().toDouble()
                val v2 = valor2.text.toString().toDouble()
                val total = v1 + v2
                resultado.text = total.toString()

            }catch (e: Exception) {
                Toast.makeText(this, "Digite um valor válido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}