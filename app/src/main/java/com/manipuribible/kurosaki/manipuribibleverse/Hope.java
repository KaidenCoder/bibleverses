//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class Hope extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_verse_list);
//
//        final ArrayList<Verse> verse = new ArrayList<>();
//        verse.add(new Verse("Ashagi maramda khangnaba Bible gi padasing asi pabiyu.", ""));
//        verse.add(new Verse("Paorou 24:14", "Thawaigidi loushing leibana henna phabani haibasi khangjillu. Loushingbu phangnaba hotnou adu oirabadi tungda lakkadouba punsidu manganna thallakkani. Paorou 24:14"));
//        verse.add(new Verse("Yasaia 40:31", "Adubu makhoida Lainingthouna panggal happigani haiduna ngaiduna leiri. Makhoina achouba uchekki matougumna paiba ngamgani, makhoina yamna chendunasu chokthaba kouba leiroi, makhoi yamna athappa naphamda chattunasu tuba leiroi. Yasaia 40:31"));
//        verse.add(new Verse("Jiramaya 29:11", "Nakhoigidamak kari tougani haibadu eina phajana khangi. Lainingthou Ibungona takpiri: Nakhoigi yaipha thouram tungda thokkadaba aphaba amadi ashagi urongdu eina shemba loire. Jiramaya 29:11"));
//        verse.add(new Verse("Romiya 8:25","Adubu eikhoina udaba adugi damak eikhoina tarang tarang khangna ninglabadi, eikhoina " +
//                "madugi damak khangheina ngaijei. Romiya 8:25"));
//        verse.add(new Verse("Romiya 15:13","Thawai asengbagi pangganna nakhoigi tarang tarang khangna ningba hengatnanaba, tarang " +
//                "tarang khangna ningbagi iswarna nakhoigi thajabada haraoba amasung ingthaba pumnamakna nakhoibu thalhanbisanu. Romans 15:13"));
//        verse.add(new Verse("Romiya 12:12","Tarang tarang khangna ningbada haraojou; awabada khangheiyu; haijabada tattaba oiyu. Romiya 12:12"));
//        verse.add(new Verse("Ibriya 11:1","Thajabadi khourangna ningba potki areppani, aduga udaba potki maramda wakhal tarabani. Ibriya 11:1"));
//        verse.add(new Verse("1 Theslonikiya 5:11","Maram adugi damak nakhoinasu touriba adugumna amaga amaga thousu thoujinnou amsaung semsu semgatnou. 1 Theslonikiya 5:11"));
//        verse.add(new Verse("Romiya 15:4","Maramdi satradagi thokpa khangheiba amasung insinbibagi mapanna eikhoina tarang tarang khangna ningba phangnanaba, mamangngeida ikhi ikhiba adu eikhoigi tamnanabagidamak ikhibani. Romiya 15:4"));
//        VerseAdapter adapter = new VerseAdapter(this, verse);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//    }
//}
