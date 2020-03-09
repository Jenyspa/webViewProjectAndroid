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

        magalu.text = getString(R.string.statistics_company_clicks, "Magalu", sharedPreferences.getInt("clickMagalu", 0))
        ebay.text = getString(R.string.statistics_company_clicks, "Ebay", sharedPreferences.getInt("clickEbay", 0))
        webmotors.text = getString(R.string.statistics_company_clicks, "Webmotors", sharedPreferences.getInt("clickWebmotors", 0))
        netshoes.text = getString(R.string.statistics_company_clicks, "Netshoes", sharedPreferences.getInt("clickNetshoes", 0))
        mercadoLivre.text = getString(R.string.statistics_company_clicks, "MercadoLivre", sharedPreferences.getInt("clickMercadoLivre", 0))
        submarino.text = getString(R.string.statistics_company_clicks, "Submarino", sharedPreferences.getInt("clickSubmarino", 0))
        americanas.text = getString(R.string.statistics_company_clicks, "Americanas", sharedPreferences.getInt("clickAmericanas", 0))

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