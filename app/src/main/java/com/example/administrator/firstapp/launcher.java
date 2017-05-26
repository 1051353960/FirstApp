package com.example.administrator.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



public class launcher extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity();

            }
        },2000);
    }
    private void startActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();


    }

}


