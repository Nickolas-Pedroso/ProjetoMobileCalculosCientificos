package com.example.kotlin01

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class telaMenu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnEx1 = findViewById<Button>(R.id.btnEx1)
        val btnEx2 = findViewById<Button>(R.id.btnEx2)
        val btnEx3 = findViewById<Button>(R.id.btnEx3)
        val btnEx4 = findViewById<Button>(R.id.btnEx4)
        val btnEx5 = findViewById<Button>(R.id.btnEx5)
        val btnEx6 = findViewById<Button>(R.id.btnEx6)
        val btnEx7 = findViewById<Button>(R.id.btnEx7)
        val btnEx8 = findViewById<Button>(R.id.btnEx8)

        btnEx1.setOnClickListener{
            val in1 = Intent(this, exer1::class.java)
            startActivity(in1)
        }
        btnEx2.setOnClickListener{
            val in2 = Intent(this, exer2::class.java)
            startActivity(in2)
        }
        btnEx3.setOnClickListener{
            val in3 = Intent(this, exer3::class.java)
            startActivity(in3)
        }
        btnEx4.setOnClickListener{
            val in4 = Intent(this, exer4::class.java)
            startActivity(in4)
        }
        btnEx5.setOnClickListener{
            val in5 = Intent(this, exer5::class.java)
            startActivity(in5)
        }
        btnEx6.setOnClickListener{
            val in6 = Intent(this, exer6::class.java)
            startActivity(in6)
        }
        btnEx7.setOnClickListener{
            val in7 = Intent(this, exer7::class.java)
            startActivity(in7)
        }
        btnEx8.setOnClickListener{
            val in8 = Intent(this, exer8::class.java)
            startActivity(in8)
        }
    }
}