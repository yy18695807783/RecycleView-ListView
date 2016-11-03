package me.yokeyword.sample.demo_flow.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.xutils.common.util.LogUtil;

import me.yokeyword.sample.demo_flow.ui.fragment.discover.NetAudioFragment;
import me.yokeyword.sample.demo_flow.ui.fragment.discover.PagerChildFragment;
import me.yokeyword.sample.demo_flow.ui.fragment.discover.RecyclerViewFragment;

/**
 * Created by YoKeyword on 16/2/5.
 */
public class DiscoverFragmentAdapter extends FragmentPagerAdapter {
    String[] mTitles = new String[]{"推荐", "ListView", "RecycleView"};

    public DiscoverFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        LogUtil.e("DiscoverFragmentAdapter-----------------");
        if (position == 0) {
            return PagerChildFragment.newInstance(0);
        } else if (position == 1) {
//            return PagerChildFragment.newInstance(1);
            return NetAudioFragment.newInstance(1);
        } else {
//            return PagerChildFragment.newInstance(2);
            LogUtil.e("DiscoverFragmentAdapter=================");
            return RecyclerViewFragment.newInstance(2);
        }
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
