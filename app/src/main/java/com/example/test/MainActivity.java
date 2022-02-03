package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button button1;
    EditText editText_name;
    EditText editText_age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.button1);
        editText_name = findViewById(R.id.editText_Name);
        editText_age = findViewById(R.id.editText_age);

        button1.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("name", editText_name.getText().toString());
        intent.putExtra("name", editText_age.getText().toString());
        startActivity(intent);
    }
}