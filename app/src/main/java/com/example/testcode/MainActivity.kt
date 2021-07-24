package com.example.testcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.testcode.databinding.ActivityMainBinding

const val TAG="ActivityLifeCycle"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name="vishal rana"
        binding.buttonNext.setOnClickListener {
            val intent=Intent(this@MainActivity,MainActivity2::class.java)
            intent.apply {
                putExtra("name",name)
                  startActivity(intent)
            }
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() : called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() : called : ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() : called : ")
    }


    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() : called : ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() : called : ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() : called : ")
    }
}