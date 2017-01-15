/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.seted.prevencionec.R;


public class FragmentoRedes extends android.support.v4.app.Fragment {
    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmento_redes, container, false);


        Button btnLlamar = (Button)rootView.findViewById(R.id.btnLlamar);
        ImageButton btn1 = (ImageButton)rootView.findViewById(R.id.btnFace);
        ImageButton btn2 = (ImageButton)rootView.findViewById(R.id.btnYoutube);
        ImageButton btn3 = (ImageButton)rootView.findViewById(R.id.btnTwitter);
        ImageButton btn4 = (ImageButton)rootView.findViewById(R.id.btnRetuco);
        ImageButton btn5 = (ImageButton)rootView.findViewById(R.id.btnWeb);
        ImageButton btn6 = (ImageButton)rootView.findViewById(R.id.btnFlickr);
        ImageButton btn7 = (ImageButton)rootView.findViewById(R.id.btnPreven);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.facebook.com/PrevencionDrogasEcuador");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCOGHbohRAOTaSvXxgh24_AQ");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://twitter.com/prevendrogas_ec");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://retuco.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.hablaconellos.com.ec/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.flickr.com/photos/prevenciondrogasecuador/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.prevenciondrogas.gob.ec/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setMessage("¿Deseas efectuar una llamada?");
                dialog.setTitle("Alerta");
                dialog.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try{
                            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:1800335486")));
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                });{
                    dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });

                    AlertDialog most = dialog.create();
                    most.show();
                }

            }
        });
        return rootView;
    }
}