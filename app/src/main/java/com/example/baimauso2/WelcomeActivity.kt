package com.example.baimauso2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val imageView: ImageView = findViewById(R.id.imageView)
        val imageUrl = "https://example.com/6.png"

//        Glide.with(this)
//            .load(imageUrl)
//            .into(imageView)
    }
}