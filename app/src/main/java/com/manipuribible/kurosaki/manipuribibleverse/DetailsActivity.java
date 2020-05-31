//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class DetailsActivity extends AppCompatActivity {
//
//    private static final String LOG_TAG = DetailsActivity.class.getSimpleName();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_activity_details);
//        if (savedInstanceState == null) {
//            Intent intent = getIntent();
//            if (intent != null && intent.hasExtra(Constants.EXTRA_BLOG)) {
//                DetailsFragment detailsFragment = DetailsFragment.newInstance((Blog) intent
//                        .getParcelableExtra(Constants.EXTRA_BLOG));
//                getSupportFragmentManager().beginTransaction()
//                        .add(R.id.details_fragment_container, detailsFragment)
//                        .commit();
//            }
//        }
//    }
//}
