//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.TextView;
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.MobileAds;
//
//public class MainActivityyy extends AppCompatActivity {
//
//    private AdView mAdView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_activity_main);
//
//        mAdView = findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);
//        MobileAds.initialize(this, getString(R.string.app_id));
//
//        TextView blog = findViewById(R.id.blogTitle);
//        // Set a click listener on that View
//        blog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent blogIntent = new Intent(MainActivityyy.this, BlogActivity.class);
//                // Start the new activity
//                startActivity(blogIntent);
//            }
//        });
//
//        TextView prayer = findViewById(R.id.prayer);
//        // Set a click listener on that View
//        prayer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent prayerIntent = new Intent(MainActivityyy.this, Prayer.class);
//                // Start the new activity
//                startActivity(prayerIntent);
//            }
//        });
//
//        TextView ten = findViewById(R.id.ten_commandments);
//        // Set a click listener on that View
//        ten.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent tenIntent = new Intent(MainActivityyy.this, TheTenCommandments.class);
//                // Start the new activity
//                startActivity(tenIntent);
//            }
//        });
//
//        TextView hope = findViewById(R.id.hope);
//        // Set a click listener on that View
//        hope.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent hopeIntent = new Intent(MainActivityyy.this, Hope.class);
//                // Start the new activity
//                startActivity(hopeIntent);
//            }
//        });
//
//        TextView love = findViewById(R.id.love);
//        // Set a click listener on that View
//        love.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent loveIntent = new Intent(MainActivityyy.this, Love.class);
//                // Start the new activity
//                startActivity(loveIntent);
//            }
//        });
//
//        TextView anti = findViewById(R.id.anti_christ);
//        // Set a click listener on that View
//        anti.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent antiIntent = new Intent(MainActivityyy.this, AntiChrist.class);
//                // Start the new activity
//                startActivity(antiIntent);
//            }
//        });
//
//        TextView anxiety = findViewById(R.id.anxiety);
//        // Set a click listener on that View
//        anxiety.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent anxietyIntent = new Intent(MainActivityyy.this, Anxiety.class);
//                // Start the new activity
//                startActivity(anxietyIntent);
//            }
//        });
//
//        TextView badlanguage = findViewById(R.id.bad_language);
//        // Set a click listener on that View
//        badlanguage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent badIntent = new Intent(MainActivityyy.this, BadLanguage.class);
//                // Start the new activity
//                startActivity(badIntent);
//            }
//        });
//
//        TextView employment = findViewById(R.id.employment);
//        // Set a click listener on that View
//        employment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent employmentIntent = new Intent(MainActivityyy.this, Employment.class);
//                // Start the new activity
//                startActivity(employmentIntent);
//            }
//        });
//
//        TextView dating = findViewById(R.id.dating);
//        // Set a click listener on that View
//        dating.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent datingIntent = new Intent(MainActivityyy.this, Dating.class);
//                // Start the new activity
//                startActivity(datingIntent);
//            }
//        });
//
//        TextView fear = findViewById(R.id.fear);
//        // Set a click listener on that View
//        fear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent fearIntent = new Intent(MainActivityyy.this, Fear.class);
//                // Start the new activity
//                startActivity(fearIntent);
//            }
//        });
//
//
//
//        TextView feelings = findViewById(R.id.feelings);
//        // Set a click listener on that View
//        feelings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent feelingsIntent = new Intent(MainActivityyy.this, Feelings.class);
//                // Start the new activity
//                startActivity(feelingsIntent);
//            }
//        });
//
//        TextView friendship = findViewById(R.id.friendship);
//        // Set a click listener on that View
//        friendship.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent friendshipIntent = new Intent(MainActivityyy.this, Friendship.class);
//                // Start the new activity
//                startActivity(friendshipIntent);
//            }
//        });
//
//        TextView reject = findViewById(R.id.reject);
//        // Set a click listener on that View
//        reject.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent rejectIntent = new Intent(MainActivityyy.this, Rejection.class);
//                // Start the new activity
//                startActivity(rejectIntent);
//            }
//        });
//
//
//        TextView diligence = findViewById(R.id.diligence);
//        // Set a click listener on that View
//        diligence.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent diligenceIntent = new Intent(MainActivityyy.this, Diligence.class);
//                // Start the new activity
//                startActivity(diligenceIntent);
//            }
//        });
//
//        TextView obedience = findViewById(R.id.obedience);
//        // Set a click listener on that View
//        obedience.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent obedienceIntent = new Intent(MainActivityyy.this, Obedience.class);
//                // Start the new activity
//                startActivity(obedienceIntent);
//            }
//        });
//
//    }
//
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_about, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        switch (id){
//            case R.id.item1:
//                Intent intent = new Intent(MainActivityyy.this, AboutAA.class);
//                startActivity(intent);
//                break;
//
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//        return true;
//    }
//
//
//}
