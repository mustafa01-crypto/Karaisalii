package com.techno.karaisalgezirehberi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun konumDokuzoluk(view: View){

        val intent= Intent(applicationContext, MapsActivityFirst::class.java)
        startActivity(intent)
    }
    fun kanyonMaps(view: View){
        val intent= Intent(applicationContext, MapsActivitySecond::class.java)
        startActivity(intent)

    }
    fun mapsYerkopru(view: View){
        val intent= Intent(applicationContext, MapsActivityThird::class.java)
        startActivity(intent)
    }
    fun vardaMaps(view: View){
        val intent= Intent(applicationContext, MapsActivityFourth::class.java)
        startActivity(intent)
    }
    fun karapinarMaps(view: View){
        val intent= Intent(applicationContext, MapsActivityFifth::class.java)
        startActivity(intent)
    }

}