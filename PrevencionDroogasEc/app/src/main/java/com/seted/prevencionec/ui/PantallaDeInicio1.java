/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec.ui;

/**
 * Created by dapat on 08/09/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.seted.prevencionec.R;


public class PantallaDeInicio1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalladeinicio1);

        //Vamos a declarar un nuevo thread
        Thread timer = new Thread(){
            //El nuevo Thread exige el metodo run
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    //Si no puedo ejecutar el sleep muestro el error
                    e.printStackTrace();
                }finally{
                    //Llamo a la nueva actividad
                    //startActivity recibe por parametro un objeto del tipo Intent
                    //El Intent recibibe por parametro el NAME de la actividad que vamos a invocar
                    //Es el mismo que colocamos en el manifiesto
                    Intent principal = new Intent("com.seted.prevencionec.ui.ActividadPrincipal");
                    startActivity(principal);;
                }
            }
        };
        //ejecuto el thread
        timer.start();
    }

}
