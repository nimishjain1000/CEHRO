package com.example.arora.cehroindia;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by arora on 19/7/16.
 */

public class GetInvolvedAdapter extends FragmentPagerAdapter {


    private Context mContext;


    public GetInvolvedAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new VolunteerFragment();
        } else if (position == 1){
            return new DonateFragment();
        }
        else if (position == 2){
            return new RespFragment();
        } else {
            return new CsrFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Vol);
        } else if (position == 1) {
            return mContext.getString(R.string.Donate);
        }
        else if (position == 2) {
            return mContext.getString(R.string.Resp);
        } else {
            return mContext.getString(R.string.Csr);
        }
    }
}
