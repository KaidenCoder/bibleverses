package com.manipuribible.kurosaki.manipuribibleverse;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.manipuribible.kurosaki.manipuribibleverse.Ephisa.EphisaMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Galatiya.GalatiyaMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Ibriya.HebrewsMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Jakob.JakobMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Jihuda.JudeMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Johan_One.Johan1MainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Johan_Three.Johan3MainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Johan_Two.Johan2MainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Kolosiya.CollosiansMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Korin_One.Corin1MainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Korin_Two.Corin2MainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Luk.LukMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Mark.MarkMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Matthi.MatthiMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Pakhonchatpasinggi.ActsMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Philimon.Philimon;
import com.manipuribible.kurosaki.manipuribibleverse.Philimon.PhilimonMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Philippiya.PhillipiyaMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Phongdokpiba.RevealationsMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Pitar_One.Peter1MainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Pitar_Two.Peter2MainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Romiya.RomansMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Theslon_One.Theslok1MainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Theslon_Two.Theslok2MainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Timothy_One.Timothy1MainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Timothy_Two.Timothy2MainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.Tita.TitusMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.john.JohnMainActivity;
import com.manipuribible.kurosaki.manipuribibleverse.verses.AntiChrist;
import com.manipuribible.kurosaki.manipuribibleverse.verses.Asha;
import com.manipuribible.kurosaki.manipuribibleverse.verses.BadLanguage;
import com.manipuribible.kurosaki.manipuribibleverse.verses.Diligence;
import com.manipuribible.kurosaki.manipuribibleverse.verses.Fear;
import com.manipuribible.kurosaki.manipuribibleverse.verses.Friendship;
import com.manipuribible.kurosaki.manipuribibleverse.verses.Love;
import com.manipuribible.kurosaki.manipuribibleverse.verses.Obedience;
import com.manipuribible.kurosaki.manipuribibleverse.verses.PukningWaba;
import com.manipuribible.kurosaki.manipuribibleverse.verses.Reject;
import com.manipuribible.kurosaki.manipuribibleverse.verses.TenCommandments;
import com.manipuribible.kurosaki.manipuribibleverse.verses.Unabagi;
import com.manipuribible.kurosaki.manipuribibleverse.verses.Wakhal;
import com.manipuribible.kurosaki.manipuribibleverse.verses.Work;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, getString(R.string.app_id));

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "THANK YOU FOR USING THIS APP   --- From Kurosakicoder", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

