package com.example.arsir.elementarycooking.FragmentActivityOne;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.arsir.elementarycooking.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment_Jarque extends Fragment {

    TextView textView_Degree, textView_time, textView_ter, textView_start;
    ImageView imageView;

    public BlankFragment_Jarque() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment__jarque, container, false);

        return view;
    }

}
