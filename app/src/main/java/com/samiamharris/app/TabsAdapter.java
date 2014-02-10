package com.samiamharris.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by samharris on 2/9/14.
 */


public class TabsAdapter extends FragmentPagerAdapter {

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch(i) {
            case 0:
                //Companies fragment activity
                return new CompaniesFragment();
            case 1:
                //Locations fragment activity
                return new LocationsFragment();
            case 2:
                //Map fragment activity
                return new MapFragment();
            case 3:
                //Info fragment activity
                return new InfoFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count # of tabs
        return 4;
    }
}

