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

        val companies = mutableListOf<Company>()
        companies.add(Company("Magalu", "https://www.magazineluiza.com.br/"))
        companies.add(Company("Ebay", "https://www.ebay.com/"))
        companies.add(Company("Webmotors", "https://www.webmotors.com.br/"))
        companies.add(Company("Netshoes", "https://www.netshoes.com.br/"))
        companies.add(Company("MercadoLivre", "https://www.mercadolivre.com.br/"))
        companies.add(Company("Submarino", "https://www.submarino.com.br/"))
        companies.add(Company("Americanas", "https://www.americanas.com.br/"))

        magalu.text = "${companies[0].name} ${companies[0].getClicks(sharedPreferences)} cliques."
        ebay.text = "${companies[1].name} ${companies[1].getClicks(sharedPreferences)} cliques."
        webmotors.text = "${companies[2].name} ${companies[2].getClicks(sharedPreferences)} cliques."
        netshoes.text = "${companies[3].name} ${companies[3].getClicks(sharedPreferences)} cliques."
        mercadoLivre.text = "${companies[4].name} ${companies[4].getClicks(sharedPreferences)} cliques."
        submarino.text = "${companies[5].name} ${companies[5].getClicks(sharedPreferences)} cliques."
        americanas.text = "${companies[6].name} ${companies[6].getClicks(sharedPreferences)} cliques."

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