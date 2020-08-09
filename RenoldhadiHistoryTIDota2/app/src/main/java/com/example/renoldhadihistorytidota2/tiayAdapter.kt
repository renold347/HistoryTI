package com.example.renoldhadihistorytidota2

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions




class tiayAdapter (private val listtiay : ArrayList<tiaydata>) : RecyclerView.Adapter<tiayAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return ListViewHolder(view)
}

    override fun getItemCount(): Int {
        return listtiay.size
    }

    @SuppressLint("setTextI18n")
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (namatiay,overview,organizer,winnerteam,map,location, venue,dates,teams,prizepool, photo)= listtiay[position]
        val nContext = holder.itemView.context
        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.photo)

        holder.namatiay.text= namatiay
        holder.winnerteam.text= "Winner : $winnerteam"
        holder.itemView.setOnClickListener{
            val nDetail = Intent(nContext, ActivityDetail::class.java)
            nDetail.putExtra(ActivityDetail.EXTRA_NAMA, namatiay)
            nDetail.putExtra(ActivityDetail.EXTRA_OVERVIEW, overview)
            nDetail.putExtra(ActivityDetail.EXTRA_ORGANIZER, organizer)
            nDetail.putExtra(ActivityDetail.EXTRA_WINNER, winnerteam)
            nDetail.putExtra(ActivityDetail.EXTRA_MAP, map)
            nDetail.putExtra(ActivityDetail.EXTRA_LOKASI, location)
            nDetail.putExtra(ActivityDetail.EXTRA_ARENA, venue)
            nDetail.putExtra(ActivityDetail.EXTRA_DATES, dates)
            nDetail.putExtra(ActivityDetail.EXTRA_TEAMS,teams)
            nDetail.putExtra(ActivityDetail.EXTRA_PRIZE_POOL,prizepool)
            nDetail.putExtra(ActivityDetail.EXTRA_LOGO_TI, photo)
            nContext.startActivity(nDetail)
    }

    }

       inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
           var namatiay: TextView =itemView.findViewById(R.id.TI_season)
           var winnerteam:TextView=itemView.findViewById(R.id.Thewinner)
           var photo : ImageView = itemView.findViewById(R.id.TI_img)
       }}
