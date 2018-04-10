package com.example.dwistari.anew;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager aViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aViewPager = (ViewPager) findViewById(R.id.viewPager);
        aViewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager()));
    }
}
