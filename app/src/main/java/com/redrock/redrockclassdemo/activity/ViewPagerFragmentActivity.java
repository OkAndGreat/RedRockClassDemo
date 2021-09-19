package com.redrock.redrockclassdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.redrock.redrockclassdemo.R;
import com.redrock.redrockclassdemo.adapter.FragmentPagerAdapter;
import com.redrock.redrockclassdemo.fragment.Fragment1;
import com.redrock.redrockclassdemo.fragment.Fragment2;

import java.util.ArrayList;

public class ViewPagerFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_fragment);

        ViewPager2 viewPager2 = findViewById(R.id.view_pager_fragment);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        FragmentPagerAdapter adapter = new FragmentPagerAdapter(this,fragments);

        viewPager2.setAdapter(adapter);
    }
}