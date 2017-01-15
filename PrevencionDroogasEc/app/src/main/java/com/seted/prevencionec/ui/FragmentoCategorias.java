/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.seted.prevencionec.R;


public class FragmentoCategorias extends android.support.v4.app.Fragment  {
    View rootView;
    private Spinner spinner_animales, spinnerCant;
    private ArrayAdapter spinner_adapter, spinner_adapterCant;
    Button btn, btnBuscar, btnBuscarCant;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmento_categorias, container, false);

        btn= (Button)rootView.findViewById(R.id.btnBuscarCant);
        spinner_animales = (Spinner)rootView.findViewById(R.id.spinner_animales);
        spinner_adapter = ArrayAdapter.createFromResource( this.getContext(), R.array.provincias , android.R.layout.simple_spinner_item);
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_animales.setAdapter(spinner_adapter);

        btnBuscar = (Button) rootView.findViewById(R.id.btnBuscarProv);
        btnBuscarCant = (Button) rootView.findViewById(R.id.btnBuscarCant);

        btn.setEnabled(false);

        btnBuscar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setMessage("¿Deseas seleccionar la Provincia: "+spinner_animales.getItemAtPosition(spinner_animales.getSelectedItemPosition()).toString()+" ?");
                dialog.setTitle("Alerta");

                dialog.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btn.setEnabled(true);
                        btnBuscar.setEnabled(false);
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

                String texto = spinner_animales.getItemAtPosition(spinner_animales.getSelectedItemPosition()).toString();
                Toast toast = Toast.makeText(getContext(), texto, Toast.LENGTH_LONG);
                toast.show();

                if (texto.equals("Pichincha")){
                    spinnerCant = (Spinner)rootView.findViewById(R.id.spinnerCant);
                    spinner_adapterCant = ArrayAdapter.createFromResource( getContext(), R.array.cantonPichin , android.R.layout.simple_spinner_item);
                    spinner_adapterCant.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerCant.setAdapter(spinner_adapterCant);
                }else if (texto.equals("Loja")){
                    spinnerCant = (Spinner)rootView.findViewById(R.id.spinnerCant);
                    spinner_adapterCant = ArrayAdapter.createFromResource( getContext(), R.array.cantonLoja , android.R.layout.simple_spinner_item);
                    spinner_adapterCant.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerCant.setAdapter(spinner_adapterCant);
                }else if (texto.equals("Azuay")){
                    spinnerCant = (Spinner)rootView.findViewById(R.id.spinnerCant);
                    spinner_adapterCant = ArrayAdapter.createFromResource( getContext(), R.array.cantonAzuay , android.R.layout.simple_spinner_item);
                    spinner_adapterCant.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerCant.setAdapter(spinner_adapterCant);
                }else if (texto.equals("Guayas")){
                    spinnerCant = (Spinner)rootView.findViewById(R.id.spinnerCant);
                    spinner_adapterCant = ArrayAdapter.createFromResource( getContext(), R.array.cantonGuayas , android.R.layout.simple_spinner_item);
                    spinner_adapterCant.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerCant.setAdapter(spinner_adapterCant);
                }
            }

        });
        btnBuscarCant.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setMessage("¿Deseas seleccionar el Canton: "+spinnerCant.getItemAtPosition(spinnerCant.getSelectedItemPosition()).toString()+" ?");
                dialog.setTitle("Alerta");

                dialog.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btnBuscar.setEnabled(true);
                        String texto1 = spinnerCant.getItemAtPosition(spinnerCant.getSelectedItemPosition()).toString();
                        Toast toast = Toast.makeText(getContext(), texto1, Toast.LENGTH_LONG);
                        toast.show();
                        Intent info = new Intent("com.seted.prevencionec.ui.ActividadLista");
                        Bundle b = new Bundle();
                        b.putString("canton", texto1);
                        info.putExtras(b);
                        startActivity(info);
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