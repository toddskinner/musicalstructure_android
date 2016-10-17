package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.R.attr.layout_height;
import static android.R.attr.layout_width;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout goldroom = (LinearLayout) findViewById(R.id.goldroom);
        goldroom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent goldroomIntent = new Intent(MainActivity.this, GoldroomActivity.class);
                startActivity(goldroomIntent);
            }
        });


    }
}
