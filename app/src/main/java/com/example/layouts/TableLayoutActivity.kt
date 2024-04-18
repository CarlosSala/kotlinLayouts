package com.example.layouts

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.layouts.databinding.ActivityTableLayoutBinding

class TableLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTableLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTableLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
    }

    private fun initListeners() {

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, TextInputLayoutActivity::class.java)
            startActivity(intent)
        }
        binding.btnBack.setOnClickListener {
            val intent = Intent(this, DesignAdaptable2Activity::class.java)
            startActivity(intent)
        }
    }
}
