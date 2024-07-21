package com.example.miapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.miapp.databinding.ActivityPortadaBinding

class PortadaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPortadaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityPortadaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButtom.setOnClickListener { val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Bienvenido", Toast.LENGTH_SHORT).show()
        }
    }
}