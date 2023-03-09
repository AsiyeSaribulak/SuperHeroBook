package com.example.superherobook

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class TanitimActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val intent=intent
        val secilenKahramanIsmi=intent.getStringExtra("superKahramanIsmi")
        textView=findViewById<TextView>(R.id.textView1)
        textView.text=secilenKahramanIsmi

        val secilenKahramanGorseli=intent.getIntExtra("superKahramanGorseli",0)
        val bitmap=BitmapFactory.decodeResource(applicationContext.resources,secilenKahramanGorseli)
        imageView=findViewById<ImageView>(R.id.imageView2)
        imageView.setImageBitmap(bitmap)

//        val secilenKahraman=SingletonClass.secilenKahraman
//        val secilenGorsel=secilenKahraman.gorsel
//        imageView=findViewById<ImageView>(R.id.imageView2)
//        imageView.setImageBitmap(secilenGorsel)
    }
}