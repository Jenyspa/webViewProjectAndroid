package com.jenyspa.mywebviewapplication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

        clickList.adapter = ClickAdapter(companies)
        clickList.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

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