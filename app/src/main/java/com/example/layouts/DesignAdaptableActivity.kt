package com.example.layouts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.layouts.databinding.ActivityDesignAdaptableBinding

class DesignAdaptableActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDesignAdaptableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDesignAdaptableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
    }

    private fun initListeners() {

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, DesignAdaptable2Activity::class.java)
            startActivity(intent)
        }
        binding.btnBack.setOnClickListener {
            val intent = Intent(this, FrameLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}
