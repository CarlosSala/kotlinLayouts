package com.example.layouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.layouts.fragments.FragmentBlue
import com.example.layouts.fragments.FragmentGreen
import com.example.layouts.fragments.FragmentRed

class StaticsFragmentsActivity : AppCompatActivity() {
    private var fragmentRed: FragmentRed? = null
    private var fragmentBlue: FragmentBlue? = null
    private var fragmentGreen: FragmentGreen? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statics_fragments)
        fragmentRed = FragmentRed()
        fragmentBlue = FragmentBlue()
        fragmentGreen = FragmentGreen()
    }
}
