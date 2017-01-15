/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.seted.prevencionec.R;

public class Act_chat extends AppCompatActivity {

    private EditText txtUsuario, txtClave;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_chat);

        txtUsuario = (EditText)findViewById(R.id.txtUsuario);
        txtClave = (EditText)findViewById(R.id.txtClave);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VerificarLogin(txtUsuario.getText().toString().toLowerCase(), txtClave.getText().toString().toLowerCase());
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
    public void VerificarLogin(String user, String clave){

    }
}