//        TextView hope = findViewById(R.id.hope);
//        // Set a click listener on that View
//        hope.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent blogIntent = new Intent(MainActivity.this, Asha.class);
//                // Start the new activity
//                startActivity(blogIntent);
//            }
//        });
        TextView matthi = findViewById(R.id.nav_matthi);
        // Set a click listener on that View
        matthi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, MatthiMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView mark = findViewById(R.id.nav_mark);
        // Set a click listener on that View
        mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, MarkMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });


        TextView luk = findViewById(R.id.nav_luk);
        // Set a click listener on that View
        luk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, LukMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });


        TextView john = findViewById(R.id.nav_john);
        // Set a click listener on that View
        john.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, JohnMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView acts = findViewById(R.id.nav_pakhon);
        // Set a click listener on that View
        acts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, ActsMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView romans = findViewById(R.id.nav_romiya);
        // Set a click listener on that View
        romans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, RomansMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView corinOne = findViewById(R.id.nav_korin_one);
        // Set a click listener on that View
        corinOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, Corin1MainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView corinTwo = findViewById(R.id.nav_korin_two);
        // Set a click listener on that View
        corinTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, Corin2MainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView gal = findViewById(R.id.nav_galatiya);
        // Set a click listener on that View
        gal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, GalatiyaMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView ephisa = findViewById(R.id.nav_ephisa);
        // Set a click listener on that View
        ephisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, EphisaMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView philip = findViewById(R.id.nav_philip);
        // Set a click listener on that View
        philip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, PhillipiyaMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView kol = findViewById(R.id.nav_kolosiya);
        // Set a click listener on that View
        kol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, CollosiansMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView thesOne = findViewById(R.id.nav_theslon_one);
        // Set a click listener on that View
        thesOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, Theslok1MainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView thesTwo = findViewById(R.id.nav_theslon_two);
        // Set a click listener on that View
        thesTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, Theslok2MainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });
        TextView timOne = findViewById(R.id.nav_timothy_one);
        // Set a click listener on that View
        timOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, Timothy1MainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView timTwo = findViewById(R.id.nav_timothy_two);
        // Set a click listener on that View
        timTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, Timothy2MainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView tita = findViewById(R.id.nav_tita);
        // Set a click listener on that View
        tita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, TitusMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView phil = findViewById(R.id.nav_philimon);
        // Set a click listener on that View
        phil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, PhilimonMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView heb = findViewById(R.id.nav_ibriya);
        // Set a click listener on that View
        heb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, HebrewsMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView james = findViewById(R.id.nav_jakob);
        // Set a click listener on that View
        james.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, JakobMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView pitOne = findViewById(R.id.nav_pitar_one);
        // Set a click listener on that View
        pitOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, Peter1MainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView pitTwo = findViewById(R.id.nav_pitar_two);
        // Set a click listener on that View
        pitTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, Peter2MainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView johnOne = findViewById(R.id.nav_johan_one);
        // Set a click listener on that View
        johnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, Johan1MainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView johnTwo = findViewById(R.id.nav_johan_two);
        // Set a click listener on that View
        johnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, Johan2MainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView johnThree = findViewById(R.id.nav_johan_three);
        // Set a click listener on that View
        johnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, Johan3MainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView johanThree = findViewById(R.id.nav_johan_three);
        // Set a click listener on that View
        johanThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, Johan3MainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView jude = findViewById(R.id.nav_jihuda);
        // Set a click listener on that View
        jude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, JudeMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

        TextView rev = findViewById(R.id.nav_phondokpiba);
        // Set a click listener on that View
        rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent blogIntent = new Intent(MainActivity.this, RevealationsMainActivity.class);
                // Start the new activity
                startActivity(blogIntent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.hope) {
            Intent prayerIntent = new Intent(MainActivity.this,  Asha.class);
            // Start the new activity
            startActivity(prayerIntent);
            // Handle the camera action
        } else if (id == R.id.ten_com) {

            Intent prayerIntent = new Intent(MainActivity.this, TenCommandments.class);
            // Start the new activity
            startActivity(prayerIntent);
        }

        else if (id == R.id.love) {

            Intent prayerIntent = new Intent(MainActivity.this, Love.class);
            // Start the new activity
            startActivity(prayerIntent);
        } else if (id == R.id.reject) {
            Intent prayerIntent = new Intent(MainActivity.this, Reject.class);
            // Start the new activity
            startActivity(prayerIntent);

        } else if (id == R.id.bad_language) {
            Intent prayerIntent = new Intent(MainActivity.this, BadLanguage.class);
            // Start the new activity
            startActivity(prayerIntent);

        } else if (id == R.id.diligence) {
            Intent prayerIntent = new Intent(MainActivity.this, Diligence.class);
            // Start the new activity
            startActivity(prayerIntent);

        } else if (id == R.id.obedience) {
            Intent prayerIntent = new Intent(MainActivity.this, Obedience.class);
            // Start the new activity
            startActivity(prayerIntent);

        } else if (id == R.id.fear) {
            Intent prayerIntent = new Intent(MainActivity.this, Fear.class);
            // Start the new activity
            startActivity(prayerIntent);

        } else if (id == R.id.work) {
            Intent prayerIntent = new Intent(MainActivity.this, Work.class);
            // Start the new activity
            startActivity(prayerIntent);

        } else if (id == R.id.feelings) {
            Intent prayerIntent = new Intent(MainActivity.this, Wakhal.class);
            // Start the new activity
            startActivity(prayerIntent);

        }else if (id == R.id.friend) {
            Intent prayerIntent = new Intent(MainActivity.this, Friendship.class);
            // Start the new activity
            startActivity(prayerIntent);

        } else if (id == R.id.dating) {
            Intent prayerIntent = new Intent(MainActivity.this, Unabagi.class);
            // Start the new activity
            startActivity(prayerIntent);

        }else if (id == R.id.anti) {
            Intent prayerIntent = new Intent(MainActivity.this, AntiChrist.class);
            // Start the new activity
            startActivity(prayerIntent);

        }else if (id == R.id.anxiety) {
            Intent prayerIntent = new Intent(MainActivity.this, PukningWaba.class);
            // Start the new activity
            startActivity(prayerIntent);
        }

//        }else if (id == R.id.nav_theslon_two) {
//            Intent prayerIntent = new Intent(MainActivity.this, Theslok2MainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
//        }else if (id == R.id.nav_timothy_one) {
//            Intent prayerIntent = new Intent(MainActivity.this, Timothy1MainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
//        }else if (id == R.id.nav_timothy_two) {
//            Intent prayerIntent = new Intent(MainActivity.this, Timothy2MainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
//        }else if (id == R.id.nav_tita) {
//            Intent prayerIntent = new Intent(MainActivity.this, TitusMainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
//        }else if (id == R.id.nav_philimon) {
//            Intent prayerIntent = new Intent(MainActivity.this, PhilimonMainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
//        }else if (id == R.id.nav_ibriya) {
//            Intent prayerIntent = new Intent(MainActivity.this, HebrewsMainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
//        }else if (id == R.id.nav_jakob) {
//            Intent prayerIntent = new Intent(MainActivity.this, JakobMainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
//        } else if (id == R.id.nav_pitar_one) {
//            Intent prayerIntent = new Intent(MainActivity.this, Peter1MainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
//        }else if (id == R.id.nav_pitar_two) {
//            Intent prayerIntent = new Intent(MainActivity.this, Peter2MainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
//        }else if (id == R.id.nav_johan_one) {
//            Intent prayerIntent = new Intent(MainActivity.this, Johan1MainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
//        }else if (id == R.id.nav_johan_two) {
//            Intent prayerIntent = new Intent(MainActivity.this, Johan2MainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
//        }else if (id == R.id.nav_johan_three) {
//            Intent prayerIntent = new Intent(MainActivity.this, Johan3MainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
//        }else if (id == R.id.nav_jihuda) {
//            Intent prayerIntent = new Intent(MainActivity.this, JudeMainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
//        }else if (id == R.id.nav_phondokpiba) {
//            Intent prayerIntent = new Intent(MainActivity.this, RevealationsMainActivity.class);
//            // Start the new activity
//            startActivity(prayerIntent);
//
        else if (id == R.id.nav_about) {
            Intent prayerIntent = new Intent(MainActivity.this,About.class);
            // Start the new activity
            startActivity(prayerIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
