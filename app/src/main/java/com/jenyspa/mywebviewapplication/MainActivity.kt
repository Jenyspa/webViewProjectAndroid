package com.jenyspa.mywebviewapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        magalu.setOnClickListener {
            saveSharedPreference("clickMagalu")
            goToActivity("https://www.magazineluiza.com.br/")
        }

        ebay.setOnClickListener {
            saveSharedPreference("clickEbay")
            goToActivity("https://www.ebay.com/")
        }

        webmotors.setOnClickListener {
            saveSharedPreference("clickWebmotors")
            goToActivity("https://www.webmotors.com.br/")
        }

        netshoes.setOnClickListener {
            saveSharedPreference("clickNetshoes")
            goToActivity("https://www.netshoes.com.br/")
        }

        mercadoLivre.setOnClickListener {
            saveSharedPreference("clickMercadoLivre")
            goToActivity("https://www.mercadolivre.com.br/")
        }

        submarino.setOnClickListener {
            saveSharedPreference("clickSubmarino")
            goToActivity("https://www.submarino.com.br/")
        }

        americanas.setOnClickListener {
            saveSharedPreference("clickAmericanas")
            goToActivity("https://www.americanas.com.br/")
        }
    }

    fun goToActivity(url: String) {
        val intent = Intent(this, WebViewActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }

    fun saveSharedPreference(clickName : String) {
        val sharedPreferences = getSharedPreferences("statistics", Context.MODE_PRIVATE)

        val counter = sharedPreferences.getInt(clickName, 0)

        sharedPreferences.edit()
            .putInt(clickName, counter + 1)
            .apply()

        Toast.makeText(this, "$counter", Toast.LENGTH_SHORT).show()
    }
}