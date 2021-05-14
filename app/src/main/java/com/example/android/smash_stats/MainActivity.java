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
        characters.add("Luigi");
        characters.add("Ness");
        characters.add("Captain Falcon");
        characters.add("Jigglypuff");
        characters.add("Peach");
        characters.add("Daisy");
        characters.add("Bowser");
        characters.add("Ice Climbers");
        characters.add("Sheik");
        characters.add("Zelda");
        characters.add("Dr. Mario");
        characters.add("Pichu");
        characters.add("Falco");
        characters.add("Marth");
        characters.add("Lucina");
        characters.add("Young Link");
        characters.add("Ganondorf");
        characters.add("Mewtwo");
        characters.add("Roy");
        characters.add("Chrom");
        characters.add("Mr. Game & Watch");
        characters.add("Meta Knight");
        characters.add("Pit");
        characters.add("Dark Pit");
        characters.add("Zero Suit Samus");
        characters.add("Wario");
        characters.add("Snake");
        characters.add("Ike");
        characters.add("Pokemon Trainer");
        characters.add("Diddy Kong");
        characters.add("Lucas");
        characters.add("Sonic");
        characters.add("King Dedede");
        characters.add("Olimar");
        characters.add("Lucario");
        characters.add("R.O.B.");
        characters.add("Toon Link");
        characters.add("Wolf");
        characters.add("Villager");
        characters.add("Mega Man");
        characters.add("Wii Fit Trainer");
        characters.add("Rosalina & Luma");
        characters.add("Little Mac");
        characters.add("Greninja");
        characters.add("Mii Fighters");
        characters.add("Palutena");
        characters.add("Pac-Man");
        characters.add("Robin");
        characters.add("Shulk");
        characters.add("Bowser Jr.");
        characters.add("Duck Hunt");
        characters.add("Ryu");
        characters.add("Ken");
        characters.add("Cloud");
        characters.add("Corrin");
        characters.add("Bayonetta");
        characters.add("Inkling");
        characters.add("Ridley");
        characters.add("Simon");
        characters.add("Richter");
        characters.add("King K. Rool");
        characters.add("Isabelle");
        characters.add("Incineroar");
        characters.add("Piranha Plant");
        characters.add("Joker");
        characters.add("Hero");
        characters.add("Banjo & Kazooie");
        characters.add("Terry");
        characters.add("Byleth");
        characters.add("Min Min");
        characters.add("Steve/Alex");
        characters.add("Sephiroth");
        characters.add("Pyra/Mythra");

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