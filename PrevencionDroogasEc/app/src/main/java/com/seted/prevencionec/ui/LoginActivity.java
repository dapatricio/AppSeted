/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.seted.prevencionec.R;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    private EditText inputEmail, inputPassword;
    private FirebaseAuth auth;
    private ProgressBar progressBar;
    private Button btnSignup, btnLogin, btnReset;
    private DatabaseReference root = FirebaseDatabase.getInstance().getReference().getRoot();
    private String user_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Get Firebase auth instance
        auth = FirebaseAuth.getInstance();

        if (auth.getCurrentUser() != null) {
            startActivity(new Intent(LoginActivity.this, Principal.class));
            finish();
        }

        // set the view now
        setContentView(R.layout.activity_login);


        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        dialogo.setMessage("Nunca te pediremos tu nombre real, siempre utiliza un alias...");
        dialogo.setTitle("Recuerda");
        dialogo.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialogChat = dialogo.create();
        dialogChat.show();

        inputEmail = (EditText) findViewById(R.id.email);
        inputPassword = (EditText) findViewById(R.id.password);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        btnSignup = (Button) findViewById(R.id.btn_signup);
        btnLogin = (Button) findViewById(R.id.btn_login);
        //btnReset = (Button) findViewById(R.id.btn_reset_password);

        //Get Firebase auth instance
        auth = FirebaseAuth.getInstance();

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.seted.prevencionec.ui.SignupActivity");
                startActivity(info);
            }
        });

        /*btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent("com.seted.prevencionec.ui.ResetPasswordActivity");
                startActivity(info);
            }
        });*/

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputEmail.getText().toString();
                final String password = inputPassword.getText().toString();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Ingresa un alias!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Ingresa una clave!", Toast.LENGTH_SHORT).show();
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);

                //authenticate user
                auth.signInWithEmailAndPassword(email+"@gmail.com", password)
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                // If sign in fails, display a message to the user. If sign in succeeds
                                // the auth state listener will be notified and logic to handle the
                                // signed in user can be handled in the listener.
                                progressBar.setVisibility(View.GONE);
                                user_name = inputEmail.getText().toString();
                                if (!task.isSuccessful()) {
                                    // there was an error
                                    if (password.length() < 6) {
                                        inputPassword.setError(getString(R.string.minimum_password));
                                    } else {
                                        Toast.makeText(LoginActivity.this, getString(R.string.auth_failed), Toast.LENGTH_LONG).show();
                                    }
                                } else {
                                    if(user_name.equals("seted")){
                                        Intent info1 = new Intent("com.seted.prevencionec.ui.ListaChats");
                                        Bundle c = new Bundle();
                                        c.putString("nombre", user_name);
                                        info1.putExtras(c);
                                        startActivity(info1);
                                        String chat_room = "chat"+(inputEmail.getText().toString());
                                        Map<String, Object> map = new HashMap<String, Object>();
                                        map.put(inputEmail.getText().toString(),"");
                                        root.updateChildren(map);

                                        finish();
                                    }else{

                                        Intent info1 = new Intent("com.seted.prevencionec.ui.Principal");
                                        Bundle c = new Bundle();
                                        c.putString("nombre", user_name);
                                        info1.putExtras(c);
                                        startActivity(info1);

                                        String chat_room = "chat" + (inputEmail.getText().toString());

                                        Map<String, Object> map = new HashMap<String, Object>();
                                        map.put(inputEmail.getText().toString(), "");
                                        root.updateChildren(map);

                                        finish();
                                    }
                                }
                            }
                        });
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
