/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec.ui;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.seted.prevencionec.R;

/**
 * Actividad para la configuración de preferencias
 */

public class ActividadConfiguracion extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_configuracion);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.contenedor_configuracion, new FragmentoConfiguracion());
        ft.commit();

        agregarToolbar();
    }

    private void agregarToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setDisplayHomeAsUpEnabled(true);
        }
    }

    public static class FragmentoConfiguracion extends PreferenceFragment {

        public FragmentoConfiguracion() {
            // Constructor Por Defecto
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferencias);
        }
    }
}