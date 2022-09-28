package com.example.trafficlights;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button click;
    TextView light;
    int color = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = (Button) findViewById(R.id.button);
        light = (TextView) findViewById(R.id.light);

        click.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color++;
                if(color == 1){
                    light.setBackgroundColor(getResources().getColor(R.color.yellow));
                }else if(color == 2){
                    light.setBackgroundColor(getResources().getColor(R.color.green));
                }else{
                    color = 0;
                    light.setBackgroundColor(getResources().getColor(R.color.red));
                }


            }
        });
    }
}