package com.example.dwistari.anew;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyViewPagerAdapter extends FragmentStatePagerAdapter {
    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new MyPagerFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
