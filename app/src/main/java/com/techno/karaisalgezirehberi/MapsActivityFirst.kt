package com.techno.karaisalgezirehberi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivityFirst : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_first)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val dokuzoluk = LatLng(37.387736,35.2091848)
        mMap.addMarker(MarkerOptions().position(dokuzoluk).title("Dokuzoluk Köprübaşı"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dokuzoluk))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dokuzoluk,15f))


    }
}