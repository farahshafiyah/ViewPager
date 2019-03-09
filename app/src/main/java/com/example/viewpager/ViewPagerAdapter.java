package com.example.viewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FragmentSt();
        }
        else if (position == 1) {
            return new FragmentNd();
        }
        else if (position == 2) {
            return new FragmentRd();
        }

        throw new IllegalStateException("Position Not Valid");
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0 || position % 3 == 0) {
            return "First";
        }
        else if (position % 2 == 1) {
            return "Second";
        }
        else if (position % 3 == 2) {
            return "Third";
        }

        throw new IllegalStateException("Position Not Valid");
    }
}
