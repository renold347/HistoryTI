package com.example.renoldhadihistorytidota2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager


@Suppress("DEPRECATION")
class LoadActivity : AppCompatActivity() {
    private  val loadTime:Long=3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)
        with(window){
            setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, loadTime)


}}