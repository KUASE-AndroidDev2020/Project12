package com.example.fitnessmotivation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class SaveActivity extends AppCompatActivity {

    private EditText editText;
    private Button applyTextButton;
    private Button saveButton;
    private Switch switch1;
    private EditText Reps1;
    private EditText Reps2;
    private EditText Reps3;
    private EditText Note1;
    private EditText Weight2;
    private EditText Note2;
    private EditText Note3;
    private EditText Weight3;


    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";
    public static final String TEXT1 = "text1";
    public static final String TEXT2 = "text2";
    public static final String SWITCH1 = "switch1";
    public static final String TEXT3 = "text3";
    public static final String TEXT4 = "text4";
    public static final String TEXT5 = "text5";
    public static final String TEXT6 = "text6";
    public static final String TEXT7 = "text7";
    public static final String TEXT8 = "text8";

    private String text;
    private String text2;
    private boolean switchOnOff;
    private String text1;
    private String text3;
    private String text4;
    private String text5;
    private String text6;
    private String text7;
    private String text8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        editText = (EditText) findViewById(R.id.Weight1);
        applyTextButton = (Button) findViewById(R.id.apply_text_button);
        saveButton = (Button) findViewById(R.id.save_button);
        switch1 = (Switch)findViewById(R.id.switch1);
        Reps1 = (EditText)findViewById(R.id.Reps1);
        Note1 = (EditText)findViewById(R.id.Note1);
        Weight2 = (EditText)findViewById(R.id.Weight2);
        Weight3 = (EditText)findViewById(R.id.Weight3);
        Reps2 = (EditText)findViewById(R.id.Reps2);
        Note2 = (EditText)findViewById(R.id.Note2);
        Note3 = (EditText)findViewById(R.id.Note3);
        Reps3 = (EditText)findViewById(R.id.Reps3);


        applyTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().toString());
                editText.setText(Reps1.getText().toString());
                editText.setText(Note1.getText().toString());
                editText.setText(Note2.getText().toString());
                editText.setText(Note3.getText().toString());
                editText.setText(Weight2.getText().toString());
                editText.setText(Reps2.getText().toString());
                editText.setText(Reps3.getText().toString());
                editText.setText(Weight3.getText().toString());

            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });

        loadData();
        updateViews();
    }

    public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT, editText.getText().toString());
        editor.putString(TEXT1, Reps1.getText().toString());
        editor.putString(TEXT2, Note1.getText().toString());
        editor.putString(TEXT3, Weight2.getText().toString());
        editor.putString(TEXT4, Reps2.getText().toString());
        editor.putString(TEXT7, Reps3.getText().toString());
        editor.putString(TEXT5, Note2.getText().toString());
        editor.putString(TEXT8, Note3.getText().toString());
        editor.putString(TEXT6, Weight3.getText().toString());
        editor.putBoolean(SWITCH1, switch1.isChecked());




        editor.apply();

        Toast.makeText(this,"Data Saved", Toast.LENGTH_SHORT).show();
    }

    public void loadData (){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "Weight");
        text1 = sharedPreferences.getString(TEXT1, "Reps");
        text2 = sharedPreferences.getString(TEXT2,"Note");
        text3 = sharedPreferences.getString(TEXT3, "Weight");
        text4 = sharedPreferences.getString(TEXT4, "Reps");
        text5 = sharedPreferences.getString(TEXT5,"Note");
        text6 = sharedPreferences.getString(TEXT6, "Weight");
        text7 = sharedPreferences.getString(TEXT7, "Reps");
        text8 = sharedPreferences.getString(TEXT5,"Note");
        switchOnOff = sharedPreferences.getBoolean(SWITCH1, false);
    }

    public  void updateViews (){
        editText.setText(text);
        switch1.setChecked(switchOnOff);
        Reps1.setText(text1);
        Note1.setText(text2);
        Note2.setText(text5);
        Note3.setText(text8);
        Weight2.setText(text3);
        Reps2.setText(text4);
        Weight3.setText(text6);
        Reps3.setText(text7);
    }
}