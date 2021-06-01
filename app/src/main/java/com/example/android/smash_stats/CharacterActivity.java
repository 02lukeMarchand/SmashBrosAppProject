package com.example.android.smash_stats;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CharacterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        String[] names = getResources().getStringArray(R.array.characters);
        String[] numbers = getResources().getStringArray(R.array.numbers);
        String[] sizes = getResources().getStringArray(R.array.size_stats);
        String[] weights = getResources().getStringArray(R.array.weight_stats);
        String[] speeds = getResources().getStringArray(R.array.speed_stats);
        String[] powers = getResources().getStringArray(R.array.power);
        ArrayList<Integer> images = new ArrayList<Integer>();

        images.add(R.drawable.mario);
        images.add(R.drawable.donkeykong);
        images.add(R.drawable.link);
        images.add(R.drawable.samus);
        images.add(R.drawable.darksamus);
        images.add(R.drawable.yoshi);
        images.add(R.drawable.kirby);
        images.add(R.drawable.fox);
        images.add(R.drawable.pikachu);
        images.add(R.drawable.luigi);
        images.add(R.drawable.ness);
        images.add(R.drawable.captainfalcon);
        images.add(R.drawable.jigglypuff);
        images.add(R.drawable.peach);
        images.add(R.drawable.daisy);
        images.add(R.drawable.bowser);
        images.add(R.drawable.iceclimbers);
        images.add(R.drawable.sheik);
        images.add(R.drawable.zelda);
        images.add(R.drawable.drmario);
        images.add(R.drawable.pichu);
        images.add(R.drawable.falco);
        images.add(R.drawable.marth);
        images.add(R.drawable.lucina);
        images.add(R.drawable.younglink);
        images.add(R.drawable.ganondorf);
        images.add(R.drawable.mewtwo);
        images.add(R.drawable.roy);
        images.add(R.drawable.chrom);
        images.add(R.drawable.mrgameandwatch);
        images.add(R.drawable.metaknight);
        images.add(R.drawable.pit);
        images.add(R.drawable.darkpit);
        images.add(R.drawable.zerosuitsamus);
        images.add(R.drawable.wario);
        images.add(R.drawable.snake);
        images.add(R.drawable.ike);
        images.add(R.drawable.pokemontrainer);
        images.add(R.drawable.diddykong);
        images.add(R.drawable.lucas);
        images.add(R.drawable.sonic);
        images.add(R.drawable.kingdedede);
        images.add(R.drawable.olimar);
        images.add(R.drawable.lucario);
        images.add(R.drawable.rob);
        images.add(R.drawable.toonlink);
        images.add(R.drawable.wolf);
        images.add(R.drawable.villager);
        images.add(R.drawable.megaman);
        images.add(R.drawable.wiifittrainer);
        images.add(R.drawable.rosalinaluma);
        images.add(R.drawable.littlemac);
        images.add(R.drawable.greninja);
        images.add(R.drawable.miifighters);
        images.add(R.drawable.palutena);
        images.add(R.drawable.pacman);
        images.add(R.drawable.robin);
        images.add(R.drawable.shulk);
        images.add(R.drawable.bowserjr);
        images.add(R.drawable.duckhunt);
        images.add(R.drawable.ryu);
        images.add(R.drawable.ken);
        images.add(R.drawable.cloud);
        images.add(R.drawable.corrin);
        images.add(R.drawable.bayonetta);
        images.add(R.drawable.inkling);
        images.add(R.drawable.ridley);
        images.add(R.drawable.simon);
        images.add(R.drawable.richter);
        images.add(R.drawable.kingkrool);
        images.add(R.drawable.isabelle);
        images.add(R.drawable.incineroar);
        images.add(R.drawable.piranhaplant);
        images.add(R.drawable.joker);
        images.add(R.drawable.hero);
        images.add(R.drawable.banjo);
        images.add(R.drawable.terry);
        images.add(R.drawable.byleth);
        images.add(R.drawable.minmin);
        images.add(R.drawable.stevealex);
        images.add(R.drawable.sephiroth);
        images.add(R.drawable.pyramythra);

        TextView characterNameView = (TextView) findViewById(R.id.character_name);
        TextView numberView = (TextView) findViewById(R.id.character_number);
        TextView sizeView = (TextView) findViewById(R.id.character_size);
        TextView weightView = (TextView) findViewById(R.id.character_weight);
        TextView speedView = (TextView) findViewById(R.id.character_speed);
        TextView powerView = (TextView) findViewById(R.id.character_power);
        ImageView characterImage = (ImageView) findViewById(R.id.character_image);

        characterNameView.setText(names[MainActivity.charSelected]);
        numberView.setText(numbers[MainActivity.charSelected]);
        sizeView.setText(sizes[MainActivity.charSelected]);
        weightView.setText(weights[MainActivity.charSelected]);
        speedView.setText("Speed: " + speeds[MainActivity.charSelected]);
        powerView.setText("Power: " + powers[MainActivity.charSelected]);
        characterImage.setImageResource(images.get(MainActivity.charSelected));
    }
}
