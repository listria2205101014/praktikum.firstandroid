package com.example.myactivityapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu
import android.content.Intent
import android.view.MenuItem
import android.widget.Toast

import com.example.myactivityapp.ui.theme.MyActivityAppTheme


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: called");
    }

    override fun onStart() {
        super.onStart();
        Log.d(TAG, "onStart Called")
    }

    override fun onResume() {
        super.onResume();
        Log.d(TAG, "onResume Called")
    }

    override fun onPause() {
        super.onPause();
        Log.d(TAG, "onPause Called")
    }

    override fun onStop() {
        super.onStop();
        Log.d(TAG, "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Called")
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_second_activity -> {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.menu_show_toast -> {
                Toast.makeText(this, "Hello from MainActivity!", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_exit -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }



}