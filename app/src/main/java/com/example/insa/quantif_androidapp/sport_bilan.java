package com.example.insa.quantif_androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sport_bilan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_bilan);

        setTitle("Activité terminée");

        final ImageButton objectif = (ImageButton) findViewById(R.id.imageButton3);
        objectif.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sport_bilan.this, MenuPrincipal.class);
                startActivity(intent);
            }
        });
    }
}
