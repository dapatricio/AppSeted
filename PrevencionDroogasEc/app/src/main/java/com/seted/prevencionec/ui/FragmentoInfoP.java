/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.seted.prevencionec.R;


public class FragmentoInfoP extends android.support.v4.app.Fragment {
    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmento_informacion, container, false);

        ImageButton btn = (ImageButton)rootView.findViewById(R.id.btnImg1);
        ImageButton btn2 = (ImageButton)rootView.findViewById(R.id.btnImg2);
        ImageButton btn3 = (ImageButton)rootView.findViewById(R.id.btnImg3);
        ImageButton btn4 = (ImageButton)rootView.findViewById(R.id.btnImg4);
        ImageButton btn5 = (ImageButton)rootView.findViewById(R.id.btnImg5);
        ImageButton btn6 = (ImageButton)rootView.findViewById(R.id.btnImg6);
        ImageButton btn7 = (ImageButton)rootView.findViewById(R.id.btnImg7);
        ImageButton btn8 = (ImageButton)rootView.findViewById(R.id.btnImg8);
        ImageButton btn9 = (ImageButton)rootView.findViewById(R.id.btnImg9);
        ImageButton btn10 = (ImageButton)rootView.findViewById(R.id.btnImg10);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.seted.prevencionec.ui.ActividadInformacion1");
                startActivity(info);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.seted.prevencionec.ui.ActividadInformacion2");
                startActivity(info);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.seted.prevencionec.ui.ActividadInformacion3");
                startActivity(info);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.seted.prevencionec.ui.ActividadInformacion4");
                startActivity(info);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.seted.prevencionec.ui.ActividadInformacion5");
                startActivity(info);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.seted.prevencionec.ui.ActividadInformacion6");
                startActivity(info);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.seted.prevencionec.ui.ActividadInformacion7");
                startActivity(info);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.seted.prevencionec.ui.ActividadInformacion8");
                startActivity(info);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.seted.prevencionec.ui.ActividadInformacion9");
                startActivity(info);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.seted.prevencionec.ui.ActividadInfo10");
                startActivity(info);
            }
        });
        return rootView;
    }
}
