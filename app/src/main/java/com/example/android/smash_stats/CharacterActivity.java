package com.example.android.smash_stats;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class CharacterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        String[] names = getResources().getStringArray(R.array.characters);
        String[] numbers = getResources().getStringArray(R.array.numbers);
        String[] sizes = getResources().getStringArray(R.array.size_stats);
        String[] weights = getResources().getStringArray(R.array.weight_stats);

        TextView characterNameView = (TextView) findViewById(R.id.character_name);
        TextView numberView = (TextView) findViewById(R.id.character_number);
        TextView sizeView = (TextView) findViewById(R.id.character_size);
        TextView weightView = (TextView) findViewById(R.id.character_weight);

        characterNameView.setText(names[MainActivity.charSelected]);
        numberView.setText(numbers[MainActivity.charSelected]);
        sizeView.setText(sizes[MainActivity.charSelected]);
        weightView.setText(weights[MainActivity.charSelected]);
    }
}
