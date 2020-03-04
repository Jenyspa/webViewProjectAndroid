package com.jenyspa.mywebviewapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        magalu.setOnClickListener {
            goToActivity("https://www.magazineluiza.com.br/")
        }

        ebay.setOnClickListener {
            goToActivity("https://www.ebay.com/")
        }

        webmotors.setOnClickListener {
            goToActivity("https://www.webmotors.com.br/")
        }

        netshoes.setOnClickListener {
            goToActivity("https://www.netshoes.com.br/")
        }

        mercadoLivre.setOnClickListener {
            goToActivity("https://www.mercadolivre.com.br/")
        }

        submarino.setOnClickListener {
            goToActivity("https://www.submarino.com.br/")
        }

        americanas.setOnClickListener {
            goToActivity("https://www.americanas.com.br/")
        }
    }

    fun goToActivity(url: String) {
        val intent = Intent(this, WebViewActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}