package com.example.grysta.homework2;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;

public class UC3 extends AppCompatActivity {

    ImageView ivNormal;
    ImageView ivAlter;
    ImageView ivLily;
    ImageView ivRed;
    ImageView ivWhite;
    int sign;

    Handler mHandler=new Handler();
    Runnable r=new Runnable() {
        @Override
        public void run() {
            if (sign==0){
                ivNormal.setVisibility(View.VISIBLE);
                ivWhite.setVisibility(View.INVISIBLE);
            }else if (sign==1){
                ivAlter.setVisibility(View.VISIBLE);
                ivNormal.setVisibility(View.INVISIBLE);
            }else if (sign==2){
                ivLily.setVisibility(View.VISIBLE);
                ivAlter.setVisibility(View.INVISIBLE);
            } else if (sign==3){
                ivRed.setVisibility(View.VISIBLE);
                ivLily.setVisibility(View.INVISIBLE);
            } else if (sign==4){
                ivWhite.setVisibility(View.VISIBLE);
                ivRed.setVisibility(View.INVISIBLE);
            }
            sign=(sign+1)%5;
            mHandler.postDelayed(this, 1000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc3);
        findView();
        sign=0;
        mHandler.postDelayed(r, 100);
    }

    private void findView(){
        ivNormal=findViewById(R.id.ivNormal);ivNormal.setVisibility(View.INVISIBLE);
        ivAlter=findViewById(R.id.ivAlter);ivAlter.setVisibility(View.INVISIBLE);
        ivLily=findViewById(R.id.ivLily);ivLily.setVisibility(View.INVISIBLE);
        ivRed=findViewById(R.id.ivRed);ivRed.setVisibility(View.INVISIBLE);
        ivWhite=findViewById(R.id.ivWhite);ivWhite.setVisibility(View.INVISIBLE);
    }

}
