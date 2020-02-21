package com.moskaoud.tourguideappksa;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tablayout);
        ViewPager myViewPager = findViewById(R.id.viewpager);
        MyFPAdapter myFPAdapter = new MyFPAdapter(getSupportFragmentManager(), this);
        myViewPager.setAdapter(myFPAdapter);
        tabLayout.setupWithViewPager(myViewPager);


    }
}
