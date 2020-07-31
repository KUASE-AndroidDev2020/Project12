package com.example.fitnessmotivation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {
    private ImageView button2;
    private ImageView pullups;
    private ImageView sideraise;
    private ImageView BarbellCurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        BarbellCurl = (ImageView)findViewById(R.id.BarbellCurl);
        BarbellCurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoutubeBC();
            }
        });

        pullups = (ImageView) findViewById(R.id.pullups);
        pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoutubePU();
            }
        });

        button2 = (ImageView) findViewById(R.id.Benchpress);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoutubeBP();
            }
        });

        sideraise = (ImageView)findViewById(R.id.sideraise);
        sideraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYoutubeSLL();
            }
        });
    }

    public void openYoutubeBP() {
        Intent intent = new Intent(this, YoutubeBP.class);
        startActivity(intent);
    }

    public  void openYoutubePU(){
        Intent intent = new Intent(this, YoutubePU.class);
        startActivity(intent);
    }

    public void openYoutubeSLL(){
        Intent intent = new Intent(this,YoutubeSLL.class);
        startActivity(intent);
    }

    public void openYoutubeBC(){
        Intent intent = new Intent(this, YoutubeBC.class);
        startActivity(intent);
    }
}