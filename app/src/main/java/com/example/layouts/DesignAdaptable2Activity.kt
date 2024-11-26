package com.example.layouts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.layouts.databinding.ActivityDesignAdaptable2Binding

class DesignAdaptable2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityDesignAdaptable2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDesignAdaptable2Binding.inflate(layoutInflater)
        setContentView(binding.root)

       // initListeners()
    }

    private fun initListeners() {

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, TableLayoutActivity::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, DesignAdaptableActivity::class.java)
            startActivity(intent)
        }
    }
}
