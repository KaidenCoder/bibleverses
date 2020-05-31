//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class Anxiety extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_verse_list);
//
//        final ArrayList<Verse> verse = new ArrayList<>();
//        verse.add(new Verse("Nahakki punsina paleppham khangdraba matamda Bible gi padasing asi pabiyu.", ""));
//        verse.add(new Verse("Laishon Ishei 34:17-18", "Achumba toubasingduna Lainingthoubu ningshingi aduga Ibungona tabi, Ibungona makhoibu khudongthibadagi kanbi. Pukning hantharabasingdugi manakta Lainingthouna nakna leibi, asha leijadrabsingdusu Ibungona kanbi. Laishon Ishei 34:17-18"));
//        verse.add(new Verse("Yasaia 41:10", "Kiganu maramdi eihak nahakka loinari, nahak lammuknaba touganu maramdi eihak nahakki Mapu Ibungoni, eina nahakpu napanggal happigani aduga nahakpu shougatpigani, eigi mai paktunata leiraba ikhut yet thangbasina nahakpu pangbigani. Yasaia 41:10"));
//        verse.add(new Verse("Jiramaya 29:11", "Nakhoigidamak kari tougani haibadu eina phajana khangi. Lainingthou Ibungona takpiri: Nakhoigi yaipha thouram tungda thokkadaba aphaba amadi ashagi urongdu eina shemba loire. Jiramaya 29:11"));
//        verse.add(new Verse("Paorou 3:5-6", "Lainingthoubu thammoi amadi hakchang animak mannana thajou. Nahakna khangba pottuna aroibani ningganu. Nahakna touruba hiramni khudingda Lainingthoubu ningshingu, aduga Ibungona nakhoida lambi achumbadu takpigani. Paorou 3:5-6"));
//        verse.add(new Verse("Laishon Ishei 9:9", "Otneiribasingdugi changjaphamdi Lainingthou Ibungona oibi, awaba matamda Ibungoda thuppham oi. Laishon Ishei 9:9"));
//        verse.add(new Verse("Anisuba Wayellon 31:8", "Lainingthou Ibungomakna nahakpu matam leibada loinabigani. Ibungo Mahakna nahakpu maithihalloi aduga natomta thadokpiroi. Maramsina pukning hanthaba natraga kiba touganu. Anisuba Wayellon 31:8"));
//        verse.add(new Verse("Laishon Ishei 23:4", "Eina ashibasinggi amamba tampakta phaoduna chatlabasu, eingonda akiba karisu leiraroi, Lainingthou. Ibungona nanaibu matam leibada loinabiduna leiri. Ibungogi cheisu cheirengduna nanaibu ngakpiri. Laishon Ishei 23:4"));
//        verse.add(new Verse("Paorou 3:5-6", "Lainingthoubu thammoi amadi hakchang animak mannana thajou. Nahakna khangba pottuna aroibani ningganu. Nahakna touruba hiram khudingda Lainingthoubu ningshingu, aduga Ibungona nakhoida lambi achumbadu takpigani. Paorou 3:5-6"));
//        verse.add(new Verse("Laishon Ishei 94:19", "Khoirangba amadi waraba matamda, Ibungona nanaibu themjinbiduna awaba kokhanbi. Laishon Ishei 94:19"));
//        verse.add(new Verse("1 Pitar 5:7","Nakhoigi langtaknaba pumnamak ibungo mangonda pumlang langsillu, maramdi ibungo mahakna nakhoigi damak ningbi. 1 Pitar 5:7"));
//        verse.add(new Verse("Philippiya 4:6-7","Karisu langtaknaganu, adubu maram khudingda thagatpaga loinana haijabana amasung nonjabana iswargi maphamda nakhoigi nija nijaba adu " +
//                "khanghallu. Aduga iswargi ingthaba, khangba pumnamaktagi hendoklaba aduna, Khrista *Jisuda nakhoigi thammoi amasung wakhalbu ngaksenbigani. Philippiya 4:6-7"));
//        verse.add(new Verse("Matthi 6:27","Aduga nakhoi kanana langtaknaduna magi punsi aduda khudup ama hengat-hanba ngambage? Matthi 6:27"));
//        verse.add(new Verse("Matthi 6:25-29","Maram asina eina nakhoida hairibani nakhoina hingnabagi damak kari chagani, kari thakkani aduga nakhoigi hakchanggi " +
//                "damak kari setkadage haina langtaknaganu. Atiya ucheksingbu yengu; makhoina hunsu hunde, khaosu khaode, aduga kottasu peisinde; amasung nakhoigi swargagi napana " +
//                "makhoibu pijabi. Nakhoidi makhoidagi thoidok hendokpa nattra? Aduga nakhoi kanana langtaknaduna magi punsi aduda khudup ama hengat-hanba ngambage? Aduga phijetkidamak karigi " +
//                "langtaknabano? Loubukki tharosingna karamna houbage munna wakhal tou; makhoina nomsu nomde, langsu naide; Adubu eina nakhoida hairibani, Solomonmaknasu magi matik " +
//                "mangal pumnamakta makhoi asigi maraktagi amagumna phijet leitengkhide. Matthi 6:25-29"));
//        verse.add(new Verse("Matthi 6:34","Maram asina hayenggidamak langtaknaganu, maramdi hayenggidi hayeng masana adumak langtaknajani. Nongmagi " +
//                "waruba aduna nongma adugi matik chare. Matthi 6:34"));
//
//        VerseAdapter adapter = new VerseAdapter(this, verse);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//    }
//}
