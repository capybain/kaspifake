package com.example.kaspifake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.example.kaspifake.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    private lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        val view = binding.root

        getSupportActionBar()?.hide()
        setContentView(view)

        val exit: ImageButton = binding.exit
        exit.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val intent = Intent(this@Activity2, MainActivity::class.java)
                startActivity(intent)
            }
        })
        val client: ImageButton = binding.client
        client.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@Activity2, com.example.kaspifake.client::class.java)
                startActivity(intent)
            }
        })
        val international: ImageButton = binding.international
        international.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@Activity2, OnlinePayment::class.java)
                startActivity(intent)
            }
        })
    }
}