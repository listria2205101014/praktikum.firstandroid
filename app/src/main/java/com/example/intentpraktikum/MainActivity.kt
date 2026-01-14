package com.example.intentpraktikum

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenSecond = findViewById<Button>(R.id.btnOpenSecond)
        val btnOpenBrowser = findViewById<Button>(R.id.btnOpenBrowser)
        val btnCircleArea = findViewById<Button>(R.id.btnCircleArea)
        val btnRectangleArea = findViewById<Button>(R.id.btnRectangleArea)

        btnOpenSecond.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        btnOpenBrowser.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.unipma.ac.id")
                )
            )
        }

        btnCircleArea.setOnClickListener {
            startActivity(Intent(this, CircleAreaActivity::class.java))
        }

        btnRectangleArea.setOnClickListener {
            startActivity(Intent(this, RectangleAreaActivity::class.java))
        }
    }
}