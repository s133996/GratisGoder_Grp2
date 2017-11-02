package com.example.marcus.gratisgoder_grp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Liste extends AppCompatActivity implements AdapterView.OnItemClickListener {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);



        String[] lokationer = {"legeplads", "kirkegaard", "bakke", "skov", "toilet", "biblotek", "Tyskland",
                "fodboldbane", "isbil", "gratis massage", "ikke gratis massage", "sø", "gård", "festival", "cirkus","ok","gris","øf","tekst","tekst","tekst","tekst","tekst","tekst","tekst","tekst","tekst","tekst"};


        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_liste, R.id.overskrift, lokationer);

        ListView listView = new ListView(this);
        listView.setOnItemClickListener(this);
        listView.setAdapter(adapter);

        setContentView(listView);
    }

    public void onItemClick(AdapterView<?> liste, View v, int position, long id) {
        Toast.makeText(this, "Klik på " + position, Toast.LENGTH_SHORT).show();
    }
}
