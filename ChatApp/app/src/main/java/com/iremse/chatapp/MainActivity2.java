package com.iremse.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.iremse.chatapp.utils.FirebaseUtil;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(FirebaseUtil.isLoggedIn()) {
                    startActivity(new Intent(MainActivity2.this, MainActivity.class));
                }else{
                    startActivity(new Intent(MainActivity2.this, MainActivity3.class));
                }
                finish();
            }
        },1000);
    }
}