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
public class BlankFragment_Roasting extends Fragment implements SeekBar.OnSeekBarChangeListener {

    TextView textView_Degree, textView_time, textView_ter, textView_start;
    ImageView imageView;

    public BlankFragment_Roasting() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment__roasting, container, false);

        final SeekBar seekBar;
        seekBar = (SeekBar) view.findViewById(R.id.seekBar);
        textView_Degree = (TextView) view.findViewById(R.id.textView_Degree);
        textView_Degree.setText("Raw");

        textView_time = (TextView) view.findViewById(R.id.textView_Time);
        textView_time.setText("0м");

        textView_ter = (TextView) view.findViewById(R.id.textView_Ter);
        textView_ter.setText("0C");

        seekBar.setMax(4);
        seekBar.setOnSeekBarChangeListener(this);

        imageView = (ImageView) view.findViewById(R.id.imageView6);
        imageView.setImageResource(R.drawable.meat_1);

        return view;

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        textView_Degree.setText(String.valueOf(seekBar.getProgress()));

        switch (progress){
            case 0:
                imageView.setImageResource(R.drawable.meat_1);
                textView_Degree.setText("Raw");
                textView_time.setText("0м");
                textView_ter.setText("0°C");
                break;
            case 1:
                imageView.setImageResource(R.drawable.meat_2);
                textView_Degree.setText("Rare");
                textView_time.setText("1-2м");
                textView_ter.setText("52°C");
                break;
            case 2:
                imageView.setImageResource(R.drawable.meat_3);
                textView_Degree.setText("Medium Rare");
                textView_time.setText("1-3м");
                textView_ter.setText("57°C");
                break;
            case 3:
                imageView.setImageResource(R.drawable.meat_4);
                textView_Degree.setText("Medium");
                textView_time.setText("3-4м");
                textView_ter.setText("63°C");
                break;
            case 4:
                imageView.setImageResource(R.drawable.meat_5);
                textView_Degree.setText("Well Done");
                textView_time.setText("6-7м");
                textView_ter.setText("71°C");
                break;
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
