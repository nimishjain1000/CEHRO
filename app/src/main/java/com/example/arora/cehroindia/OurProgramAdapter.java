package com.example.arora.cehroindia;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by arora on 19/7/16.
 */

public class OurProgramAdapter extends FragmentPagerAdapter {

       private Context mContext;
       public OurProgramAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Prog1();
        } else if (position == 1){
            return new Prog2();
        } else if (position ==2){
            return new Prog3();
        } else if (position == 3){
            return new Prog4();
        }else if (position == 4){
            return new Prog5();
        }else {
            return new Prog6();
        }
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Prog1);
        } else if (position == 1) {
            return mContext.getString(R.string.Prog2);
        }
        else if (position == 2) {
            return mContext.getString(R.string.Prog3);
        }
        else if (position == 3) {
            return mContext.getString(R.string.Prog4);
        }
        else if (position == 4) {
            return mContext.getString(R.string.Prog5);
        }else {
            return mContext.getString(R.string.Prog6);
        }
    }
}
