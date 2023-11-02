package com.vuphan.walking__m_hike_2.bottomnav;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;


import com.vuphan.walking__m_hike_2.R;


public class TrackingFragment extends Fragment {
    ImageView btn_back;
    FrameLayout btn_map;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tracking, container, false);
        btn_back = view.findViewById(R.id.btn_back);
        btn_map = view.findViewById(R.id.btn_map);
        btn_map.setOnClickListener(view12 -> {
        });
        btn_back.setOnClickListener(view1 -> {
            requireActivity().onBackPressed();
        });
        return view;
    }

}