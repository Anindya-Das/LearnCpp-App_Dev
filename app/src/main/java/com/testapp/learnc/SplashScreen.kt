package com.testapp.learnc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {

        val timeOut = 1050

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash_screen)

            Handler().postDelayed({
                var act = Intent(this@SplashScreen,MainActivity::class.java)
                startActivity(act)
            },timeOut.toLong())

        }

    override fun onDestroy() {
        super.onDestroy()
    }

}