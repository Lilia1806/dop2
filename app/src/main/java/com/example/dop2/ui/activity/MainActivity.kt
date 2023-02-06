package com.example.dop2.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dop2.databinding.ActivityMainBinding
import com.example.dop2.ui.adapter.OnBoardViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
    }

    private fun initialize() {
        val adapter = OnBoardViewPagerAdapter(supportFragmentManager, lifecycle)
        binding.pager.adapter = adapter

        TabLayoutMediator(binding.tab, binding.pager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "1"
                }
                1 -> {
                    tab.text = "2"
                }
            }
        }.attach()
    }
}