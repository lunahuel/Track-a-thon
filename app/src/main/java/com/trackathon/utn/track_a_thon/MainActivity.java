package com.trackathon.utn.track_a_thon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnWatchers;
    private Button btnTrackers;
    private Button btnMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createElements();
        createListeners();
    }

    private void createElements() {
        btnMaps = (Button) findViewById(R.id.btnMaps);
        btnWatchers = (Button) findViewById(R.id.btnWatchers);
        btnTrackers = (Button) findViewById(R.id.btnTrackers);
    }

    private void createListeners() {
        btnMaps.setOnClickListener((View v) -> openActivity(MapsActivity.class));
        btnTrackers.setOnClickListener((View v) -> openActivity(TrackingActivity.class));
        btnWatchers.setOnClickListener((View v) -> openActivity(WatchingActivity.class));
    }

    private void openActivity (Class clazz) {
        startActivity(new Intent(MainActivity.this, clazz));
    }
}
