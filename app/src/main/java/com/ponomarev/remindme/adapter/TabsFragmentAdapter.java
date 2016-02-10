package com.ponomarev.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ponomarev.remindme.R;
import com.ponomarev.remindme.fragment.AbstractTabFragment;
import com.ponomarev.remindme.fragment.BirthdayFragment;
import com.ponomarev.remindme.fragment.HistoryFragment;
import com.ponomarev.remindme.fragment.IdeasFragment;
import com.ponomarev.remindme.fragment.TodoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ponomarev on 08.02.2016.
 */
public class TabsFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer,AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabMaps(context);
    }



    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabMaps(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdayFragment.getInstance(context));
    }
}
