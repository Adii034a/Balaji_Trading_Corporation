package com.example.balajitradingcoorperation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BrushesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_brushes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to Cart Activity from brush buttons
        findViewById<Button>(R.id.button_brush_1).setOnClickListener {
            navigateToCart("Paint Brush ₹150")
        }
        findViewById<Button>(R.id.button_brush_2).setOnClickListener {
            navigateToCart("Wall Brush ₹200")
        }
        findViewById<Button>(R.id.button_brush_3).setOnClickListener {
            navigateToCart("Ceiling Brush ₹250")
        }
        findViewById<Button>(R.id.button_brush_4).setOnClickListener {
            navigateToCart("Stencil Brush ₹300")
        }
        findViewById<Button>(R.id.button_brush_6).setOnClickListener {
            navigateToCart("Angle Brush ₹180")
        }
    }

    private fun navigateToCart(itemName: String) {
        val intent = Intent(this, CartActivity::class.java)
        intent.putExtra("ITEM_NAME", itemName)
        startActivity(intent)
    }
}
