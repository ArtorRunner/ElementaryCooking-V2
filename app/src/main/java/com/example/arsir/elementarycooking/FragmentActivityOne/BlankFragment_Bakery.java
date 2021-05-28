package com.example.arsir.elementarycooking.FragmentActivityOne;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arsir.elementarycooking.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment_Bakery extends Fragment {

    public BlankFragment_Bakery() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment__bakery, container, false);
    }

}
