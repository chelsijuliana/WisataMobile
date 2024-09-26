package com.chelsi.wisata

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Handler untuk delay 3 detik sebelum beralih ke MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            // Beralih ke halaman utama (MainActivity)
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish() // Menutup SplashActivity
        }, 3000) // Delay 3 detik
    }
}