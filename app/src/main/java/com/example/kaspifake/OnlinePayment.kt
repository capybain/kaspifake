package com.example.kaspifake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.example.kaspifake.databinding.ActivityClientBinding
import com.example.kaspifake.databinding.ActivityOnlinePaymentBinding

class OnlinePayment : AppCompatActivity() {
    private lateinit var binding: ActivityOnlinePaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnlinePaymentBinding.inflate(layoutInflater)
        val view = binding.root

        getSupportActionBar()?.hide()
        setContentView(view)

        val exit: ImageButton = binding.exit
        exit.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val intent = Intent(this@OnlinePayment, Activity2::class.java)
                startActivity(intent)
            }
        })
    }
}