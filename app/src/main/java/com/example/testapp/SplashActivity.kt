package com.example.testapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
         val handler = Handler(Looper.getMainLooper())

        handler.postDelayed(
            {
                this.finish()
                startActivity(Intent(this@SplashActivity,MainActivity::class.java))
            }
        ,1000
        )


    }


}