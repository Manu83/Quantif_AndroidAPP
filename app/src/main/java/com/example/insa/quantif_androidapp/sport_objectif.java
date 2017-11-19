package com.example.insa.quantif_androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sport_objectif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_objectif);

        final ImageButton objectif = (ImageButton) findViewById(R.id.imageButton);
        objectif.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sport_objectif.this, sport_activite.class);
                startActivity(intent);
            }
        });
    }
}
