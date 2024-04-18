package com.example.layouts

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.layouts.fragments.FragmentBlue
import com.example.layouts.fragments.FragmentGreen
import com.example.layouts.fragments.FragmentRed

class DynamicFragmentActivity : AppCompatActivity() {
    var fragmentRed: FragmentRed? = null
    var fragmentBlue: FragmentBlue? = null
    var fragmentGreen: FragmentGreen? = null
    var transaction: FragmentTransaction? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_fragment)
        fragmentRed = FragmentRed()
        fragmentBlue = FragmentBlue()
        fragmentGreen = FragmentGreen()
        supportFragmentManager.beginTransaction().add(R.id.containerFragments, fragmentRed!!).commit()
    }

    fun onClick(view: View) {
        transaction = supportFragmentManager.beginTransaction()
        when (view.id) {
            R.id.btn_red -> {
                transaction!!.replace(R.id.containerFragments, fragmentRed!!)
                transaction!!.addToBackStack(null)
            }

            R.id.btn_blue -> {
                transaction!!.replace(R.id.containerFragments, fragmentBlue!!)
                transaction!!.addToBackStack(null)
            }

            R.id.btn_green -> {
                transaction!!.replace(R.id.containerFragments, fragmentGreen!!)
                transaction!!.addToBackStack(null)
            }
        }
        transaction!!.commit()
    }
}
