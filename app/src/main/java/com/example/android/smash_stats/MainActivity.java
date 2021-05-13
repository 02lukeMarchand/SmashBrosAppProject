package com.example.android.smash_stats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> characters = new ArrayList<String>();

    public static int charSelected = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        characters.add("Mario");
        characters.add("Donkey Kong");
        characters.add("Link");
        characters.add("Samus");
        characters.add("Dark Samus");
        characters.add("Yoshi");
        characters.add("Kirby");
        characters.add("Fox");
        characters.add("Pikachu");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, characters);

        GridView gridView = (GridView) findViewById(R.id.character_grid);

        gridView.setAdapter(itemsAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                charSelected = position + 1;
                Intent numbersIntent = new Intent(MainActivity.this, CharacterActivity.class);
                startActivity(numbersIntent);
            }
        });
    }
}