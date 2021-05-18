package com.example.android.smash_stats;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CharacterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        String[] names = getResources().getStringArray(R.array.characters);

        TextView textView = (TextView) findViewById(R.id.textviewww);

        textView.setText(names[MainActivity.charSelected]);
    }
}
