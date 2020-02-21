package com.moskaoud.tourguideappksa;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFPAdapter extends FragmentPagerAdapter {
    Context context;

    public MyFPAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) return new AlmasjidAlharamFragment();
        else if (position == 1) return new AlmasjidAlnabawiFragment();
        else if (position == 2) return new MountArafatFragment();
        else
            return new OthersFragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return context.getResources().getString(R.string.almasjid_alharam);
        else if (position == 1)
            return context.getResources().getString(R.string.almasjid_alnabawi);
        else if (position == 2)
            return context.getResources().getString(R.string.mount_arafat);
        else
            return context.getResources().getString(R.string.others);
    }

    @Override
    public int getCount() {
        return 4;
    }
}
