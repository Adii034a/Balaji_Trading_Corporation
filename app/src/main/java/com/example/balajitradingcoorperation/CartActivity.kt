package com.example.balajitradingcoorperation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        // Get item name from intent
        val itemName = intent.getStringExtra("ITEM_NAME")
        findViewById<TextView>(R.id.cartItemName).text = itemName ?: "No item added to the cart."
    }
}
