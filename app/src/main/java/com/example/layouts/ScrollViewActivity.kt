package com.example.layouts

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.layouts.databinding.ActivityScrollViewBinding

class ScrollViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Icon in the action bar
        // getSupportActionBar().setDisplayShowHomeEnabled(true);
        // getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        initListeners()
    }

    private fun initListeners() {

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, StaticsFragmentsActivity::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, TextInputLayoutActivity::class.java)
            startActivity(intent)
        }

        setupImageButtonClickListener(binding.linearLayoutSv)
    }

    private fun setupImageButtonClickListener(linearLayout: LinearLayout) {

        // Iterate over all children of the LinearLayout
        for (i in 0 until linearLayout.childCount) {

            val childView = linearLayout.getChildAt(i)

            if (childView is ImageButton) {
                // Assign a click listener to each ImageButton
                childView.setOnClickListener {
                    // Call a function to handle the click event
                    selection(childView)
                }
            }
        }
    }

    private fun selection(view: View) {

        when (view.id) {

            R.id.banana -> Toast.makeText(this, "These are bananas", Toast.LENGTH_SHORT).show()
            R.id.cherry -> Toast.makeText(this, "These are cherries", Toast.LENGTH_SHORT).show()
            R.id.strawberry -> Toast.makeText(this, "These are strawberries", Toast.LENGTH_SHORT)
                .show()
            R.id.kiwi -> Toast.makeText(this, "These are kiwis", Toast.LENGTH_SHORT).show()
            R.id.apples -> Toast.makeText(this, "These are apples", Toast.LENGTH_SHORT).show()
            R.id.oranges -> Toast.makeText(this, "These are oranges", Toast.LENGTH_SHORT).show()
            R.id.melon -> Toast.makeText(this, "These are melons", Toast.LENGTH_SHORT).show()
            R.id.pineapple -> Toast.makeText(this, "These are pineapples", Toast.LENGTH_SHORT)
                .show()
            R.id.pear -> Toast.makeText(this, "These are pears", Toast.LENGTH_SHORT).show()
            R.id.blackberry -> Toast.makeText(this, "These are blackberries", Toast.LENGTH_SHORT)
                .show()
            R.id.watermelon -> Toast.makeText(this, "These are watermelons", Toast.LENGTH_SHORT)
                .show()
            R.id.grapes -> Toast.makeText(this, "These are grapes", Toast.LENGTH_SHORT).show()
        }
    }
}
