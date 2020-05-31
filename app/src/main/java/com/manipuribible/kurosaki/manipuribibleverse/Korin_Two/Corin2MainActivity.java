package com.manipuribible.kurosaki.manipuribibleverse.Korin_Two;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.design.widget.TabLayout;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//import an.z.manipuribiblenewverse.Mark.MarkMainActivity;
//import an.z.manipuribiblenewverse.Mark.Mark_1;
//import an.z.manipuribiblenewverse.Mark.Mark_10;
//import an.z.manipuribiblenewverse.Mark.Mark_11;
//import an.z.manipuribiblenewverse.Mark.Mark_12;
//import an.z.manipuribiblenewverse.Mark.Mark_13;
//import an.z.manipuribiblenewverse.Mark.Mark_14;
//import an.z.manipuribiblenewverse.Mark.Mark_15;
//import an.z.manipuribiblenewverse.Mark.Mark_16;
//import an.z.manipuribiblenewverse.Mark.Mark_2;
//import an.z.manipuribiblenewverse.Mark.Mark_3;
//import an.z.manipuribiblenewverse.Mark.Mark_4;
//import an.z.manipuribiblenewverse.Mark.Mark_5;
//import an.z.manipuribiblenewverse.Mark.Mark_6;
//import an.z.manipuribiblenewverse.Mark.Mark_7;
//import an.z.manipuribiblenewverse.Mark.Mark_8;
//import an.z.manipuribiblenewverse.Mark.Mark_9;
import com.manipuribible.kurosaki.manipuribibleverse.R;

public class Corin2MainActivity extends AppCompatActivity {

    //private final String LOG_TAG = MainActivity.class.getSimpleName();

    // Titles of the individual pages (displayed in tabs)
    private final String[] PAGE_TITLES = new String[] {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    // The fragments that are used as the individual pages
    private final Fragment[] PAGES = new Fragment[] {
            new Corin_two_1(),
            new Corin_two_2(),
            new Corin_two_3(),
            new Corin_two_4(),
            new Corin_two_5(),
            new Corin_two_6(),
            new Corin_two_7(),
            new Corin_two_8(),
            new Corin_two_9(),
            new Corin_two_10(),
            new Corin_two_11(),
            new Corin_two_12(),
            new Corin_two_13()
    };

    // The ViewPager is responsible for sliding pages (fragments) in and out upon user input
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corin2_main);

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
