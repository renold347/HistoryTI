package com.example.renoldhadihistorytidota2

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.renoldhadihistorytidota2.ActivityDetail



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
        val (nama,Winnerteam,Location,Venue,dates,teams,Prizepool,photo)= listtiay[position]
        val nContext = holder.itemView.context
        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.photo)

        holder.nama.text= nama
        holder.Winnerteam.text= "Winner : $Winnerteam"
        holder.itemView.setOnClickListener{
            val nDetail = Intent(nContext, ActivityDetail::class.java)
            nDetail.putExtra(ActivityDetail.EXTRA_NAMA, nama)
            nDetail.putExtra(ActivityDetail.EXTRA_OVERVIEW, )
            nDetail.putExtra(ActivityDetail.EXTRA_KODE_SWIFT, Location)
            nDetail.putExtra(ActivityDetail.EXTRA_ALAMAT_BANK, Venue)
            nDetail.putExtra(ActivityDetail.EXTRA_NO_TELP, dates)
            nDetail.putExtra(ActivityDetail.EXTRA_WEBSITE, teams)
            nDetail.putExtra(ActivityDetail.EXTRA_LOGO_BANK, Prizepool)
            nContext.startActivity(nDetail)
    }

    }

       inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var
       }
