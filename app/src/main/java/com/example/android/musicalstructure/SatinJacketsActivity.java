package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SatinJacketsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satin_jackets);

        ImageView satinjackets = (ImageView) findViewById(R.id.back_arrow_satinjackets);
        satinjackets.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent backIntent = new Intent(SatinJacketsActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}
