package com.example.arsir.elementarycooking;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.arsir.elementarycooking.FragmentActivityOne.BlankFragment_Bakery;
import com.example.arsir.elementarycooking.FragmentActivityOne.BlankFragment_Jarque;
import com.example.arsir.elementarycooking.FragmentActivityOne.BlankFragment_Roasting;

import java.util.Optional;

public class OptionalActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optional);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));



    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0:
                    BlankFragment_Jarque bf1= new BlankFragment_Jarque();
                    return bf1;
                case 1:
                    BlankFragment_Roasting bf2= new BlankFragment_Roasting();
                    return bf2;
                case 2:
                    BlankFragment_Bakery bf3= new BlankFragment_Bakery();
                    return bf3;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }
}
