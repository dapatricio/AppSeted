/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.webkit.WebSettings;
import android.widget.ProgressBar;


public class FragmentoInicio extends android.support.v4.app.Fragment  {
    View rootView;
    WebView myWebView;
    private String url;
    private ProgressBar progressBar;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmento_inicio, container, false);
        url="https://twitter.com/prevendrogas_ec";
        progressBar = (ProgressBar)rootView.findViewById(R.id.progressBar);
        myWebView = (WebView) rootView.findViewById(R.id.vistaWeb);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        myWebView.loadUrl(url);

        progressBar.setVisibility(View.VISIBLE);
        progressBar.getIndeterminateDrawable().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
        myWebView.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                progressBar.setVisibility(View.GONE);
            }
        });


    return rootView;

    }


}

