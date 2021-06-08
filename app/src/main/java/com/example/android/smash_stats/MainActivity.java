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
    String[] list;

    public static int charSelected = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = getResources().getStringArray(R.array.characters);

        for (int i = 0; i < list.length; i++){
            characters.add(list[i]);
        }

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, characters);

        GridView gridView = (GridView) findViewById(R.id.character_grid);

        gridView.setAdapter(itemsAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                charSelected = position;
                Intent numbersIntent = new Intent(MainActivity.this, CharacterActivity.class);
                startActivity(numbersIntent);
            }
        });
    }
}