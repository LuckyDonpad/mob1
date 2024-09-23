package com.example.lab1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.lab1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MyApp"
    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding
            ?: throw IllegalStateException("Binding for ActivityMainBinding must not be null!")

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.w(TAG, "MainActivity onCreate() called")
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnGotoDetailActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, FitnessActivity::class.java)
            startActivity(intent)
        }

        binding.btnGotoInternet.setOnClickListener{
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://tenor.com/ru/view/shrek-gif-19731840"))
            startActivity(urlIntent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.w(TAG, "MainActivity onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.w(TAG, "MainActivity onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.w(TAG, "MainActivity onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.w(TAG, "MainActivity onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w(TAG, "MainActivity onDestroy() called")
    }

}