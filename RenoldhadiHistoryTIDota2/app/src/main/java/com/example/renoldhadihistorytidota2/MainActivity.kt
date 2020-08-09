package com.example.renoldhadihistorytidota2

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
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

       arrayList.addAll(Objektiay.listteay)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.data_diri){
            val opeAboutIntent = Intent(this@MainActivity,activitydatadiri::class.java)
            startActivity(opeAboutIntent)
        }
        return super.onOptionsItemSelected(item)
    }
    private fun showRecyclerList(){
        recyclerViewtiay.layoutManager=LinearLayoutManager(this)
        val listtiayadapter = tiayAdapter(arrayList)
        recyclerViewtiay.adapter= listtiayadapter
    }
    }
