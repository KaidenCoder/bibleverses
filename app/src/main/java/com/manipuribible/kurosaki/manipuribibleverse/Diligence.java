//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class Diligence extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_verse_list);
//
//        final ArrayList<Verse> verse = new ArrayList<>();
//        verse.add(new Verse("Maram okpagi maramna punsida karamna mai pakpa ngamgani haiba khangnaba Bible gi padasing asi pabiyu.", ""));
//        verse.add(new Verse("Paorou 13:4", "Atanba mina kayagi matik pamjadunasu mahakna pamliba pottu keidoungeida phangba ngamde. Kanna thabak nomba miduna phangningba pottu phangi. Paorou 13:4"));
//        verse.add(new Verse("Paorou 10:4", "Tallabadi laira tanbani, aduga nomba kallagana inak khunbani. Paorou 10:4"));
//        verse.add(new Verse("Paorou 12:24", "Thabak kanna shubana thouna happani, tallabadi  minai oibani. Paorou 12:24"));
//        verse.add(new Verse("Paorou 6:6-8", "Atanbasingna kakchengsingdagi tamjagadabani. Makhoigi luchingba natraga wayenba amata yaode, ningthamthagidamak makhoina kalen thada machinjak peisilhoui. Paorou 6:6-8"));
//        verse.add(new Verse("Paorou 12:11", "Thabak kanna nomba lou uba nipadu chaba watte aduga kannadaba thabak touduna matam manghanbadi apangbatana tougadabani. Paorou 12:11"));
//        verse.add(new Verse("Paorou 13:4", "Atanba mina kayagi matik pamjadunasu mahakna pamliba pottu keidoungeida phangba ngamde. Kanna thabak nomba miduna phangningba pottu phangi. Paorou 13:4"));
//        verse.add(new Verse("Paorou 10:4", "Tallabadi laira tanbani, aduga nomba kallagana inak khunbani. Paorou 10:4"));
//        verse.add(new Verse("Paorou 12:11", "Thabak kanna nomba lou uba nipadu chaba watte aduga kannadaba thabak touduna matam manghanbadi apangbatana tougadabani. Paorou 12:11"));
//        verse.add(new Verse("Galatiya 6:9","Amasung aphaba touringeida eikhoina waganusi; maramdi sonthadrabadi, achaba matamda eikhoina lokkani. Galatiya 6:9"));
//        verse.add(new Verse("1 Korinthiya 15:58","Maram adugi damak, eigi achanba ichin inaosa, nakhoigi nomjaba adu Prabhugi maphamda aremba " +
//                "natte haina khangjaduna, nakhoi achetpa, lengdaba, Prabhugi thabakta matam leiba khibikta maram okpa oiyu. 1 Korinthiya 15:58"));
//        verse.add(new Verse("Jakob 1:12","Changyengba khangjaba mi adu yaiphabani; maramdi mahakpu phei haina yabirabada, ibungobu " +
//                "nungsibasingda waleppiraba hingbagi luhup adu mahakna phangjagani. Jakob 1:12"));
//        verse.add(new Verse("Paorou 12:24", "Thabak kanna shubana thouna happani, tallabadi  minai oibani. Paorou 12:24"));
//        verse.add(new Verse("Paorou 6:6-8", "Atanbasingna kakchengsingdagi tamjagadabani. Makhoigi luchingba natraga wayenba amata yaode, ningthamthagidamak makhoina kalen thada machinjak peisilhoui. Paorou 6:6-8"));
//        verse.add(new Verse("Ibriya 6:10-12","Maramdi iswarna nakhoigi thabak amasung nungsiba kaonaba dharmachendaba natte; nakhoina " +
//                "asengbasingbu thougan toukhraba amasung touriba aduna Ibungo mahakki minglomda nungsiba adu utpire. Aduga nakhoina tandaduna, thajaba amasung " +
//                "khangheibagi mapanna waleppa adu phangjaba makhoi adugi matou loubasing oinanaba, Nakhoi mi khudingna mamei phaoba khourangna ningba mapung phana " +
//                "khangba tanna pukning changba adumak nakhoina utpa eikhoina pambani. Ibriya 6:10-12"));
//        verse.add(new Verse("Ibriya 11:6","Amasung thajaba yaodanadi Ibungo mahakpu pelhanba ngamde; maramdi iswargi maphamda naksinjarakpa " +
//                "mina iswar lei amasung Ibungo mahakpu thijabasingda mana pibiba mapuni haiba thajaba tare. Ibriya 11:6"));
//
//
//        VerseAdapter adapter = new VerseAdapter(this, verse);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//    }
//}
