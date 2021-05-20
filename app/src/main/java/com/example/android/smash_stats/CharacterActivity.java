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
        String[] numbers = getResources().getStringArray(R.array.numbers);

        TextView characterNameView = (TextView) findViewById(R.id.character_name);
        TextView numberView = (TextView) findViewById(R.id.character_number);

        characterNameView.setText(names[MainActivity.charSelected]);
        numberView.setText(numbers[MainActivity.charSelected]);
    }
}
