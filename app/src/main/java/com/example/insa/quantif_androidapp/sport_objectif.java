package com.example.insa.quantif_androidapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class sport_objectif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_objectif);

        setTitle("Vélo - balade");

        final ImageButton objectif = (ImageButton) findViewById(R.id.imageButton);
        objectif.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sport_objectif.this, sport_activite.class);
                startActivity(intent);
            }
        });

        final EditText time = findViewById(R.id.editText);

        final TextWatcher mTextEditorWatcher = new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            public void afterTextChanged(Editable s)
            {
                if( ( s.length()==2 | s.length()==5 ) && ( s.charAt(s.length() -1 ) | s.charAt(s.length() -1 ) ) != ':')
                    s.append(':');
            }
        };

        time.addTextChangedListener(mTextEditorWatcher);
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
