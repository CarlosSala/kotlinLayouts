package com.example.layouts.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.layouts.DynamicFragmentActivity
import com.example.layouts.R

class FragmentBlue : Fragment() {
    var btn_next: Button? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_blue, container, false)
        btn_next = vista.findViewById(R.id.btn_next)

        // String activityActual = requireActivity().toString();
        val current_activity = requireActivity().toString().substring(0, 43)
        if (current_activity == "com.example.layouts.DynamicFragmentActivity") {
            hidde_btn_next(view)
        }
        btn_next?.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, DynamicFragmentActivity::class.java)
            startActivity(intent)
        })
        return vista
    }

    fun hidde_btn_next(view: View?) {
        btn_next!!.visibility = View.INVISIBLE
    }
}
