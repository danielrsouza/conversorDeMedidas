package com.example.conversordemedidas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Spinner

class conversor_dados : AppCompatActivity() {

    var medidas = arrayOf("Byte (b)", "Quilobyt (kb)", "Megabyte (mb)", "Gigabyte (gb)")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor_dados)
        //Spinner
        val spinner = findViewById<Spinner>(R.id.select);

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, medidas)
        spinner.adapter = adapter

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
