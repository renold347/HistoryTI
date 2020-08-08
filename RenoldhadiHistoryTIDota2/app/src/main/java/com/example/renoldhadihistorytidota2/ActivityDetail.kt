package com.example.renoldhadihistorytidota2

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.renoldhadihistorytidota2.util.bind


class ActivityDetail : AppCompatActivity() {

    private val tvnamaseason : TextView by bind(R.id.name_tv)
    private val tvOverview : TextView by bind(R.id.Overview_Tv)
    private val tvOrganizer : TextView by bind(R.id.Organizer_tv)
    private val tvWinner : TextView by bind(R.id.Winner_tv)
    private val tvVersionMap : TextView by bind(R.id.Versionmap_tv)
    private val tvLocation : TextView by bind(R.id.Location_tv)
    private val tvVenue : TextView by bind(R.id.Venue_tv)
    private val tvDates :TextView by bind(R.id.Dates_tv)
    private val tvTeams :TextView by bind(R.id.Team_tv)
    private val tvPrizepool : TextView by bind(R.id.Prizepool_tv)
    private val ipPhoto : ImageView by bind(R.id.Logo_TI)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT

        val seasontiay = intent.getStringExtra(EXTRA_NAMA)
        val overview = intent.getStringExtra(EXTRA_OVERVIEW)
        val Organizer = intent.getStringExtra(EXTRA_ORGANIZER)
        val dWinner = intent.getStringExtra(EXTRA_WINNER)
        val VersiMap = intent.getStringExtra(EXTRA_MAP)
        val Location = intent.getStringExtra(EXTRA_LOKASI)
        val Venue = intent.getStringExtra(EXTRA_ARENA)
        val Dates = intent.getStringArrayExtra(EXTRA_DATES)
        val Teams = intent.getStringExtra(EXTRA_TEAMS)
        val Prizepool = intent.getStringExtra(EXTRA_PRIZE_POOL)
        val photos = intent.getIntExtra(EXTRA_LOGO_TI, 0)

        val actionBar= supportActionBar
        actionBar.run {
            this!!.title= seasontiay
            setDisplayHomeAsUpEnabled(true)
        }
        tvnamaseason.text= seasontiay
        tvOverview.text= overview
        tvOrganizer.text= Organizer
        tvWinner.text= dWinner
        tvVersionMap.text= VersiMap
        tvLocation.text= Location
        tvVenue.text= Venue
        tvDates.text= Dates.toString()
        tvTeams.text= Teams
        tvPrizepool.text=Prizepool
        Glide.with(this)
            .load(photos)
            .apply(RequestOptions())
            .into(ipPhoto)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    companion object{
        const val EXTRA_NAMA= "extra_name"
        const val EXTRA_OVERVIEW= "extra_overview"
        const val EXTRA_ORGANIZER = "extra_organizer"
        const val EXTRA_WINNER = "extra_winner"
        const val EXTRA_MAP = "extra_map"
        const val EXTRA_LOKASI = "extra_lokasi"
        const val EXTRA_ARENA = "extra_arena"
        const val EXTRA_DATES ="extra_dates"
        const val EXTRA_TEAMS ="extra_teams"
        const val EXTRA_PRIZE_POOL = "extra_prize_pool"
        const val EXTRA_LOGO_TI = "extra_logo_ti"
    }
}