package com.redrock.redrockclassdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnRes;
    private Button btnNightAdapt;
    private Button btnMd;
    private Button btnVp;
    private Button btnTy;
    private Button btnRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initListener() {
        btnMd.setOnClickListener(this);
        btnNightAdapt.setOnClickListener(this);
        btnRv.setOnClickListener(this);
        btnTy.setOnClickListener(this);
        btnVp.setOnClickListener(this);
        btnRes.setOnClickListener(this);
    }

    private void initView() {
        btnRes = findViewById(R.id.btn_res);
        btnNightAdapt = findViewById(R.id.btn_night_adapt);
        btnMd = findViewById(R.id.btn_md);
        btnVp = findViewById(R.id.btn_vp);
        btnTy = findViewById(R.id.btn_ty);
        btnRv = findViewById(R.id.btn_rv);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = null;
        if (id == R.id.btn_md) {
            intent = new Intent(this, MaterialDesignActivity.class);
        } else if (id == R.id.btn_night_adapt) {
            intent = new Intent(this,NightAdaptActivity.class);
        } else if (id == R.id.btn_rv) {
            intent = new Intent(this,RecyclerViewActivity.class);
        } else if (id == R.id.btn_ty) {
            intent = new Intent(this,TabLayoutActivity.class);
        } else if (id == R.id.btn_vp) {
            intent = new Intent(this,ViewPagerActivity.class);
        } else if (id == R.id.btn_res) {
            intent = new Intent(this,ResActivity.class);
        }
        startActivity(intent);
    }
}