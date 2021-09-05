package com.redrock.redrockclassdemo;

import static androidx.viewpager2.widget.ViewPager2.OFFSCREEN_PAGE_LIMIT_DEFAULT;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.redrock.redrockclassdemo.adapter.PagerAdapter;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {
    private ArrayList<Character> data = new ArrayList<>();
    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        //初始化假数据
        data.add('红');
        data.add('岩');
        data.add('网');
        data.add('校');
        data.add('移');
        data.add('动');
        data.add('开');
        data.add('发');
        data.add('部');

        viewPager = findViewById(R.id.view_pager);

        viewPager.setAdapter(new PagerAdapter(data));


    }
}