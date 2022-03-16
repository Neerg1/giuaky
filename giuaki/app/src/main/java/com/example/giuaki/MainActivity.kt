package com.example.giuaki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.giuaki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            val intent = Intent(this@MainActivity, ketqua::class.java)
           val name = binding.eten.text.toString()
            val sdt  = binding.esdt.text.toString()
            val email = binding.eemail.text.toString()

            intent.putExtra("ten",name)
            intent.putExtra("sdt",sdt)
            intent.putExtra("email",email)

            startActivity(intent)


        }

    }
}