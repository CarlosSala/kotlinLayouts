package com.example.layouts

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ScrollViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view)

        // icono en el action bar
        // getSupportActionBar().setDisplayShowHomeEnabled(true);
        // getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        val btn_next = findViewById<Button>(R.id.btn_next)
        val btn_back = findViewById<Button>(R.id.btn_back)
        btn_next.setOnClickListener {
            val intent = Intent(this@ScrollViewActivity, StaticsFragmentsActivity::class.java)
            startActivity(intent)
        }
        btn_back.setOnClickListener {
            val intent = Intent(this@ScrollViewActivity, TextInputLayoutActivity::class.java)
            startActivity(intent)
        }
    }

    fun Selection(view: View) {
        when (view.id) {
            R.id.banana -> Toast.makeText(this, "Estas son bananas", Toast.LENGTH_SHORT).show()
            R.id.cherry -> Toast.makeText(this, "Estas son cerezas", Toast.LENGTH_SHORT).show()
            R.id.strawberry -> Toast.makeText(this, "Estas son frutillas", Toast.LENGTH_SHORT).show()
            R.id.kiwi -> Toast.makeText(this, "Estos son kiwis", Toast.LENGTH_SHORT).show()
            R.id.apples -> Toast.makeText(this, "Estas son manzanas", Toast.LENGTH_SHORT).show()
            R.id.oranges -> Toast.makeText(this, "Estas son naranjas", Toast.LENGTH_SHORT).show()
            R.id.melons -> Toast.makeText(this, "Estos son melones", Toast.LENGTH_SHORT).show()
            R.id.pineapple -> Toast.makeText(this, "Estas son piñas", Toast.LENGTH_SHORT).show()
            R.id.pear -> Toast.makeText(this, "Estas son peras", Toast.LENGTH_SHORT).show()
            R.id.blackberry -> Toast.makeText(this, "Estas son moras", Toast.LENGTH_SHORT).show()
            R.id.watermelon -> Toast.makeText(this, "Estos son sandias", Toast.LENGTH_SHORT).show()
            R.id.grapes -> Toast.makeText(this, "Estas son uvas", Toast.LENGTH_SHORT).show()
        }
    }
}
