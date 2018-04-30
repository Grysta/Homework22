package com.example.grysta.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UC1 extends AppCompatActivity {

    Button btnH;
    Button btnL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc1);
        findView();
        setListener();
    }

    private void findView(){
        btnH=findViewById(R.id.btnH);
        btnL=findViewById(R.id.btnL);
    }

    private void setListener(){
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(UC1.this,UC1Horizon.class);
                startActivity(i);
            }
        });
        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(UC1.this,UC1Left.class);
                startActivity(i);
            }
        });
    }
}
