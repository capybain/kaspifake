package com.example.kaspifake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import com.example.kaspifake.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var imbalance: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        getSupportActionBar()?.hide()
        setContentView(view)

        imbalance = findViewById(R.id.balance)
        val perevod: ImageButton = binding.perevod
        perevod.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val intent = Intent(this@MainActivity, Activity2::class.java)
                startActivity(intent)
            }
        })
        updateBalance(777777.0)
    }

    private fun updateBalance(balance: Double) {
        imbalance.text = "Баланс: $balance"
    }
}