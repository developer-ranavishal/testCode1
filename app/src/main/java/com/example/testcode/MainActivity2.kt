package com.example.testcode

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testcode.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textActivity2.setOnClickListener {
            binding.textActivity2.text=intent.getStringExtra("name")
        }

        binding.buttonopn1.setOnClickListener {
            val intent=Intent(Intent.ACTION_DIAL)
            val number : Uri= Uri.parse("tel : *124#")
            intent.apply {
                data= number
                startActivity(intent)
            }
        }

        binding.button2.setOnClickListener {
            val url ="https:/www.youtube.com"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.apply {
                data = Uri.parse(url)
                startActivity(intent)
            }
        }


    }

}