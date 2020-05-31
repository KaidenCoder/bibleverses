//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class Obedience extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_verse_list);
//
//        final ArrayList<Verse> verse = new ArrayList<>();
//        verse.add(new Verse("Haiba inbagi maramda khangnaba Bible gi padasing asi pabiyu.", ""));
//        verse.add(new Verse("Laishon Ishei 119:30", "Nanaidi haiba injagani, Ibungogi wayenduda nanaina yadaba leijade. Laishon Ishei 119:30"));
//        verse.add(new Verse("Yasaia 1:19", "Karigumba nakhoi pukning shenglaba amadi haiba illabadi, chagani leipaksida houba aphaba mahei marongdu. Yasaia 1:19"));
//        verse.add(new Verse("Johan 14:15","Nakhoina eibu nungsirabadi, eigi yathang pumnamak nakhoina ngakkani. Johan 14:15"));
//        verse.add(new Verse("Yasaia 1:19", "Karigumba nakhoi pukning shenglaba amadi haiba illabadi, chagani leipaksida houba aphaba mahei marongdu. Yasaia 1:19"));
//        verse.add(new Verse("Khongshanba 23:22", "Mahakna haiba aduga eina hairiba wasingsi nakhoina cheksinna illabadi, nakhoigi yeknabasingdu eigi yeknaba oigani. Nakhoibu khonglouba midu eina khongloubigani. Khongshanba 23:22"));
//        verse.add(new Verse("Laishon Ishei 119:30", "Nanaidi haiba injagani, Ibungogi wayenduda nanaina yadaba leijade. Laishon Ishei 119:30"));
//        verse.add(new Verse("Pakhonchatpasinggi Thabak 5:29","Tou-i-gumbasung Pitarga pakhongchatpasinggana khumlak-i, misingdagibudi " +
//                "henna iswargi yathang eikhoina inba tare. Pakhonchatpasinggi Thabak 5:29"));
//        verse.add(new Verse("Johan 8:51","Eina nakhoida thanggeisengnamak hairabani, kanagumba mina eigi wa nganglabadi, lomba naidana " +
//                "mahakna siba sup-u uroi. Johan 8:51"));
//        verse.add(new Verse("Johan 14:23","Jisuna mangonda khumlak-i, kanagumbana eibu nungsirabadi, mahakna eigi wa ngakkani, aduga " +
//                "eigi *ipana mahakpu nungsibagani, amasung eikhoina mangonda laktuna mahakka loinana eikhoigi leipham semgani. Johan 14:23"));
//        verse.add(new Verse("Jakob 1:22","Adubu wa adu atouba mi nakhoina oiyu, aduga nakhoina nasa nasamakpu minamjaduna " +
//                "atabada oiganu. Jakob 1:22"));
//        verse.add(new Verse("Khongshanba 23:22", "Mahakna haiba aduga eina hairiba wasingsi nakhoina cheksinna illabadi, nakhoigi yeknabasingdu eigi yeknaba oigani. Nakhoibu khonglouba midu eina khongloubigani. Khongshanba 23:22"));
//
//
//        VerseAdapter adapter = new VerseAdapter(this, verse);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//    }
//}
