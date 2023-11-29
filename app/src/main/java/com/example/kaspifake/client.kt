package com.example.kaspifake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.example.kaspifake.databinding.Activity2Binding
import com.example.kaspifake.databinding.ActivityClientBinding

class client : AppCompatActivity() {
    private lateinit var binding: ActivityClientBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClientBinding.inflate(layoutInflater)
        val view = binding.root

        getSupportActionBar()?.hide()
        setContentView(view)

        val exit: ImageButton = binding.exit
        exit.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val intent = Intent(this@client, Activity2::class.java)
                startActivity(intent)
            }
        })
    }
}