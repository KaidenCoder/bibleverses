package com.manipuribible.kurosaki.manipuribibleverse.Theslon_Two;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.design.widget.TabLayout;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.manipuribible.kurosaki.manipuribibleverse.R;
//import an.z.manipuribiblenewverse.Timothy_One.Timothy1MainActivity;
//import an.z.manipuribiblenewverse.Timothy_One.Timothy_one_1;
//import an.z.manipuribiblenewverse.Timothy_One.Timothy_one_2;
//import an.z.manipuribiblenewverse.Timothy_One.Timothy_one_3;
//import an.z.manipuribiblenewverse.Timothy_One.Timothy_one_4;
//import an.z.manipuribiblenewverse.Timothy_One.Timothy_one_5;
//import an.z.manipuribiblenewverse.Timothy_One.Timothy_one_6;

public class Theslok2MainActivity extends AppCompatActivity {

    //private final String LOG_TAG = MainActivity.class.getSimpleName();

    // Titles of the individual pages (displayed in tabs)
    private final String[] PAGE_TITLES = new String[] {
            "1",
            "2",
            "3"
    };

    // The fragments that are used as the individual pages
    private final Fragment[] PAGES = new Fragment[] {
            new Theslo_two_1(),
            new Theslo_two_2(),
            new Theslo_two_3()
    };

    // The ViewPager is responsible for sliding pages (fragments) in and out upon user input
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theslok2_main);

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
