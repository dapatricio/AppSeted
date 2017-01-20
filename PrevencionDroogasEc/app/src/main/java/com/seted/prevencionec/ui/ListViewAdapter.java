/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.seted.prevencionec.R;

/**
 * Created by dapat on 20/1/2017.
 */

public class ListViewAdapter extends BaseAdapter {
    // Declare Variables
    Context context;
    String[] titulos;
    String[] subtitulo1;
    String[] subtitulo2;
    int[] imagenes;
    LayoutInflater inflater;

    public ListViewAdapter(Context context, String[] titulos, String[] subtitulo1, String[] subtitulo2, int[] imagenes) {
        this.context = context;
        this.titulos = titulos;
        this.subtitulo1 = subtitulo1;
        this.subtitulo2 = subtitulo2;
        this.imagenes = imagenes;
    }

    @Override
    public int getCount() {
        return titulos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Declare Variables
        TextView txtTitle, txtSubtitle1, txtSubtitle2;
        ImageView imgImg;

        //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.list_row, parent, false);

        // Locate the TextViews in listview_item.xml
        txtTitle = (TextView) itemView.findViewById(R.id.list_row_title);
        txtSubtitle1 = (TextView) itemView.findViewById(R.id.list_row_subtitleCant);
        txtSubtitle2 = (TextView) itemView.findViewById(R.id.list_row_subtitleTel);
        imgImg = (ImageView) itemView.findViewById(R.id.list_row_image);

        // Capture position and set to the TextViews
        txtTitle.setText(titulos[position]);
        txtSubtitle1.setText(subtitulo1[position]);
        txtSubtitle2.setText(subtitulo2[position]);
        imgImg.setImageResource(imagenes[position]);

        return itemView;
    }
}
