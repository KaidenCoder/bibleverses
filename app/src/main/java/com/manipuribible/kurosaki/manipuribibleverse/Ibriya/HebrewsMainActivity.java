package com.manipuribible.kurosaki.manipuribibleverse.Ibriya;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.design.widget.TabLayout;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.manipuribible.kurosaki.manipuribibleverse.MainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.R;
//import an.z.manipuribiblenewverse.john.JohnMainActivity;
//import an.z.manipuribiblenewverse.john.john1;
//import an.z.manipuribiblenewverse.john.john10;
//import an.z.manipuribiblenewverse.john.john11;
//import an.z.manipuribiblenewverse.john.john12;
//import an.z.manipuribiblenewverse.john.john13;
//import an.z.manipuribiblenewverse.john.john14;
//import an.z.manipuribiblenewverse.john.john15;
//import an.z.manipuribiblenewverse.john.john16;
//import an.z.manipuribiblenewverse.john.john17;
//import an.z.manipuribiblenewverse.john.john18;
//import an.z.manipuribiblenewverse.john.john19;
//import an.z.manipuribiblenewverse.john.john2;
//import an.z.manipuribiblenewverse.john.john20;
//import an.z.manipuribiblenewverse.john.john21;
//import an.z.manipuribiblenewverse.john.john3;
//import an.z.manipuribiblenewverse.john.john4;
//import an.z.manipuribiblenewverse.john.john5;
//import an.z.manipuribiblenewverse.john.john6;
//import an.z.manipuribiblenewverse.john.john7;
//import an.z.manipuribiblenewverse.john.john8;
//import an.z.manipuribiblenewverse.john.john9;

public class HebrewsMainActivity extends AppCompatActivity {

    //private final String LOG_TAG = MainActivity.class.getSimpleName();

    // Titles of the individual pages (displayed in tabs)
    private final String[] PAGE_TITLES = new String[] {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13"
    };

    // The fragments that are used as the individual pages
    private final Fragment[] PAGES = new Fragment[] {
            new Hebrews_1(),
            new Hebrews_2(),
            new Hebrews_3(),
            new Hebrews_4(),
            new Hebrews_5(),
            new Hebrews_6(),
            new Hebrews_7(),
            new Hebrews_8(),
            new Hebrews_9(),
            new Hebrews_10(),
            new Hebrews_11(),
            new Hebrews_12(),
            new Hebrews_13()
    };

    // The ViewPager is responsible for sliding pages (fragments) in and out upon user input
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hebrews_main);

        // Set the Toolbar as the activity's app bar (instead of the default ActionBar)
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // Connect the ViewPager to our custom PagerAdapter. The PagerAdapter supplies the pages
        // (fragments) to the ViewPager, which the ViewPager needs to display.
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(new MyPagerAdapter(getFragmentManager()));

        // Connect the tabs with the ViewPager (the setupWithViewPager method does this for us in
        // both directions, i.e. when a new tab is selected, the ViewPager switches to this page,
        // and when the ViewPager switches to a new page, the corresponding tab is selected)
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(mViewPager);
    }


    /* PagerAdapter for supplying the ViewPager with the pages (fragments) to display. */
    public class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            return PAGES[position];
        }

        @Override
        public int getCount() {
            return PAGES.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return PAGE_TITLES[position];
        }

    }
}
