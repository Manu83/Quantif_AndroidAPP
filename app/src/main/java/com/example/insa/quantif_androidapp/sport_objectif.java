package com.example.insa.quantif_androidapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;

public class sport_objectif extends AppCompatActivity {

    EditText editDuree, editDist, editCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_objectif);

        setTitle("Vélo - balade");

        editDuree = (EditText) findViewById(R.id.editText);
        editDist = (EditText) findViewById(R.id.editText2);
        editCal = (EditText) findViewById(R.id.editText3);

        RadioGroup rg = findViewById(R.id.radiogroup);

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

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2196F3")));

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radio1) {
                    editDuree.setFocusableInTouchMode(true);
                    editDist.setFocusable(false);
                    editCal.setFocusable(false);

                    editDuree.setTextColor(Color.BLACK);
                    editDist.setTextColor(Color.GRAY);
                    editCal.setTextColor(Color.GRAY);

                } else  if (checkedId == R.id.radio2) {
                    editDuree.setFocusable(false);
                    editDist.setFocusableInTouchMode(true);
                    editCal.setFocusable(false);

                    editDuree.setTextColor(Color.GRAY);
                    editDist.setTextColor(Color.BLACK);
                    editCal.setTextColor(Color.GRAY);

                } else if (checkedId == R.id.radio3) {
                    editDuree.setFocusable(false);
                    editDist.setFocusable(false);
                    editCal.setFocusableInTouchMode(true);

                    editDuree.setTextColor(Color.GRAY);
                    editDist.setTextColor(Color.GRAY);
                    editCal.setTextColor(Color.BLACK);
                }

            }
        });

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
