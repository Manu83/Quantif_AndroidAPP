package com.example.insa.quantif_androidapp;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class sport_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_selection);

        setTitle("Activité");

        final ImageButton objectif = (ImageButton) findViewById(R.id.imageButton5);
        objectif.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sport_selection.this, sport_objectif.class);
                startActivity(intent);
            }
        });
    }
}
