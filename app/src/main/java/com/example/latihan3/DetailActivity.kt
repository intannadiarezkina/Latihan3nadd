package com.example.latihan3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvNama = findViewById<TextView>(R.id.tvNama)
        val tvNim = findViewById<TextView>(R.id.tvNim)
        val tvProdi = findViewById<TextView>(R.id.tvProdi)

        tvNama.text = "Nama : ${intent.getStringExtra("EXTRA_NAMA")}"
        tvNim.text = "NIM : ${intent.getStringExtra("EXTRA_NIM")}"
        tvProdi.text = "Prodi : ${intent.getStringExtra("EXTRA_PRODI")}"
    }
}