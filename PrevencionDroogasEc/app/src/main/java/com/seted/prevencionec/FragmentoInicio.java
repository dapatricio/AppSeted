/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.webkit.WebSettings;


public class FragmentoInicio extends android.support.v4.app.Fragment  {
    View rootView;
    WebView myWebView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmento_inicio, container, false);
        //url="https://twitter.com/prevendrogas_ec";

        myWebView = (WebView) rootView.findViewById(R.id.vistaWeb);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        myWebView.loadUrl("https://twitter.com/prevendrogas_ec");

        ImageButton btnRec = (ImageButton)rootView.findViewById(R.id.btnRecarg);
        btnRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myWebView = (WebView) rootView.findViewById(R.id.vistaWeb);
                myWebView.setWebViewClient(new WebViewClient());
                myWebView.loadUrl("https://twitter.com/prevendrogas_ec");
            }
        });
        return rootView;

    }


}

