package com.gui.abc.inflater;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnInflate1;
    private Button btnInflate2;
    private Button btnInflate3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();


    }

    private void initView() {
        btnInflate1 = (Button) findViewById(R.id.btn_inflate1);
        btnInflate2 = (Button) findViewById(R.id.btn_inflate2);
        btnInflate3 = (Button) findViewById(R.id.btn_inflate3);

        btnInflate1.setOnClickListener(this);
        btnInflate2.setOnClickListener(this);
        btnInflate3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_inflate1:
                inflate1();
                break;
            case R.id.btn_inflate2:
                inflate2();
                break;
            case R.id.btn_inflate3:
                inflate3();
                break;
        }
    }

    private void inflate3() {
        LinearLayout sub = (LinearLayout) View.inflate(this, R.layout.my_layout, null);
        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_main);
        layout.addView(sub);
    }

    private void inflate2() {
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout sub = (LinearLayout) inflater.inflate(R.layout.my_layout, null);
        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_main);
        layout.addView(sub);
    }

    private void inflate1() {
        LayoutInflater inflater = LayoutInflater.from(this);
        LinearLayout sub = (LinearLayout) inflater.inflate(R.layout.my_layout, null);
        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_main);
        layout.addView(sub);
    }
}
