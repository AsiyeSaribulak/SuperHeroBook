package com.example.superherobook

import android.content.res.Resources.Theme
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.*


class MainActivity : AppCompatActivity() {

  private  lateinit var recyclerAdapter: RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //veri hazırlığı
        val superkahramanIsimleri=ArrayList<String>()
        superkahramanIsimleri.add("İronman")
        superkahramanIsimleri.add("Batman")
        superkahramanIsimleri.add("Kaptan Amerika")
        superkahramanIsimleri.add("Spiderman")
        superkahramanIsimleri.add("Wonder Women")

        /*//verimsiz tanımlamalar//
        val batmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val ironBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val kaptanAmerikaBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.kaptanamerikajpg)
        val spiderBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman1)
        val wonderWomenBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.wonderwomen)

        val superkahramanGorselleri=ArrayList<Bitmap>()
        superkahramanGorselleri.add(batmanBitmap)
        superkahramanGorselleri.add(ironBitmap)
        superkahramanGorselleri.add(kaptanAmerikaBitmap)
        superkahramanGorselleri.add(spiderBitmap)
        superkahramanGorselleri.add(wonderWomenBitmap)*/

        //verimli tanımlamalar
        val ironmanDrawableId=R.drawable.ironman
        val batmanDrawableId=R.drawable.batman
        val kaptanAmerikaDrawableId=R.drawable.kaptanamerikajpg
        val spidermanDrawableId=R.drawable.spiderman1
        val wonderWomenDrawableId=R.drawable.wonderwomen

        val superkahramanGorselleri=ArrayList<Int>()
        superkahramanGorselleri.add(ironmanDrawableId)
        superkahramanGorselleri.add(batmanDrawableId)
        superkahramanGorselleri.add(kaptanAmerikaDrawableId)
        superkahramanGorselleri.add(spidermanDrawableId)
        superkahramanGorselleri.add(wonderWomenDrawableId)



        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager
        recyclerAdapter= RecyclerAdapter(superkahramanIsimleri,superkahramanGorselleri)
        recyclerView.adapter=recyclerAdapter





    }
}