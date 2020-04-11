package com.example.conversordemedidas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Carregar Componentes
        val btnComprimento = findViewById<ImageButton>(R.id.btnComprimento)
        val btnDados = findViewById<ImageButton>(R.id.btnDados)
        val btnPeso = findViewById<ImageButton>(R.id.btnPeso)
        val btnTemperatura = findViewById<ImageButton>(R.id.btnTemperatura)

        btnComprimento.setOnClickListener {
            val intent = Intent(this, ConversorComprimento::class.java)
            startActivity(intent)
        }

        btnDados.setOnClickListener {
            val intent = Intent(this, conversor_dados::class.java)
            startActivity(intent)
        }

        btnPeso.setOnClickListener {
            val intent = Intent(this, ConversorDePeso::class.java)
            startActivity(intent)
        }

        btnTemperatura.setOnClickListener {
            val intent = Intent(this, conversorDeTemperatura::class.java)
            startActivity(intent)
        }


    }
}
