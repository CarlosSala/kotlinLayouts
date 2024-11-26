package com.example.layouts

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.layouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun initListeners() {

        binding.apply {

            btnFrameLayout.setOnClickListener {
                startNewActivity(FrameLayoutActivity::class.java)
            }
            btnDesignAdaptable.setOnClickListener {
                startNewActivity(DesignAdaptableActivity::class.java)
            }
            btnDesignAdaptable2.setOnClickListener {
                startNewActivity(DesignAdaptable2Activity::class.java)
            }
            btnTableLayout.setOnClickListener {
                startNewActivity(TableLayoutActivity::class.java)
            }
            btnTextInputLayout.setOnClickListener {
                startNewActivity(TextInputLayoutActivity::class.java)
            }
            btnScrollView.setOnClickListener {
                startNewActivity(ScrollViewActivity::class.java)
            }
            btnStaticFragment.setOnClickListener {
                startNewActivity(StaticsFragmentsActivity::class.java)
            }
            btnDynamicFragment.setOnClickListener {
                startNewActivity(DynamicFragmentActivity::class.java)
            }
            btnInteroperability.setOnClickListener {
                startNewActivity(InteroperabilityActivity::class.java)
            }
        }
    }

    private fun startNewActivity(toClass: Class<*>) {

        val intent = Intent(this, toClass)
        startActivity(intent)
    }
}