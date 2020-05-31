package com.manipuribible.kurosaki.manipuribibleverse.Mark;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.design.widget.TabLayout;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//import an.z.manipuribiblenewverse.Matthi.Mathhew_1;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_10;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_11;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_12;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_13;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_14;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_15;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_16;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_17;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_18;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_19;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_2;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_20;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_21;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_22;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_23;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_24;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_25;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_26;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_27;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_28;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_3;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_4;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_5;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_6;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_7;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_8;
//import an.z.manipuribiblenewverse.Matthi.Mathhew_9;
//import an.z.manipuribiblenewverse.Matthi.MatthiMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.R;

public class MarkMainActivity extends AppCompatActivity {

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
            "",
            "",
            "",
            ""
    };

    // The fragments that are used as the individual pages
    private final Fragment[] PAGES = new Fragment[] {
            new Mark_1(),
            new Mark_2(),
            new Mark_3(),
            new Mark_4(),
            new Mark_5(),
            new Mark_6(),
            new Mark_7(),
            new Mark_8(),
            new Mark_9(),
            new Mark_10(),
            new Mark_11(),
            new Mark_12(),
            new Mark_13(),
            new Mark_14(),
            new Mark_15(),
            new Mark_16()
    };

    // The ViewPager is responsible for sliding pages (fragments) in and out upon user input
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark_main);

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
