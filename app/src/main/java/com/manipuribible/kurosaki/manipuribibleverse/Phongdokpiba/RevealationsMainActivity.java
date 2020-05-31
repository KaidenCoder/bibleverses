package com.manipuribible.kurosaki.manipuribibleverse.Phongdokpiba;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.design.widget.TabLayout;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//import an.z.manipuribiblenewverse.Pitar_One.Peter1MainActivity;
//import an.z.manipuribiblenewverse.Pitar_One.Peter_one_1;
//import an.z.manipuribiblenewverse.Pitar_One.Peter_one_2;
//import an.z.manipuribiblenewverse.Pitar_One.Peter_one_3;
//import an.z.manipuribiblenewverse.Pitar_One.Peter_one_4;
//import an.z.manipuribiblenewverse.Pitar_One.Peter_one_5;
import com.manipuribible.kurosaki.manipuribibleverse.R;

public class RevealationsMainActivity extends AppCompatActivity {

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
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22"
    };

    // The fragments that are used as the individual pages
    private final Fragment[] PAGES = new Fragment[] {
            new Reveal_1(),
            new Reveal_2(),
            new Reveal_3(),
            new Reveal_4(),
            new Reveal_5(),
            new Reveal_6(),
            new Reveal_7(),
            new Reveal_8(),
            new Reveal_9(),
            new Reveal_10(),
            new Reveal_11(),
            new Reveal_12(),
            new Reveal_13(),
            new Reveal_14(),
            new Reveal_15(),
            new Reveal_16(),
            new Reveal_17(),
            new Reveal_18(),
            new Reveal_19(),
            new Reveal_20(),
            new Reveal_21(),
            new Reveal_22()
    };

    // The ViewPager is responsible for sliding pages (fragments) in and out upon user input
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revealations_main);

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
