/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.seted.prevencionec.R;

public class MapaGoogle extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    /*TextView cord1 = (TextView)findViewById(R.id.cord1);
    String[] latlong =  cord1.getText().toString().split(",");
    String lat = latlong[0];
    String lng = latlong[1];*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        /*Toast toast1 =
                Toast.makeText(getApplicationContext(),
                        coordenadas, Toast.LENGTH_SHORT);

        toast1.show();*/
        mapFragment.getMapAsync(this);

    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Bundle b = getIntent().getExtras();
        double latitude = b.getDouble("lat");
        double longitude = b.getDouble("lng");
        String nombCentro = b.getString("nombCent");
        String nombCant = b.getString("nombCant");
        LatLng coordenadas = new LatLng(latitude, longitude);

        // Add a marker in Sydney and move the camera

        mMap.addMarker(new MarkerOptions().position(coordenadas).title(nombCentro).draggable(true).snippet(nombCant)); //para personalizar el icono necesitamos .icon(BitmapDescriptorFactory.fromResourse(R.drawable.iconoGoogleMaps);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(coordenadas));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15f));
    }
}