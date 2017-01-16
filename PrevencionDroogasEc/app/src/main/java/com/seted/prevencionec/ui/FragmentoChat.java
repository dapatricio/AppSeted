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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.seted.prevencionec.R;


public class FragmentoChat extends android.support.v4.app.Fragment {
    View rootView;
    private EditText texto;
    private RadioButton rad, rad1,rad2, rad4;
    private String usuario;
    private Intent chat ;
    private TextView descrip;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmento_chat, container, false);

        Button btnLlamar = (Button)rootView.findViewById(R.id.btnLlamar);
        Button btnSelec = (Button)rootView.findViewById(R.id.btnChat);
        rad = (RadioButton)rootView.findViewById(R.id.radio);
        rad1 = (RadioButton)rootView.findViewById(R.id.radio1);
        rad2 = (RadioButton)rootView.findViewById(R.id.radio2);
        rad4 = (RadioButton)rootView.findViewById(R.id.radio4);
        texto = (EditText)rootView.findViewById(R.id.descrip);

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
        btnSelec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rad.isChecked() == true) {
                    String texto1 = (String) rad.getText();
                    Toast toast = Toast.makeText(getContext(), texto1, Toast.LENGTH_LONG);
                    Intent info = new Intent("com.seted.prevencionec.ui.LoginActivity");
                    startActivity(info);
                    toast.show();
                }
                else {
                    //Dialogo
                    AlertDialog.Builder nombre = new AlertDialog.Builder(getContext());
                    nombre.setTitle("Escriba un alias: ");
                    nombre.setMessage("'Alias' es un nombre ficticio que puedes utilizar en nuestro chat");

                    final EditText input_field = new EditText(getContext());
                    nombre.setView(input_field);
                    nombre.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            usuario = input_field.getText().toString();
                            Intent info = new Intent("com.seted.prevencionec.ui.Chat_Room");
                            Bundle b = new Bundle();
                            b.putString("nombre", usuario);
                            info.putExtras(b);
                            startActivity(info);
                        }
                    });
                    nombre.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });

                    AlertDialog dialog = nombre.create();
                    dialog.show();
                    //fin dialogo
                if (rad1.isChecked() == true) {
                    String texto2 = (String) rad1.getText();
                    Toast toast = Toast.makeText(getContext(), texto2, Toast.LENGTH_LONG);
                    toast.show();
                }
                if (rad2.isChecked() == true) {
                    String texto3 = (String) rad2.getText();
                    Toast toast = Toast.makeText(getContext(), texto3, Toast.LENGTH_LONG);
                    toast.show();
                }
                if (rad4.isChecked() == true) {
                    String txt = texto.getText().toString();
                    Toast toast = Toast.makeText(getContext(), txt, Toast.LENGTH_LONG);
                    toast.show();
                }
            }

            }
        });


        /*final AlertDialog.Builder dialogo = new AlertDialog.Builder(getContext());
        dialogo.setMessage("Disculpa las molestias, seguimos trabajando en el Chat en Línea");
        dialogo.setTitle("En construcción");
        dialogo.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialogChat = dialogo.create();
        dialogChat.show();*/



        return rootView;
    }


}