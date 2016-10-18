package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NoraEnPureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nora_en_pure);

        ImageView noraenpure = (ImageView) findViewById(R.id.back_arrow_noraenpure);
        noraenpure.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent backIntent = new Intent(NoraEnPureActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}
