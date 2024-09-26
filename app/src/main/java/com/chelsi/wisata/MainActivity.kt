package com.chelsi.wisata

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Aksi saat tombol See Details diklik
        val seeDetailsButton: Button = findViewById(R.id.seeDetailsButton)
        seeDetailsButton.setOnClickListener {
            // Pindah ke DetailActivity
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent)
        }
    }
}