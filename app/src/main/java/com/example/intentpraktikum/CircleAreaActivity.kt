package com.example.intentpraktikum

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CircleAreaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_area)

        val inputRadius = findViewById<EditText>(R.id.inputRadius)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val textResult = findViewById<TextView>(R.id.textResult)

        btnCalculate.setOnClickListener {
            val radiusStr = inputRadius.text.toString()

            if (radiusStr.isNotEmpty()) {
                val r = radiusStr.toDouble()
                val luas = Math.PI * r * r
                textResult.text = "Luas: %.2f".format(luas)
            } else {
                inputRadius.error = "Masukkan nilai r"
            }
        }
    }
}