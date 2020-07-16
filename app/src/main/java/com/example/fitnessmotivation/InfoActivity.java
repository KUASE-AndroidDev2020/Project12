package com.example.fitnessmotivation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.nio.channels.InterruptedByTimeoutException;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    public void goToLink1(View view) {
        Intent toLink1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.transparentlabs.com/blogs/all/chest-manifesto"));
        startActivity(toLink1);
    }

    public void goToLink2(View view) {
        Intent toLink2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://builtwithscience.com/best-workout-split/"));
        startActivity(toLink2);
    }

    public void goToLink3(View view) {
        Intent toLink3 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.healthline.com/nutrition/best-time-to-take-protein"));
        startActivity(toLink3);
    }

    public void goToLink4(View view) {
        Intent toLink4 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.transparentlabs.com/pages/calculator"));
        startActivity(toLink4);
    }
}