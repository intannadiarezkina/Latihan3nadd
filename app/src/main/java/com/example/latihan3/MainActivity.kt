package com.example.latihan3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNama = findViewById<EditText>(R.id.etNama)
        val etNim = findViewById<EditText>(R.id.etNim)
        val etProdi = findViewById<EditText>(R.id.etProdi)
        val btnKirim = findViewById<Button>(R.id.btnKirim)

        btnKirim.setOnClickListener {

            val nama = etNama.text.toString()
            val nim = etNim.text.toString()
            val prodi = etProdi.text.toString()

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("EXTRA_NAMA", nama)
            intent.putExtra("EXTRA_NIM", nim)
            intent.putExtra("EXTRA_PRODI", prodi)

            startActivity(intent)
        }
    }
}