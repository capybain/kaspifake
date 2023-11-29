package com.example.kaspifake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.example.kaspifake.databinding.ActivityMainBinding
import com.example.kaspifake.databinding.ActivityRequisitesBinding

class requisites : AppCompatActivity() {
    private lateinit var binding: ActivityRequisitesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRequisitesBinding.inflate(layoutInflater)
        val view = binding.root

        getSupportActionBar()?.hide()
        setContentView(view)

        val exit: ImageButton = binding.exit
        exit.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val intent = Intent(this@requisites, MainActivity::class.java)
                startActivity(intent)
            }
        })
    }
}