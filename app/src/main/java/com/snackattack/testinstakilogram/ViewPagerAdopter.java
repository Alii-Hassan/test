package com.snackattack.testinstakilogram;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdopter extends FragmentPagerAdapter {

    private final List<Fragment>mListFragment = new ArrayList<>();
    private final List<String> fragmentListTitle = new ArrayList<>();



    public ViewPagerAdopter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mListFragment.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentListTitle.get(position);
    }
    public void AddFragment (Fragment fragment ,  String title){
        mListFragment.add(fragment);
        fragmentListTitle.add(title);

    }
}
