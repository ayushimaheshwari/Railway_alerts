package com.example.ayushi.railway_alerts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        ImageButton track;
        ImageButton details;
        ImageButton maps;
        track=(ImageButton)findViewById(R.id.imageButton);
        details=(ImageButton)findViewById(R.id.imageButton2);
        maps=(ImageButton)findViewById(R.id.imageButton3);
        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setIntent(new Intent(com.example.ayushi.railway_alerts.Main7Activity.this,com.example.ayushi.railway_alerts.Main8Activity.class));
                startActivity(getIntent());
            }
        });
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setIntent(new Intent(com.example.ayushi.railway_alerts.Main7Activity.this,com.example.ayushi.railway_alerts.Main9Activity.class));
                     startActivity(getIntent());
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setIntent(new Intent(com.example.ayushi.railway_alerts.Main7Activity.this,com.example.ayushi.railway_alerts.Main3Activity.class));
                 startActivity(getIntent());
            }
        });
    }
}
