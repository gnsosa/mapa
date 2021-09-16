package com.example.myapplicationmapa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationmapa.databinding.ActivityMapsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }






    /**      * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.       */

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val sydney = LatLng(-41.13183714728229, -71.33091673197895)
       // mMap.addMarker(MarkerOptions().position(sydney).title("1. Bariloche"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
        // funciona zoom
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 14F))

       mMap.addMarker(MarkerOptions().position(sydney).title("Micro").snippet("1.Hora de partida:18hs").icon(BitmapDescriptorFactory.fromResource(R.mipmap.parada)))


        /* ver si la camara queda centrada
        val mountainView = LatLng(-41.1336207, -71.3103481)
        val cameraPosition = CameraPosition.Builder()
            .target(mountainView) // Sets the center of the map to Mountain View
            .zoom(17f)            // Sets the zoom
            .bearing(90f)         // Sets the orientation of the camera to east
            .tilt(30f)            // Sets the tilt of the camera to 30 degrees
            .build()              // Creates a CameraPosition from the builder
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))

*/


        val punto2 = LatLng(-41.1336207, -71.3103481)
        mMap.addMarker(MarkerOptions().position(punto2).title("3. Centro Civico").snippet("2hs para recorrer").icon(BitmapDescriptorFactory.fromResource(R.mipmap.tresito)))
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(punto3)))
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(punto2))
        //googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(punto2, 17F))


      val punto3 = LatLng(-41.1321129, -71.3233841)
        mMap.addMarker(MarkerOptions().position(punto3).title("2. Museo del Chocolate").snippet("2hs para recorrer").icon(BitmapDescriptorFactory.fromResource(R.mipmap.dosito_round)))
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(punto3))
       // googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(punto3, 17F))

       val punto4 = LatLng(-41.136790794405904, -71.32749139710202)
        mMap.addMarker(MarkerOptions().position(punto4).title("1. Cerro Runge").snippet("2hs para recorrer").icon(BitmapDescriptorFactory.fromResource(R.mipmap.unito_round)))
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(punto3))
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(punto4))
       // googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(punto4, 17F))






















    }
}