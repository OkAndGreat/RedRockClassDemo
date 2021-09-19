package com.redrock.redrockclassdemo.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.redrock.redrockclassdemo.R;
import com.redrock.redrockclassdemo.adapter.PagerAdapter;

import java.util.ArrayList;

public class TabLayoutActivity extends AppCompatActivity {
    private ArrayList<Character> data = new ArrayList<>();
    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tab_layout);
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
        tabLayout = findViewById(R.id.tabLayout);

        viewPager.setAdapter(new PagerAdapter(data));

        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                //在这里给Tab设置Text
                tab.setText(data.get(position).toString());
            }
        }).attach();
    }
}