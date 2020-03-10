package com.jenyspa.mywebviewapplication

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val companies = mutableListOf<Company>().apply {
            add(Company("Magalu", "https://www.magazineluiza.com.br/"))
            add(Company("Ebay", "https://www.ebay.com/"))
            add(Company("Webmotors", "https://www.webmotors.com.br/"))
            add(Company("Netshoes", "https://www.netshoes.com.br/"))
            add(Company("MercadoLivre", "https://www.mercadolivre.com.br/"))
            add(Company("Submarino", "https://www.submarino.com.br/"))
            add(Company("Americanas", "https://www.americanas.com.br/"))
        }

        clickList.run {
            adapter = ClickAdapter(companies)
            layoutManager = LinearLayoutManager(this@AboutActivity, RecyclerView.VERTICAL, false)
        }

        toolbar.setNavigationOnClickListener {
            finish()
        }

        clean_statistics.setOnClickListener {
            val sharedPreferences = getSharedPreferences("statistics", Context.MODE_PRIVATE)

            sharedPreferences.edit()
                .clear()
                .apply()

            recreate()
        }
    }
}