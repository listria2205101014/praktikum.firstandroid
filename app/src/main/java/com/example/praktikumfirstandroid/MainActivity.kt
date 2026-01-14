package com.example.praktikumfirstandroid

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set layout GridView
        setContentView(R.layout.gridview)

        // Inisialisasi GridView
        val gridView = findViewById<GridView>(R.id.grid_view)

        // Pasang adapter
        gridView.adapter = ImageAdapter(this)
    }
}
