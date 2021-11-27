package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent

class DetailSuperheroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_superhero)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val superhero = intent.getParcelableArrayExtra<Superhero>(MainActivity.INTENT_PARCELABLE)

        val imgSuperhero = findViewById<>(R.id.img_item_photo)
        val nameSuperhero = findViewById<>(R.id.tv_item_name)
        val descSuperhero = findViewById<>(R.id.tv_item_description)

        imgSuperhero.setImageResource(superhero?.imgSuperhero!!)
        nameSuperhero.text = superhero.nameSuperhero
        descSuperhero.text = superhero.descSuperhero
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}
