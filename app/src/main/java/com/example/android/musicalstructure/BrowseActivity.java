package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BrowseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        Button stations = (Button) findViewById(R.id.stations_button);
        stations.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent stationsIntent = new Intent(BrowseActivity.this, MainActivity.class);
                startActivity(stationsIntent);
            }
        });
    }
}
