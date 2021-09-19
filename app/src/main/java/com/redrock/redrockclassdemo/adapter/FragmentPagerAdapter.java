package com.redrock.redrockclassdemo.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

/**
 * Author by OkAndGreat，Date on 2021/9/19.
 */
public class FragmentPagerAdapter extends FragmentStateAdapter {
    private final ArrayList<Fragment> fragments;

    public FragmentPagerAdapter(@NonNull FragmentActivity fragmentActivity, ArrayList<Fragment> fragments) {
        super(fragmentActivity);
        this.fragments = fragments;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
