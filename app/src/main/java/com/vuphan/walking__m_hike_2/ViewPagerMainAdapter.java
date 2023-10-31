package com.vuphan.walking__m_hike_2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.vuphan.walking__m_hike_2.bottomnav.CalenderFragment;
import com.vuphan.walking__m_hike_2.bottomnav.CompassFragment;
import com.vuphan.walking__m_hike_2.bottomnav.FindFragment;
import com.vuphan.walking__m_hike_2.bottomnav.HomeFragment;
import com.vuphan.walking__m_hike_2.bottomnav.PersonFragment;

public class ViewPagerMainAdapter extends FragmentStateAdapter {
    private static final int NUM_PAGES = 5;

    public ViewPagerMainAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new FindFragment();
            case 2:
                return new CompassFragment();
            case 3:
                return new CalenderFragment();
            case 4:
                return new PersonFragment();
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return NUM_PAGES;
    }
}
