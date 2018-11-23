package vn.quanlyvatnuoi.activity;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class pageAdptermenuqlvt extends FragmentStatePagerAdapter {

    public pageAdptermenuqlvt(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new FragmenQLVTActivity();
                break;
            case 1:
                fragment=new FragmentVNctivity();

                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "QUẢN LÝ VẬT NUÔI";
                break;
            case 1:
                title = "VẬT NUÔI";
                break;
        }
        return title;
    }

}
