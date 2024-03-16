package com.example.latihan4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.findNavController
import com.example.latihan4.databinding.ActivityMainBinding
import com.example.latihan4.ui.theme.Latihan4Theme

class MainActivity : AppCompatActivity() {
    private lateinit var buttonA: Button
    private lateinit var buttonB: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonA = findViewById(R.id.buttonA)
        buttonB = findViewById(R.id.buttonB)

        buttonA.setOnClickListener {
            val uri = Uri.parse("https://example.com/fragmentA")

            findNavController(R.id.nav_host_fragment).navigate(uri)
        }

        buttonB.setOnClickListener {
            val uri = Uri.parse("https://example.com/fragmentB")

            findNavController(R.id.nav_host_fragment).navigate(uri)
        }
    }
}