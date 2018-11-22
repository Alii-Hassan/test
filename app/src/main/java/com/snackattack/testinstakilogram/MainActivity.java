package com.snackattack.testinstakilogram;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.view_pager);
        ViewPagerAdopter viewPagerAdopter = new ViewPagerAdopter(getSupportFragmentManager());
        viewPagerAdopter.AddFragment(new WelcomeFragment(),"welcome");
        viewPagerAdopter.AddFragment(new TheNextFragment(),"next");
        viewPagerAdopter.AddFragment(new SignUpFragment(),"Sign Up");

        mViewPager.setAdapter(viewPagerAdopter);
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
