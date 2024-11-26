package com.example.layouts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.layouts.databinding.ActivityInteroperabilityBinding

class InteroperabilityActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInteroperabilityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityInteroperabilityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val composeView = findViewById<ComposeView>(R.id.compose_view)
        composeView.setContent {
            HelloCompose()
        }

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

@Composable
fun HelloCompose(modifier: Modifier = Modifier) {
    Text("hello compose")
}