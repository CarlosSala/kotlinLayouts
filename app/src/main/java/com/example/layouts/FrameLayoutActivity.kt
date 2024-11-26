package com.example.layouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.layouts.databinding.ActivityFrameLayoutBinding

class FrameLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFrameLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFrameLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
    }

    private fun initListeners() {

        binding.ivFrameLayout.setOnClickListener { hideImage() }
        binding.btnFrameLayout.setOnClickListener { hideBtn() }

   /*     binding.btnFrameLayoutNext.setOnClickListener {
            val intent = Intent(this, DesignAdaptableActivity::class.java)
            startActivity(intent)
        }*/
    }

    private fun hideBtn() {
        binding.btnFrameLayout.isVisible = false
        binding.ivFrameLayout.isVisible = true
    }

    private fun hideImage() {
        binding.btnFrameLayout.isVisible = true
        binding.ivFrameLayout.isVisible = false
    }
}