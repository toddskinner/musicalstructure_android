package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class TychoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tycho);

        ImageView goldroom = (ImageView) findViewById(R.id.back_arrow_tycho);
        goldroom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent backIntent = new Intent(TychoActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}
