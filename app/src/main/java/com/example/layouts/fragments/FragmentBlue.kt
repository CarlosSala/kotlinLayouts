package com.example.layouts.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.layouts.DynamicFragmentActivity
import com.example.layouts.databinding.FragmentBlueBinding

class FragmentBlue : Fragment() {

    private var binding: FragmentBlueBinding? = null

    companion object {
        private const val CURRENT_ACTIVITY = "com.example.layouts.DynamicFragmentActivity"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        binding = FragmentBlueBinding.inflate(layoutInflater, container, false)

       // initListeners()

        // if this fragment is shown in the DynamicFragmentActivity, hide the button
        hiddeBtnNext()

        return binding!!.root
    }

    private fun initListeners() {

        binding!!.btnNext.setOnClickListener {

            val intent = Intent(context, DynamicFragmentActivity::class.java)
            startActivity(intent)
        }
    }

    private fun hiddeBtnNext() {

        val currentActivity = requireActivity().toString().substring(0, 43)

        if (currentActivity == CURRENT_ACTIVITY ) {

            binding!!.btnNext.visibility = View.INVISIBLE
        }
    }
}
