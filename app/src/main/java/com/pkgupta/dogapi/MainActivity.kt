package com.pkgupta.dogapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.pkgupta.dogapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        loadRandomDog()
    }

    private fun loadRandomDog() {
        binding.ivDog.load("https://images.dog.ceo/breeds/terrier-american/n02093428_5165.jpg")
    }
}