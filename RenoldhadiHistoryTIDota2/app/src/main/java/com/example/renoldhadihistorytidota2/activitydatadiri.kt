package com.example.renoldhadihistorytidota2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class activitydatadiri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitydatadiri)
        val actionBar = supportActionBar
        actionBar.run {
            this!!.title = "About Me"
            setDisplayHomeAsUpEnabled(true)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}