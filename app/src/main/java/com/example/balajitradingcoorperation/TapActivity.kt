package com.example.balajitradingcoorperation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TankActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tanks)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to Cart Activity from tank buttons
        findViewById<Button>(R.id.button_tank_1).setOnClickListener {
            navigateToCart("Sintex 500L ₹2500")
        }
        findViewById<Button>(R.id.button_tank_2).setOnClickListener {
            navigateToCart("Supreme 1000L ₹3500")
        }
        findViewById<Button>(R.id.button_tank_4).setOnClickListener {
            navigateToCart("Vectus 500L ₹2400")
        }
        findViewById<Button>(R.id.button_tank_5).setOnClickListener {
            navigateToCart("Plasto 750L ₹2900")
        }
        findViewById<Button>(R.id.button_tank_6).setOnClickListener {
            navigateToCart("Star 1000L ₹3700")
        }
    }

    private fun navigateToCart(itemName: String) {
        val intent = Intent(this, CartActivity::class.java)
        intent.putExtra("ITEM_NAME", itemName)
        startActivity(intent)
    }
}
