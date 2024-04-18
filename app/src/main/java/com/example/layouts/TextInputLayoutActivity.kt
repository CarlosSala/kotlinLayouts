package com.example.layouts

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.layouts.databinding.ActivityTextInputLayoutBinding
import java.util.regex.Pattern

class TextInputLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTextInputLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTextInputLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*  Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        binding.etNameField.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                validateName(s.toString())
            }

            override fun afterTextChanged(s: Editable) {}
        })
        binding.etCellphoneField.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                validateCellphone(s.toString())
            }

            override fun afterTextChanged(s: Editable) {}
        })
        binding.etEmailField.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                validateEmail(s.toString())
            }

            override fun afterTextChanged(s: Editable) {}
        })

        initListeners()
    }

    private fun initListeners() {

        binding.btnBack.setOnClickListener {

            val intent = Intent(this, TableLayoutActivity::class.java)
            startActivity(intent)
        }
        binding.btnNext.setOnClickListener {

            val intent = Intent(this, ScrollViewActivity::class.java)
            startActivity(intent)
        }
        binding.btnAccept.setOnClickListener { validateData() }
    }

    // check when accept button is press
    private fun validateName(name: String): Boolean {

        val patron = Pattern.compile("^[a-zA-Z ]+$")

        if (!patron.matcher(name).matches() || name.length > 30) {

            binding.tilName.error = "Invalid name"
            return false
        } else {
            binding.tilName.error = null
        }
        return true
    }

    // check when accept button is press
    private fun validateCellphone(cellphone: String): Boolean {

        if (!Patterns.PHONE.matcher(cellphone).matches()) {

            binding.tilCellphone.error = "Invalid cellphone"
            return false
        } else {
            binding.tilCellphone.error = null
        }
        return true
    }

    // check character to character
    private fun validateEmail(email: String): Boolean {

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

            binding.tilEmail.error = "Invalid email"
            return false
        } else {
            binding.tilEmail.error = null
        }
        return true
    }

    private fun validateData() {

        val name = binding.tilName.editText!!.text.toString()
        val cel = binding.tilCellphone.editText!!.text.toString()
        val email = binding.tilEmail.editText!!.text.toString()

        val a = validateName(name)
        val b = validateCellphone(cel)
        val c = validateEmail(email)

        if (a && b && c) {

            Toast.makeText(this, "Register successful", Toast.LENGTH_LONG).show()
        }
    }
}
