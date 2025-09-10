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

class exer8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exer8)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val editC1 = findViewById<EditText>(R.id.editC1)
        val editV1 = findViewById<EditText>(R.id.editV1)
        val editC2 = findViewById<EditText>(R.id.editC2)
        val btnCalcular = findViewById<Button>(R.id.btnCalcEx8)
        val txtResultado = findViewById<TextView>(R.id.txtResultEx8)

        btnCalcular.setOnClickListener {
            try {
                val c1 = editC1.text.toString().toDouble()
                val v1 = editV1.text.toString().toDouble()
                val c2 = editC2.text.toString().toDouble()

                val v2 = (c1 * v1) / c2
                txtResultado.text = "V2 = %.2f".format(v2)

            } catch (e: Exception) {
                Toast.makeText(this, "Digite um valor válido", Toast.LENGTH_SHORT).show()
            }

        }
    }
}