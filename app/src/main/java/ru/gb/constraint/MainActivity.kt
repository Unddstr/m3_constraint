package ru.gb.constraint

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gb.constraint.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}