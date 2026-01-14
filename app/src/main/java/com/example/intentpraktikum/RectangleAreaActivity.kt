package com.example.intentpraktikum

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RectangleAreaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle_area)

        val inputLength = findViewById<EditText>(R.id.inputLength)
        val inputWidth = findViewById<EditText>(R.id.inputWidth)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val textResult = findViewById<TextView>(R.id.textResult)

        btnCalculate.setOnClickListener {
            val lengthStr = inputLength.text.toString()
            val widthStr = inputWidth.text.toString()

            if (lengthStr.isEmpty() || widthStr.isEmpty()) {
                Toast.makeText(this, "Semua input harus diisi", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val length = lengthStr.toDouble()
            val width = widthStr.toDouble()

            val area = length * width
            textResult.text = "Hasil: $area"
        }
    }
}