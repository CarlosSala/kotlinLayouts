package com.example.layouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.layouts.databinding.ActivityDynamicFragmentBinding

class DynamicFragmentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDynamicFragmentBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDynamicFragmentBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initUI()
    }

    private fun initUI() {

        initNavigate()
    }

    private fun initNavigate() {

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.containerFragments) as NavHostFragment

        navController = navHostFragment.navController
        binding.bottomNav.setupWithNavController(navController)
    }
}