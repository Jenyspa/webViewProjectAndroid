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

        magalu.text = resources.getQuantityString (R.plurals.statistics_company_clicks, sharedPreferences.getInt("clickMagalu", 0), "Magalu", sharedPreferences.getInt("clickMagalu", 0))
        ebay.text = resources.getQuantityString (R.plurals.statistics_company_clicks, sharedPreferences.getInt("clickEbay", 0), "Ebay", sharedPreferences.getInt("clickEbay", 0))
        webmotors.text = resources.getQuantityString (R.plurals.statistics_company_clicks, sharedPreferences.getInt("clickWebmotors", 0), "Webmotors", sharedPreferences.getInt("clickWebmotors", 0))
        netshoes.text = resources.getQuantityString (R.plurals.statistics_company_clicks, sharedPreferences.getInt("clickNetshoes", 0), "Netshoes", sharedPreferences.getInt("clickNetshoes", 0))
        mercadoLivre.text = resources.getQuantityString (R.plurals.statistics_company_clicks, sharedPreferences.getInt("clickMercadoLivre", 0), "MercadoLivre", sharedPreferences.getInt("clickMercadoLivre", 0))
        submarino.text = resources.getQuantityString (R.plurals.statistics_company_clicks, sharedPreferences.getInt("clickSubmarino", 0), "Submarino", sharedPreferences.getInt("clickSubmarino", 0))
        americanas.text = resources.getQuantityString (R.plurals.statistics_company_clicks, sharedPreferences.getInt("clickAmericanas", 0), "Americanas", sharedPreferences.getInt("clickAmericanas", 0))

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