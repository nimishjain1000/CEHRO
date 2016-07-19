package com.example.arora.cehroindia;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GetInvolvedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);


        GetInvolvedAdapter adapter = new GetInvolvedAdapter(this,getSupportFragmentManager());


        viewPager.setAdapter(adapter);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);


        tabLayout.setupWithViewPager(viewPager);
    }
}
