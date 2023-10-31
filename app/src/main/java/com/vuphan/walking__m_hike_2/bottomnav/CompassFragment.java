package com.vuphan.walking__m_hike_2.bottomnav;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.vuphan.walking__m_hike_2.R;


public class CompassFragment extends Fragment  {

    TextView btn_view_1, btn_view_2, btn_view_3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_compass, container, false);
//        btn_view_1 = view.findViewById(R.id.btn_view_1);
//        btn_view_2 = view.findViewById(R.id.btn_view_2);
//        btn_view_3 = view.findViewById(R.id.btn_view_3);
//        btn_view_1.setOnClickListener(view1 -> {
//           createFragmentDetail();
//        });
//        btn_view_2.setOnClickListener(view1 -> {
//            createFragmentDetail();
//        });
//        btn_view_3.setOnClickListener(view1 -> {
//            createFragmentDetail();
//        });
        return view;
    }


}