package com.chelsi.wisata

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.chelsi.wisata.Adapter.AdapterGambar


class BerandaActivity : AppCompatActivity() {

    private val imageList = arrayOf(
        R.drawable.jpnn1,
        R.drawable.jpnn2,
        R.drawable.jpnn3,
        R.drawable.jpnn4
    )

    private val title = arrayOf("Sensō-ji", "Kiyomizudera", "Shitenno-ji", "Gunung Fuji")
    private val location = arrayOf("Lokasi : Taitō, Jepan", "Lokasi : Kyoto, Jepang", "Lokasi : Osaka, Jepang", "Lokasi : Honshu, Jepang")
    private val tgl = arrayOf(
        "Tgl : 23 - Mei - 2024",
        "Tgl : 4 - Juni - 2024",
        "Tgl : 1 -  September - 2024",
        "Tgl : 11 - Agustus - 2024"
    )

    private val des = arrayOf(
        "Sensō-ji adalah sebuah kuil Buddha kuno yang terletak di Asakusa, Tokyo, Jepang. Bangunan ini adalah kuil tertua di Tokyo, dan salah satu yang paling penting. Dahulu, kuil ini terafiliasi dengan sekte Tendai dari Buddha Mahayana, tetapi setelah Perang Dunia II menjadi kuil yang independen.",
        "Terletak di atas gunung kecil di sisi timur Kyoto, Kuil Kiyomizudera menawarkan pemandangan kota yang menakjubkan . Panggung kuil, yang ditopang oleh pilar-pilar besar, merupakan salah satu gambaran paling terkenal di Jepang.",
        "Shitennō-ji adalah sebuah kuil Buddhis di Ōsaka, Jepang. Kuil ini terkadang dianggap sebagai kuil Buddhis pertama dan tertua yang dikelola secara resmi di Jepang, meskipun bangunan kuil telah dibangun kembali selama berabad-abad.",
        "Gunung Fuji, terletak di pulau Honshu, adalah gunung tertinggi di Jepang, dengan ketinggian 3.776,24 m. Gunung ini adalah gunung berapi tertinggi kedua yang terletak di sebuah pulau di benua Asia, dan puncak tertinggi ketujuh dari sebuah pulau di Bumi."
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_beranda)

        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = AdapterGambar(this, imageList, title, location)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("data", imageList[position])
            intent.putExtra("data1", title[position])
            intent.putExtra("data2", location[position])
            intent.putExtra("data3", tgl[position])
            intent.putExtra("data4", des[position])
            startActivity(intent)
        }
    }
}