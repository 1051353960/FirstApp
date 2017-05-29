package com.example.administrator.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.renderscript.Element;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
private RadioGroup mRg_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRg_main =(RadioGroup) findViewById(R.id.rg_bottom_tag);
        mRg_main.check(R.id.rb_common_frame);

    }
    }
