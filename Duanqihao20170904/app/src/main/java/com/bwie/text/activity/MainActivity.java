package com.bwie.text.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.bwie.text.R;
import com.bwie.text.view.CustomViews;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CustomViews customViews;
    private Button bianse;
    private Button jia;
    private Button jian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customViews = (CustomViews) findViewById(R.id.customView);
        bianse = (Button) findViewById(R.id.biabse);
        jia = (Button) findViewById(R.id.jia);
        jian = (Button) findViewById(R.id.jian);
        bianse.setOnClickListener(this);
        jia.setOnClickListener(this);
        jian.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.biabse:
                customViews.setBackgroundColor(Color.BLUE);
                break;
            case R.id.jia:
                break;
            case R.id.jian:
                break;
        }
    }
}
