package com.google.ar.core.examples.java.helloar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    Button lightingButton;
    Button surfacesButton;
    Button orientedPointsButton;
    Button userInteractionButton;

    Intent surfacesIntent;
    Intent lightingIntent;
    Intent orientedPointsIntent;
    Intent userInteractionIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        lightingButton = findViewById(R.id.btnLighting);
        surfacesButton = findViewById(R.id.btnHorizonalSurface);
        orientedPointsButton = findViewById(R.id.btnOrientedPoints);
        userInteractionButton = findViewById(R.id.btnUserInteraction);

        lightingIntent = new Intent(this, LightingActivity.class);
        surfacesIntent = new Intent(this, SurfacesActivity.class);
        orientedPointsIntent = new Intent(this, OrientedPointsActivity.class);
        userInteractionIntent = new Intent(this, UserInteractionActivity.class);

        lightingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(lightingIntent);
            }
        });

        surfacesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(surfacesIntent);
            }
        });

        orientedPointsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(orientedPointsIntent);
            }
        });

        userInteractionButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(userInteractionIntent);
            }
        });
    }
}
