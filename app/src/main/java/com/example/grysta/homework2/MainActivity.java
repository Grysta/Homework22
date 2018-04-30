package com.example.grysta.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnUC1;
    Button btnUC2;
    Button btnUC3;
    Button btnUC4;
    Button btnUC5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findview();
        setListener();
    }

    private void findview(){
        btnUC1=findViewById(R.id.btnUC1);
        btnUC2=findViewById(R.id.btnUC2);
        btnUC3=findViewById(R.id.btnUC3);
        btnUC4=findViewById(R.id.btnUC4);
        btnUC5=findViewById(R.id.btnUC5);
    }

    private void setListener(){
        btnUC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,UC1.class);
                startActivity(i);
            }
        });btnUC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,UC2.class);
                startActivity(i);
            }
        });
        btnUC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,UC3.class);
                startActivity(i);
            }
        });
        btnUC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,UC4.class);
                startActivity(i);
            }
        });
        btnUC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,UC5.class);
                startActivity(i);
            }
        });
    }
}
