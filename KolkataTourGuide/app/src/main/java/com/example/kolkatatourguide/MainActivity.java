package com.example.kolkatatourguide;

import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        TabLayout tabs = findViewById(R.id.tabs);
        viewPager.setAdapter(new MyPageAdapter(getSupportFragmentManager()));
        tabs.setupWithViewPager(viewPager);


    }

    class MyPageAdapter extends FragmentPagerAdapter {

//        String [] text = {"Places","Hotels","Shoping","Hospital"};
        String[] text = getResources().getStringArray(R.array.fragment_heading);

        public MyPageAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            if (position==0)
                return new Places();
            if (position==1)
                return new Hotels();
            if (position==2)
                return new Shoping();
            if (position==3)
                return new Hospital();
            else
                return null;

        }

        @Override
        public int getCount() {
            return text.length;
        }


        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return text[position];
        }
    }

}