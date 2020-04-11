package com.example.conversordemedidas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.ActionBar
import kotlin.Double as Doublel

class ConversorComprimento : AppCompatActivity() {

    var medidas = arrayOf("Milimetro (mm)", "Centrimento (cm)", "Metro (m)", "Quilometro km)")
    var selecao = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor_comprimento)

        val textValor = findViewById<EditText>(R.id.txtValor)
        val textResultado = findViewById<TextView>(R.id.txtResultado)
        val btnConvert = findViewById<Button>(R.id.btnConvert)

        val spinner = findViewById<Spinner>(R.id.select);

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, medidas)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
               selecao = position
            }

        }

        btnConvert.setOnClickListener {
            val valor = textValor.text.toString()

            if (valor != "") {
                if (selecao == 0) {
                    var texto = "centimetro= "
                    texto += Double.parseDouble(valor )/ 10f
                    texto += "c, \nMetro = "
                    texto += Double.parseDouble(valor )/ 1000f
                    texto += "m, \nKm = "
                    texto += Double.parseDouble(valor )/ 1000000f
                    texto += "km"

                    textResultado.text = texto;
                } else if (selecao == 1) {
                    var texto = "Milimetro= "
                    texto += Double.parseDouble(valor )/ 10f
                    texto += "mm, \nMetro = "
                    texto += Double.parseDouble(valor )/ 100f
                    texto += "m, \nKm = "
                    texto += Double.parseDouble(valor )/ 100000f
                    texto += "km"

                    textResultado.text = texto;

                } else if(selecao == 2) {
                    var texto = "Metro= "
                    texto += Double.parseDouble(valor )/ 1000f
                    texto += "c, \nMetro = "
                    texto += Double.parseDouble(valor )/ 100f
                    texto += "m, \nKm = "
                    texto += Double.parseDouble(valor )/ 10000f
                    texto += "km"

                    textResultado.text = texto;

                } else if (selecao == 3) {
                    var texto = "KM= "
                    texto += Double.parseDouble(valor )/ 1000000f
                    texto += "c, \nMetro = "
                    texto += Double.parseDouble(valor )/ 100000f
                    texto += "m, \nKm = "
                    texto += Double.parseDouble(valor )/ 1000f
                    texto += "km"

                    textResultado.text = texto;

                }
            }else {
                textResultado.text = "Adicione um valor"
            }
        }

        //Ativar o "up navigation" na ActionBar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item?.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}

