package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GoldroomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goldroom);

        ImageView goldroom = (ImageView) findViewById(R.id.back_arrow_goldroom);
        goldroom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent backIntent = new Intent(GoldroomActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}
