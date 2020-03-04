package com.jenyspa.mywebviewapplication

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val sharedPreferences = getSharedPreferences("statistics", Context.MODE_PRIVATE)

        magalu.text = "Magalu: ${sharedPreferences.getInt("clickMagalu", 0)} cliques."
        ebay.text = "Ebay: ${sharedPreferences.getInt("clickEbay", 0)} cliques."
        webmotors.text = "Webmotors: ${sharedPreferences.getInt("clickWebmotors", 0)} cliques."
        netshoes.text = "Netshoes: ${sharedPreferences.getInt("clickNetshoes", 0)} cliques."
        mercadoLivre.text = "MercadoLivre: ${sharedPreferences.getInt("clickMercadoLivre", 0)} cliques."
        submarino.text = "Submarino: ${sharedPreferences.getInt("clickSubmarino", 0)} cliques."
        americanas.text = "Americanas: ${sharedPreferences.getInt("clickAmericanas", 0)} cliques."

        toolbar.setNavigationOnClickListener {
            finish()
        }

        clean_statistics.setOnClickListener {
            sharedPreferences.edit()
                .clear()
                .apply()

            recreate()
        }
    }
}