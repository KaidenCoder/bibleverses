//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class Fear extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_verse_list);
//
//        final ArrayList<Verse> verse = new ArrayList<>();
//        verse.add(new Verse("Nahakki punsida akiba poklakpa matamda Bible gi padasing asi pabiyu.", ""));
//        verse.add(new Verse("2 Timothiya 1:7","Maramdi iswarni eikhoida akibagi thawai pibide; adubu panggan-gi, nungsibagi " +
//                "amasung masa lakchabagi thawai pibire. 2 Timothiya 1:7"));
//        verse.add(new Verse("Johan 14:27","Ingthaba eina nakhoida thanammi; eigi ingthaba eina nakhoida pibi; taibangpanbana pibagumna eina nakhoida pibide. " +
//                "Nakhoigi pukning olang onsaoba toudasanu, aduga kiba oidasanu. Johan 14:27"));
//        verse.add(new Verse("1 Pitar 5:6-7","Maram aduna iswarna matam chana nakhoibu chaohanbinanaba, ibungo mahakki " +
//                "pangganba khutki makhada nollukchou. Nakhoigi langtaknaba pumnamak ibungo mangonda pumlang langsillu, maramdi ibungo mahakna " +
//                "nakhoigi damak ningbi. 1 Pitar 5:6-7"));
//        verse.add(new Verse("Philippiya 4:6-7","Karisu langtaknaganu, adubu maram khudingda thagatpaga loinana haijabana amasung nonjabana iswargi maphamda nakhoigi nija nijaba adu " +
//                "khanghallu. Aduga iswargi ingthaba, khangba pumnamaktagi hendoklaba aduna, Khrista *Jisuda nakhoigi thammoi amasung wakhalbu ngaksenbigani. Philippiya 4:6-7"));
//        verse.add(new Verse("Yasaia 41:10", "Kiganu maramdi eihak nahakka loinari, nahak lammuknaba touganu maramdi eihak nahakki Mapu Ibungoni, eina nahakpu napanggal happigani aduga nahakpu shougatpigani, eigi mai paktunata leiraba ikhut yet thangbasina nahakpu pangbigani. Yasaia 41:10"));
//        verse.add(new Verse("Laishon Ishei 56:3", "He Lainingthou, panggallaba, nanaigi panggal leijadaba matamda, changjari nanaina Ibungoda. Laishon Ishei 56:3"));
//        verse.add(new Verse("Anisuba Wayellon 31:6 ", "Pukning leppu aduga nashabu thajou. Makhoibu kiganu. Nakhoigi napuroi Lainingthou Ibungo mashamak nakhoiga loinabigani. Ibungo mahakna nakhoibu maithiba piroi amadi hundokpiroi. Anisuba Wayellon 31:6 "));
//        verse.add(new Verse("Joshua 1:9", "Nahak matam leibada wakhan chetpa amadi ninghannadaba nipa ama oinanaba nangonda eina haikhibadu ningshingu. Nahakki napuroi oiriba Lainingthou eina matam leibada nahakka loinana leiba maramna karigumbadasu nahak napukningda kiba pokkanu aduga thammoi piksinganu. Joshua 1:9"));
//        verse.add(new Verse("Yasaia 35:4", "Kibagi irang pakliba thammoisingduda masi haiyu, \"narin leiyu, kiganu. Yengu, nakhoigi Mapu Ibungona laman shingbigani, lakkani aduga nakhoibu kanbigani\". Yasaia 35:4"));
//        verse.add(new Verse("Khongshanba 14:14", "Lainingthou Ibungona nakhoigidamak lan shoknagani maramsina nakhoi tuminna leiyu. Khongshanba 14:14"));
//        verse.add(new Verse("Laishon Ishei 23:4", "Eina ashibasinggi amamba tampakta phaoduna chatlabasu, eingonda akiba karisu leiraroi, Lainingthou. Ibungona nanaibu matam leibada loinabiduna leiri. Ibungogi cheisu cheirengduna nanaibu ngakpiri. Laishon Ishei 23:4"));
//        verse.add(new Verse("Laishon Ishei 34:4", "Eina Lainingthou Ibungoda haijaba matamda Ibungona paokhumbirakkhi. Ibungona eibu akiba kokhanbi. Laishon Ishei 34:4"));
//
//
//        VerseAdapter adapter = new VerseAdapter(this, verse);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//    }
//}
