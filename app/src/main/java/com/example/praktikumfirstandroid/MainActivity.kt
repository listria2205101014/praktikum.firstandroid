package com.example.praktikumfirstandroid

import android.os.Bundle
import android.widget.GridView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. Pakai layout GridView
        setContentView(R.layout.gridview)

        // 2. Ambil GridView
        val gridView: GridView = findViewById(R.id.grid_view)

        // 3. Pasang adapter (JAVA -> KOTLIN AMAN)
        gridView.adapter = ImageAdapter(this)
    }
}
