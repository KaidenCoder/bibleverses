package com.manipuribible.kurosaki.manipuribibleverse.Matthi;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.design.widget.TabLayout;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.ActsMainActivity;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_1;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_10;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_11;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_12;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_13;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_14;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_15;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_16;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_17;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_18;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_19;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_2;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_20;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_21;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_22;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_23;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_24;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_25;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_26;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_27;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_28;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_3;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_4;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_5;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_6;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_7;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_8;
//import an.z.manipuribiblenewverse.Pakhonchatpasinggi.Acts_9;
import com.manipuribible.kurosaki.manipuribibleverse.R;

public class MatthiMainActivity extends AppCompatActivity {

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
            new Mathhew_1(),
            new Mathhew_2(),
            new Mathhew_3(),
            new Mathhew_4(),
            new Mathhew_5(),
            new Mathhew_6(),
            new Mathhew_7(),
            new Mathhew_8(),
            new Mathhew_9(),
            new Mathhew_10(),
            new Mathhew_11(),
            new Mathhew_12(),
            new Mathhew_13(),
            new Mathhew_14(),
            new Mathhew_15(),
            new Mathhew_16(),
            new Mathhew_17(),
            new Mathhew_18(),
            new Mathhew_19(),
            new Mathhew_20(),
            new Mathhew_21(),
            new Mathhew_22(),
            new Mathhew_23(),
            new Mathhew_24(),
            new Mathhew_25(),
            new Mathhew_26(),
            new Mathhew_27(),
            new Mathhew_28()
    };

    // The ViewPager is responsible for sliding pages (fragments) in and out upon user input
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matthi_main);

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
