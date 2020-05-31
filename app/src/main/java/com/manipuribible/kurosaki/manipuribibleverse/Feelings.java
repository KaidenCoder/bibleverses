//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class Feelings extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_verse_list);
//
//        final ArrayList<Verse> verse = new ArrayList<>();
//        verse.add(new Verse("Nahakki pukning shokpa matamda Bible gi padasing asi pabiyu.", ""));
//        verse.add(new Verse("Paorou 12:15", "Apangba misingna makhoina touribadu achumbani ningi. Ashingba misingna migi paotak loui. Paorou 12:15"));
//        verse.add(new Verse("Jakob 1:20","Maramdi migi asaobana iswargi dharmachenbagi thabak toude. Jakob 1:20"));
//        verse.add(new Verse("Paorou 14:12-13", "Achumba lambel chatluduna karisu kannaba leite haina nakhoina khanba yai. Awabasu nokpana lotpa yai. Nungaiba hek loikhibaga awabana tungoinei. Paorou 14:12-13"));
//        verse.add(new Verse("Jiramaya 17:9", "Taibang mioibagi thammoisi leiriba potsinggi marakta khwaidagi lounam touba potni, hainingai leitana marin shengde, kanana mioibagi thammoibu khangba ngambage? Jiramaya 17:9"));
//        verse.add(new Verse("Paorou 29:11", "Apangbasingna ashaobadu fongna laothoki. Aduga khangba kanbaga loinana ashingbasingna fongdoktana tuminna leiba ngami. Paorou 29:11"));
//        verse.add(new Verse("Paorou 12:15", "Apangba misingna makhoina touribadu achumbani ningi. Ashingba misingna migi paotak loui. Paorou 12:15"));
//        verse.add(new Verse("Paorou 14:12-13", "Achumba lambel chatluduna karisu kannaba leite haina nakhoina khanba yai. Awabasu nokpana lotpa yai. Nungaiba hek loikhibaga awabana tungoinei. Paorou 14:12-13"));
//        verse.add(new Verse("Jiramaya 17:9", "Taibang mioibagi thammoisi leiriba potsinggi marakta khwaidagi lounam touba potni, hainingai leitana marin shengde, kanana mioibagi thammoibu khangba ngambage? Jiramaya 17:9"));
//        verse.add(new Verse("Paorou 16:32", "Panggal fudokpadagidi khangba kanbana henna phei. Sahar amabu nakhada thamgadoubagi sharukpudi nashana nashabu laksinba ngambaduna henna phei. Paorou 16:32"));
//        verse.add(new Verse("Yasaia 55:9", "Nongmadonna malemsidagi henna wangbagum, nakhoigi lambidudagi eigi lambina henna wangi, wangi nakhoigi wakhandagi eigi wakhanna. Yasaia 55:9"));
//        verse.add(new Verse("Paorou 28:26", "Nashagi apambada induna chatpa aphaba natte. Ashingba misinggi paotak matung inna chattuna khudong thibada tadanaba hotnou. Paorou 28:26"));
//        verse.add(new Verse("Ephisa 4:32","Aduga nakhoi amaga amaga channou, pukning nouba oi-u; Iswarnasu Khristagi mapanna nakhoibu " +
//                "kokpiraba adugumna, nakhoi amana amabu koknou. Ephisa 4:32"));
//        verse.add(new Verse("1 Korinthiya 14:33","Maramdi Iswardi ninkhongbagi Iswar natte, ingthabagini. Asengbasinggi singlup " +
//                "pumnamakta asum chatnabani. 1 Korinthiya 14:33"));
//        verse.add(new Verse("1 Johan 2:15-17","Taibangpanbabu amasung taibangpangi manungda leiriba potsing adubu nungsiganu. " +
//                "Kangumba mina taibanpanbabu nungsirabadi, *mapabu nungsibadu mangonda leite. Maramdi taibangpanda leiriba pumnamak, hakchanga pamba, mitna " +
//                "pamba, amasing punsigi napal *ipadagi natte, adubu taibangpandagini. Aduga taibangpanbsu madugi apambasu mangba nai; adubu iswargi ningba touba " +
//                "mi aduna lomba naidana itattattana lei. 1 Johan 2:15-17"));
//        verse.add(new Verse("1 Johan 4:20","Kanagumba mina, eina iswarbu nungsi, hairaga machin manaobu tukkacharabadi, mahakti chinthiba mini; maramdi " +
//                "mahakna uraba machin manaobu nungsidaba mahak aduna udriba iswarbu nungsiba ngamde. 1 Johan 4:20"));
//        verse.add(new Verse("Jakob 4:6","Adubu ibungo mahakna thoujan henna pibi. Maram adugidamak sastrana hai, iswarna chaothokpasingbu " +
//                "thing-i, adubu nollukpasingda thoujal pibi. James 4:6"));
//        verse.add(new Verse("Romiya 10:17","Maram aduna paodam tabadugi thajaba adu amasung Khristagi wa adugi mapanna paodam adu thoki"));
//        verse.add(new Verse("Ephisa 4:26","Sairabasu, pap touganu, nakhoi saoringeida numit tahanganu. Ephisa 4:26"));
//        verse.add(new Verse("Romiya 8:1","Maram aduna houjik Khrista Jisuda leiribasingda aranba tahanba leite. Romiya 8:1"));
//
//        VerseAdapter adapter = new VerseAdapter(this, verse);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//    }
//}
