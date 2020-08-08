package com.example.renoldhadihistorytidota2

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.renoldhadihistorytidota2.util.bind

class MainActivity : AppCompatActivity() {
    private val recyclerViewtiay : RecyclerView by bind(R.id.ActivityRecycleView)
    private var arrayList : ArrayList<tiaydata> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar?.run {
            setHomeAsUpIndicator(R.drawable.tampilan)
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowTitleEnabled(false)
        }
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT
        recyclerViewtiay.setHasFixedSize(true)
        arrayList.addAll(tiaydata)
    }
}