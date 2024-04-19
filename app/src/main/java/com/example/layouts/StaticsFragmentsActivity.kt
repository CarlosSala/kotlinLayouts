package com.example.layouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.layouts.databinding.ActivityStaticsFragmentsBinding
import com.example.layouts.fragments.FragmentBlue
import com.example.layouts.fragments.FragmentGreen
import com.example.layouts.fragments.FragmentRed

class StaticsFragmentsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStaticsFragmentsBinding

    private var fragmentRed: FragmentRed? = null
    private var fragmentBlue: FragmentBlue? = null
    private var fragmentGreen: FragmentGreen? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStaticsFragmentsBinding.inflate(layoutInflater)

        setContentView(binding.root)

        fragmentRed = FragmentRed()
        fragmentBlue = FragmentBlue()
        fragmentGreen = FragmentGreen()
    }
}
