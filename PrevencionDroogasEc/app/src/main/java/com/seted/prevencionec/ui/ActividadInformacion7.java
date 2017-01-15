/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.seted.prevencionec.R;

public class ActividadInformacion7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_informacion7);

        Button btn = (Button)findViewById(R.id.btnVolver);
        btn.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
