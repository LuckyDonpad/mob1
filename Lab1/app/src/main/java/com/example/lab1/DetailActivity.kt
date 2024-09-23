package com.example.lab1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab1.databinding.ActivityDetailBinding
import android.util.Log

class DetailActivity : AppCompatActivity() {
    private val TAG = "MyApp"
    private var _binding: ActivityDetailBinding? = null
    private val binding
        get() = _binding
            ?: throw IllegalStateException("Binding for ActivityDetailBinding must not be null!")

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.w("MyApp", "DetailActivity onCreate() called")

        _binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.button.setOnClickListener {
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://upload.wikimedia.org/wikipedia/ru/6/61/Rickrolling.gif?20160803222037".toString())
            )
            startActivity(urlIntent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.w(TAG, "DetailActivity onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.w(TAG,"DetailActivity onResume() called")
    }
    override fun onPause() {
        super.onPause()
        Log.w(TAG,"DetailActivity onPause() called")
    }
    override fun onStop() {
        super.onStop()
        Log.w(TAG,"DetailActivity onStop() called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.w(TAG,"DetailActivity onDestroy() called")
    }
}