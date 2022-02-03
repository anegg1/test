package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    TextView textView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView =  findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView);
        textView3 = findViewById(R.id.textView);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String age = intent.getStringExtra("age");
        textView.setText(name);
        textView2.setText(age);

        int i = Integer.parseInt (age);
        if (i > 17) {
            textView2.setText("вам => 18");
        }

    }
}