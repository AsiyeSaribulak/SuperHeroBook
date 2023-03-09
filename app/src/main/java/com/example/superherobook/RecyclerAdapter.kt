package com.example.superherobook

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val kahramanListesi: ArrayList<String>, val kahramanGorselleri:ArrayList<Int>) :
    RecyclerView.Adapter<RecyclerAdapter.SuperHeroVH>() {

    class SuperHeroVH(view:View) :RecyclerView.ViewHolder(view){
        val recyclerViewTextView:TextView=view.findViewById(R.id.recyclerViewTextView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVH {
        //Layoutu inflate et yani arayüzü oluştur.burada recycler_rov.xml i bağlıyoruz

        val recyclerView =LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperHeroVH(recyclerView)
    }
    override fun getItemCount(): Int {
        // burada kaç tane item olacağını belirtiyoruz
       return kahramanListesi.size

    }

    override fun onBindViewHolder(holder: SuperHeroVH, position: Int) {

        holder.recyclerViewTextView.text=kahramanListesi.get(position)
        holder.recyclerViewTextView.setOnClickListener{
            val intent= Intent(holder.recyclerViewTextView.context,TanitimActivity::class.java)
            intent.putExtra("superKahramanIsmi",kahramanListesi.get(position))
            intent.putExtra("superKahramanGorseli",kahramanGorselleri.get(position))

            /*
            val singleton=SingletonClass.secilenKahraman
            singleton.gorsel=kahramanGorselleri.get(position)
            */
            holder.recyclerViewTextView.context.startActivity(intent)
        }
    }


}