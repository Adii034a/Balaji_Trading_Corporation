package com.example.balajitradingcoorperation

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Click listener for Tank
        val tank = findViewById<LinearLayout>(R.id.tank)
        tank.setOnClickListener {
            val intent = Intent(this, TankActivity::class.java)
            startActivity(intent)
        }

        // Click listener for Brushes
        val brushes = findViewById<LinearLayout>(R.id.brushes)
        brushes.setOnClickListener {
            val intent = Intent(this, BrushesActivity::class.java)
            startActivity(intent)
        }

        val tiles = findViewById<LinearLayout>(R.id.tiles)
        tiles.setOnClickListener {
            // Navigate to TankActivity
            val intent = Intent(this, TilesActivity::class.java)
            startActivity(intent)
        }

        // Click listener for Cement
        val cement = findViewById<LinearLayout>(R.id.cement)
        cement.setOnClickListener {
            // Navigate to CementActivity
            val intent = Intent(this, CementActivity::class.java)
            startActivity(intent)
        }

        // Click listener for Paints
        val paints = findViewById<LinearLayout>(R.id.paints)
        paints.setOnClickListener {
            // Navigate to PaintsActivity
            val intent = Intent(this, PaintsActivity::class.java)
            startActivity(intent)
        }

        // Click listener for Pipes
        val pipes = findViewById<LinearLayout>(R.id.pipes)
        pipes.setOnClickListener {
            // Navigate to PipesActivity
            val intent = Intent(this, PipesActivity::class.java)
            startActivity(intent)
        }

        // Click listener for Tap
        val tap = findViewById<LinearLayout>(R.id.tap)
        tap.setOnClickListener {
            // Navigate to TapActivity
            val intent = Intent(this, TapActivity::class.java)
            startActivity(intent)
        }



        // Click listener for Brushes

    }
}
