package com.example.intentdemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    private int choice = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView supermoon = findViewById(R.id.supermoon);
        ImageView waterfall = findViewById(R.id.waterfall);


        supermoon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               choice = 1;
               sendChoice(choice);
            }
        });

        waterfall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                choice = 0;
                sendChoice(choice);
            }
        });


    }

    public void sendChoice(int choice){
        Intent resultIntent = new Intent();

        resultIntent.putExtra("choice", choice);
        setResult(Main2Activity.RESULT_OK, resultIntent);
        finish();
    }

}
