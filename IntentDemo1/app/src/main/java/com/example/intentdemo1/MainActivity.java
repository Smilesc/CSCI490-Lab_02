package com.example.intentdemo1;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final int requestCode = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button setBackground = this.findViewById(R.id.setBackground);

        setBackground.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(i, requestCode);
            }
        });
    }




    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == requestCode) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                ConstraintLayout layout = findViewById(R.id.activity1);
                int result = data.getExtras().getInt("choice");

                if(result == 0) {

                    layout.setBackground(getDrawable(R.drawable.waterfall));
                }
                else if(result == 1){
                    layout.setBackground(getDrawable(R.drawable.supermoon));
                }
            }
        }
    }

}

