package com.google.ar.core.examples.java.helloar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    Button lightingButton;
    Button surfacesButton;

    Intent surfacesIntent;
    Intent lightingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        lightingButton = findViewById(R.id.btnLighting);
        surfacesButton = findViewById(R.id.btnHorizonalSurface);

        lightingIntent = new Intent(this, LightingActivity.class);

        lightingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(lightingIntent);
            }
        });
    }
}
