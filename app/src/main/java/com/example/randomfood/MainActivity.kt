package com.example.randomfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val breakfastBtn = findViewById<Button>(R.id.breakfastBtn)
        val lunchBtn = findViewById<Button>(R.id.lunchBtn)
        val dinnerBtn = findViewById<Button>(R.id.dinnerBtn)
        val nightSnackBtn = findViewById<Button>(R.id.nightSnackBtn)

        breakfastBtn.setOnClickListener{
            val intent = Intent(this, Breakfast::class.java)
            startActivity(intent)
        }

        lunchBtn.setOnClickListener{
            val intent = Intent(this, Lunch::class.java)
            startActivity(intent)
        }

        dinnerBtn.setOnClickListener{
            val intent = Intent(this, Dinner::class.java)
            startActivity(intent)
        }



    }
}

