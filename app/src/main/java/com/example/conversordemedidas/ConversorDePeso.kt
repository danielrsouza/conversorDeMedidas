package com.example.conversordemedidas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Spinner

class ConversorDePeso : AppCompatActivity() {

    var medidas = arrayOf("Miligrama (mg)", "Centigrama (cg)", "grama (g)", "Quilograma kg)")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor_de_peso)

        //Carregar o component spinner
        val spinner = findViewById<Spinner>(R.id.select)

        //Cria Array Adapter
        val adpter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, medidas)
        spinner.adapter = adpter


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
