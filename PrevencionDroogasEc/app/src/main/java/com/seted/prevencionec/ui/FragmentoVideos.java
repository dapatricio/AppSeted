/*
 * Created by Daniel Peñarreta.
 * Copyright (c) 2016.  All rights reserved.
 */

package com.seted.prevencionec.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.seted.prevencionec.R;


public class FragmentoVideos extends android.support.v4.app.Fragment implements YouTubePlayer.OnInitializedListener {
    View rootView;
    LinearLayout vid1, vid2, vid3, vid4 ;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmento_videos, container, false);

        vid1 = (LinearLayout)rootView.findViewById(R.id.btnVd);
        vid2 = (LinearLayout)rootView.findViewById(R.id.btnVd1);
        vid3 = (LinearLayout)rootView.findViewById(R.id.btnVd2);
        vid4 = (LinearLayout)rootView.findViewById(R.id.btnVd3);

        vid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "qJXOKjTac2U";
                Intent info = new Intent("com.seted.prevencionec.ui.Actividad_Youtube");
                Bundle b = new Bundle();
                b.putString("url", url);
                info.putExtras(b);
                startActivity(info);
            }
        });
        vid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "7pSbb-dyBeA";
                Intent info = new Intent("com.seted.prevencionec.ui.Actividad_Youtube");
                Bundle b = new Bundle();
                b.putString("url", url);
                info.putExtras(b);
                startActivity(info);
            }
        });
        vid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "uu-pHbj0aEk";
                Intent info = new Intent("com.seted.prevencionec.ui.Actividad_Youtube");
                Bundle b = new Bundle();
                b.putString("url", url);
                info.putExtras(b);
                startActivity(info);
            }
        });
        vid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "75EdS2wzxCw";
                Intent info = new Intent("com.seted.prevencionec.ui.Actividad_Youtube");
                Bundle b = new Bundle();
                b.putString("url", url);
                info.putExtras(b);
                startActivity(info);
            }
        });
        return rootView;
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}