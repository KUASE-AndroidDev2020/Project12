package com.example.fitnessmotivation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class OptionActivity extends AppCompatActivity {
    private ImageView imageButton2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        imageButton2 = (ImageView)findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSaveActivity();

            }
        });
    }

    public void openSaveActivity(){
        Intent intent = new Intent(this,SaveActivity.class);
        startActivity(intent);
    }

}