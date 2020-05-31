//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class Employment extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_verse_list);
//
//        final ArrayList<Verse> verse = new ArrayList<>();
//        verse.add(new Verse("Mapu amasung thoumigi marigi matangda khangnaba padasing asi pabiyu", ""));
//        verse.add(new Verse("Paorou 25:13", "Thajaba yaba paopuba nipadu pao thariba nipadugi maphamda lourok panthada khouranglaba matamda ishing thakpagummi. Paorou 25:13"));
//        verse.add(new Verse("Ephisa 6:7-8", "Minai oirabasu, mapu oirabasu, mi khudingna karigumba aphaba thabak tourabadi, mahakna prabhudagi madumak amuk phangjagani haiba khangduna Misingda toubagum nattana, prabhuda toubagumna, aphaba pukningna thougan toubiyu. Ephisa 6:7-8"));
//        verse.add(new Verse("Tita 2:9-10", "Minaisingna maram pumnamakta eikhoigi kanbiba mapu iswargi paotak adu phajahannanaba, makhoi makhoimakki mapusinggi makha ponjaduna maram pumnamakta makhoibu pelhannaba; wa khettaduna, Lonna pot khaidaduna, changkhonna mapu ningba utnaba, insinbiyu . Tita 2:9-10"));
//        verse.add(new Verse("I Timothiya 5:8", "Touigumbasung kanagumbana mahakmakki oiba, aduga thoidokpadi mahakmakki imung manunggi damak langbi-khotpidrabadi, thajaba adu mahakna yadre, aduga thajadaba mida mahakana henna phattabani. I Timothiya 5:8"));
//        verse.add(new Verse("Jakob 5:4", "Yeng-u, nakhoigi lou khaoba langbasinggi khutlangman, nakhoina lounam touduna khakhouba aduna laothok-i; aduga lou lokpasinggi laoba aduna *lanmi mayamgi prabhugi nakongda changle. Jakob 5:4"));
//        verse.add(new Verse("Kolosiya 3:23", "Misinggi maphamda nattaduna, prabhugi maphamda toubagumna, nakhoina touba makhei thawai yaona tou. Kolosiya 3:23"));
//
//        VerseAdapter adapter = new VerseAdapter(this, verse);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//    }
//}