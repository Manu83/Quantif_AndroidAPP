package com.example.insa.quantif_androidapp;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class sommeil_accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Historique de sommeil");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sommeil_accueil);
        final ImageButton objectif = (ImageButton) findViewById(R.id.imageButton7);
        objectif.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sommeil_accueil.this, sommeil_nuit.class);
                startActivity(intent);
            }
        });
        final ImageButton objectif2 = (ImageButton) findViewById(R.id.imageButton9);
        objectif2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sommeil_accueil.this, sommeil_semaine.class);
                startActivity(intent);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}

