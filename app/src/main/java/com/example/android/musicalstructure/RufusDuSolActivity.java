package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RufusDuSolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rufus_du_sol);

        ImageView rufusdusol = (ImageView) findViewById(R.id.back_arrow_rufusdusol);
        rufusdusol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent backIntent = new Intent(RufusDuSolActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}
