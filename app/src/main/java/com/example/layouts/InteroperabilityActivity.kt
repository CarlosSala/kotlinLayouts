package com.example.layouts

import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.FabPosition.Companion.Center
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.layouts.databinding.ActivityInteroperabilityBinding

class InteroperabilityActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInteroperabilityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityInteroperabilityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Jetpack Compose since AndroidViews (xml)
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

@Preview(showBackground = true)
@Composable
fun HelloCompose(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxSize()) {
        Text(
            text = "hello sin jetpack compose",
            textAlign = TextAlign.Center,
           // modifier = Modifier.wrapContentWidth(Alignment.CenterHorizontally)
        )
        // Android View (xml) since Jetpack Compose)
        AndroidView(factory = {
            TextView(it).apply {
                text = "hello xml since jetpack compose"
                gravity = Gravity.CENTER_HORIZONTAL
            }
        })
    }
}