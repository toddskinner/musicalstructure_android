package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        LinearLayout noraenpure = (LinearLayout) findViewById(R.id.nora_en_pure);
        noraenpure.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent noraenpureIntent = new Intent(MainActivity.this, NoraEnPureActivity.class);
                startActivity(noraenpureIntent);
            }
        });

        LinearLayout rufusdusol = (LinearLayout) findViewById(R.id.rufus_du_sol);
        rufusdusol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent rufusdusolIntent = new Intent(MainActivity.this, RufusDuSolActivity.class);
                startActivity(rufusdusolIntent);
            }
        });

        LinearLayout satinjackets = (LinearLayout) findViewById(R.id.satin_jackets);
        satinjackets.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent satinjacketsIntent = new Intent(MainActivity.this, SatinJacketsActivity.class);
                startActivity(satinjacketsIntent);
            }
        });

        LinearLayout kygo = (LinearLayout) findViewById(R.id.kygo);
        kygo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent kygoIntent = new Intent(MainActivity.this, KygoActivity.class);
                startActivity(kygoIntent);
            }
        });

        LinearLayout odesza = (LinearLayout) findViewById(R.id.odesza);
        odesza.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent odeszaIntent = new Intent(MainActivity.this, OdeszaActivity.class);
                startActivity(odeszaIntent);
            }
        });

        LinearLayout tycho = (LinearLayout) findViewById(R.id.tycho);
        tycho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent tychoIntent = new Intent(MainActivity.this, TychoActivity.class);
                startActivity(tychoIntent);
            }
        });

        Button browse = (Button) findViewById(R.id.browse_button);
        browse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent browseIntent = new Intent(MainActivity.this, BrowseActivity.class);
                startActivity(browseIntent);
            }
        });
    }
}
