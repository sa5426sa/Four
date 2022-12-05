package com.example.four;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
    }

    public void clicked(View view) {
        counter++;
        if((counter%7==0)||(counter/10==7)||(counter%10==7)) btn.setText("BOOM!");
        else btn.setText("clicks: "+counter);
    }
}