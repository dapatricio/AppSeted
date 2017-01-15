/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.seted.prevencionec.R;

public class Actividad_lista extends AppCompatActivity {
        TableRow tabla1, tabla2, tabla3, tabla4;
        String canton, centroSalud1;
        TextView textCant, textCant1, textCant2, textCant3, nombCent1, nombCent2, nombCent3, nombCent4;
        double lat1, lng1, lat2, lng2, lat3, lng3, lat4, lng4;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.actividad_lista);


            tabla1 = (TableRow) findViewById(R.id.tabla1);
            tabla2 = (TableRow) findViewById(R.id.tabla2);
            tabla3 = (TableRow) findViewById(R.id.tabla3);
            tabla4 = (TableRow) findViewById(R.id.tabla4);
            Bundle b = getIntent().getExtras();
            canton = b.getString("canton");
            textCant = (TextView) findViewById(R.id.nomCant1);
            textCant.setText(canton);

            textCant1 = (TextView) findViewById(R.id.nomCant2);
            textCant1.setText(canton);

            textCant2 = (TextView) findViewById(R.id.nomCant3);
            textCant2.setText(canton);

            textCant3 = (TextView) findViewById(R.id.nomCant4);
            textCant3.setText(canton);

            nombCent1 = (TextView) findViewById(R.id.nomCent1);
            nombCent2 = (TextView) findViewById(R.id.nomCent2);
            nombCent3 = (TextView) findViewById(R.id.nomCent3);
            nombCent4 = (TextView) findViewById(R.id.nomCent4);

            if(canton.equals("Quito")){ //Comienza Pichincha ,,,
                lat1 = -0.090745;
                lng1 = -78.451393;
                lat2 = -0.095869;
                lng2 = -78.452344;
                lat3 = 0.141627;
                lng3 = -78.767257;
                lat4 = 0.229396;
                lng4 = -78.797778;
                nombCent1.setText("Centro de Salud #1 en "+canton);
                nombCent2.setText("Centro de Salud #2 en "+canton);
                nombCent3.setText("Centro de Salud #3 en "+canton);
                nombCent4.setText("Centro de Salud #4 en "+canton);
            }else if (canton.equals("Cayambe")){
                lat1 = 0.065447;
                lng1 = -78.134286;
                lat2 = 0.034418;
                lng2 = -78.146117;
                lat3 = 0.020223;
                lng3 = -78.147966;
                nombCent1.setText("Centro de Salud #1 en "+canton);
                nombCent2.setText("Centro de Salud #2 en "+canton);
                nombCent3.setText("Centro de Salud #3 en "+canton);
                tabla4.setVisibility(View.INVISIBLE);
            }else if (canton.equals("Mejia")){
                lat1 = -0.511308;
                lng1 = -78.563895;
                lat1 = -0.518541;
                lng1 = -78.584478;
                nombCent1.setText("Centro de Salud #1 en "+canton);
                nombCent2.setText("Centro de Salud #2 en "+canton);
                tabla3.setVisibility(View.INVISIBLE);
                tabla4.setVisibility(View.INVISIBLE); //Termina Pichincha
            }else if (canton.equals("Loja")){ //Comienza Loja ,,,
                lat1 = -4.217303;
                lng1 = -79.25948;
                lat2 = -3.859811;
                lng2 = -79.170161;
                lat3 = -3.992956;
                lng3 = -79.20585;
                lat4 = -4.00135;
                lng4 = -79.211181;
                nombCent1.setText("Centro de Salud #1 en "+canton);
                nombCent2.setText("Centro de Salud #2 en "+canton);
                nombCent3.setText("Centro de Salud #3 en "+canton);
                nombCent4.setText("Centro de Salud #4 en "+canton);
            }else if (canton.equals("Catamayo")){
                lat1 = -3.986581;
                lng1 = -79.357871;
                lat2 = -3.996482;
                lng2 = -79.367592;
                lat3 = -3.981938;
                lng3 = -79.349616;
                tabla3.setVisibility(View.INVISIBLE);
                nombCent1.setText("Centro de Salud #1 en "+canton);
                nombCent2.setText("Centro de Salud #2 en "+canton);
                nombCent3.setText("Centro de Salud #3 en "+canton);
            }else if (canton.equals("Paltas")){
                lat1 = -4.050239;
                lng1 = -79.649907;
                lat2 = -4.051523;
                lng2 = -79.648437;
                nombCent1.setText("Centro de Salud #1 en "+canton);
                nombCent2.setText("Centro de Salud #2 en "+canton);
                tabla3.setVisibility(View.INVISIBLE);
                tabla4.setVisibility(View.INVISIBLE);//Termina Loja
            }else if (canton.equals("Guayaquil")){ //Comienza Guayas
                lat1 = -2.189978;
                lng1 = -79.887757;
                lat2 = -2.141564;
                lng2 = -79.940093;
                lat3 = -2.146106;
                lng3 = -79.938521;
                lat4 = -2.148592;
                lng4 = -79.940079;
                nombCent1.setText("Centro de Salud #1 en "+canton);
                nombCent2.setText("Centro de Salud #2 en "+canton);
                nombCent3.setText("Centro de Salud #3 en "+canton);
                nombCent4.setText("Centro de Salud #4 en "+canton);
            }else if (canton.equals("Daule")){
                lat1 = -1.870401;
                lng1 = -79.980561;
                lat2 = -1.870463;
                lng2 = -79.980552;
                lat3 = -1.917616;
                lng3 = -79.889885;
                tabla3.setVisibility(View.INVISIBLE);
                nombCent1.setText("Centro de Salud #1 en "+canton);
                nombCent2.setText("Centro de Salud #2 en "+canton);
                nombCent3.setText("Centro de Salud #3 en "+canton);
            }else if (canton.equals("Playas")){
                lat1 = -2.63549;
                lng1 = -80.380129;
                lat1 = -2.635499;
                lng1 = -80.38095;
                tabla3.setVisibility(View.INVISIBLE);
                tabla4.setVisibility(View.INVISIBLE);
                nombCent1.setText("Centro de Salud #1 en "+canton);
                nombCent2.setText("Centro de Salud #2 en "+canton); //Termina Guayas
            }else if(canton.equals("Cuenca")){ // Comienza Azuay
                lat1 = -2.897421;
                lng1 = -79.004456;
                lat2 = -2.938738;
                lng2 = -78.96361;
                lat3 = -2.879732;
                lng3 = -78.987545;
                lat4 = -2.881908;
                lng4 = -78.965798;
                nombCent1.setText("Centro de Salud #1 en "+canton);
                nombCent2.setText("Centro de Salud #2 en "+canton);
                nombCent3.setText("Centro de Salud #3 en "+canton);
                nombCent4.setText("Centro de Salud #4 en "+canton);
            }else if(canton.equals("Gualaceo")){
                lat1 = -2.875772;
                lng1 = -78.742455;
                lat2 = -2.914167;
                lng2 = -78.756999;
                lat3 = -2.896794;
                lng3 = -78.753671;
                nombCent1.setText("Centro de Salud #1 en "+canton);
                nombCent2.setText("Centro de Salud #2 en "+canton);
                nombCent3.setText("Centro de Salud #3 en "+canton);
                tabla3.setVisibility(View.INVISIBLE);
            }else if(canton.equals("Girón")){
                lat1 = -3.163337;
                lng1 = -79.147858;
                lat1 = -3.162667;
                lng1 = -79.162315;
                tabla3.setVisibility(View.INVISIBLE);
                tabla4.setVisibility(View.INVISIBLE);
                nombCent1.setText("Centro de Salud #1 en "+canton);
                nombCent2.setText("Centro de Salud #2 en "+canton);// Termina Azuay
            }
            tabla1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    centroSalud1 = (String) nombCent1.getText();

                    Intent info = new Intent("com.seted.prevencionec.ui.MapaGoogle");
                    Bundle b = new Bundle();
                    b.putDouble("lat", lat1);
                    b.putDouble("lng", lng1);
                    b.putString("nombCent", centroSalud1);
                    b.putString("nombCant", canton);
                    info.putExtras(b);
                    startActivity(info);
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),lat1+","+lng1, Toast.LENGTH_SHORT);
                    toast1.show();
                }
            });
            tabla2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent info = new Intent("com.seted.prevencionec.ui.MapaGoogle");
                    Bundle b = new Bundle();
                    b.putDouble("lat", lat2);
                    b.putDouble("lng", lng2);
                    b.putString("nombCent", centroSalud1);
                    b.putString("nombCant", canton);
                    info.putExtras(b);
                    startActivity(info);

                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    lat2+","+lng2, Toast.LENGTH_SHORT);

                    toast1.show();
                }
            });
            tabla3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent info = new Intent("com.seted.prevencionec.ui.MapaGoogle");
                    Bundle b = new Bundle();
                    b.putDouble("lat", lat3);
                    b.putDouble("lng", lng3);
                    b.putString("nombCent", centroSalud1);
                    b.putString("nombCant", canton);
                    info.putExtras(b);
                    startActivity(info);

                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    lat3+","+lng3, Toast.LENGTH_SHORT);

                    toast1.show();
                }
            });
            tabla4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent info = new Intent("com.seted.prevencionec.ui.MapaGoogle");
                    Bundle b = new Bundle();
                    b.putDouble("lat", lat4);
                    b.putDouble("lng", lng4);
                    b.putString("nombCent", centroSalud1);
                    b.putString("nombCant", canton);
                    info.putExtras(b);
                    startActivity(info);

                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    lat4+","+lng4, Toast.LENGTH_SHORT);

                    toast1.show();
                }
            });
            ImageButton btn = (ImageButton)findViewById(R.id.btnBack);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });

            ImageButton btn1 = (ImageButton)findViewById(R.id.btnHome);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent info1 = new Intent("com.seted.prevencionec.ui.ActividadPrincipal");
                    startActivity(info1);
                }
            });
        }
}

