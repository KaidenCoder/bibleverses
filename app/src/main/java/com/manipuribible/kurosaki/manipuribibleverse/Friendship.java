//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class Friendship extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_verse_list);
//
//        final ArrayList<Verse> verse = new ArrayList<>();
//        verse.add(new Verse("Marupki maramda khangnaba Bible gi padasing asi pabiyu.", ""));
//        verse.add(new Verse("Johan 15:13","Kanagumba amana mahakki marupsinggi damak mathawai thabiba, asidagi henna " +
//                "nungsiba kanagisu leite. Johan 15:13"));
//        verse.add(new Verse("Paorou 18:24", "Marup kharadi kuide adubu marup kharadi machin manaodagi henna luna tounei. Paorou 18:24"));
//        verse.add(new Verse("Paoshandokpa 4:9-12", "Anina amadagi henna phei maramdi ashumangi mana henna phangba helli. Karigumba amana turabadi amana chingkhatpigani. Awabadi turaba matamda chingkhatpinaba kanasu leitraba matomta ngairaba miduni. Mi ani yataminnabada lumba helli. Amata ngairabadi lumba wattra? Mi amatta ngairabadi inthuba laibani. Adubu ani shurabadi mayok yaba ngambani. Chei ahum  punsillaga irai laina thudekpa yadabagumbani. Paoshandokpa 4:9-12"));
//        verse.add(new Verse("Paorou 27:5-6", "Kanagumba amagi marandu iphong phongna haibibana thoushadaba mawongda tuminna leithokpadagi henna phei. Marup haibasidi mahakna nahakpu pukning shokpa wa haikhraba phaobada kokpiba ngambaduni. Adubu yeknaba amana mapambom thanggattuna konbirabadi cheksinba phei. Paorou 27:5-6"));
//        verse.add(new Verse("Paorou 16:28", "Phattabasingna warem shandokpa houyi, makhoina khudongthiba thokhalli aduga marup mapang kainahalli. Paorou 16:28"));
//        verse.add(new Verse("Paorou 17:9", "Mina nahakpu nungshihange ninglabadi, makhoina toukhiba aranbasingdu ngakpikho. Makhoina toukhiba aranbasingdu ningshinglabadi marup oiba yaroi. Paorou 17:9"));
//        verse.add(new Verse("Paorou 22:24-27", "Yamna shaoganba aduga tamthiba pukchen chenbasingga tinnaruganu. Nakhoina makhoigi matou tamkhiduna hongdokpa ngamdaba yai. Kanagumba mi amagi shendon shingge haina yaruganu. Karigumba shendondu shingba ngamdrabadi nakhoina hipliba phamung phaoba loukhigani. Paorou 22:24-27"));
//        verse.add(new Verse("Paorou 27:17", "Yotna yot fengbagum midi midagi tambani. Paorou 27:17"));
//        verse.add(new Verse("Paorou 13:20", "Ashingba misingga marup oirabadi loushing shingba hegatlakpani. Apangba misingga marup oirurabadi nakhoisu tumna manggani. Paorou 13:20"));
//        verse.add(new Verse("Paorou 17:17", "Marupti matam leibada nungshiba utpani. Khudongthibada sharuk yaminnadrabadi ichin inaodu kari tounagani? Paorou 17:17"));
//        verse.add(new Verse("1 Theslonikiya 5:11","Maram adugi damak nakhoinasu touriba adugumna amaga amaga thousu thoujinnou amsaung semsu semgatnou. 1 Theslonikiya 5:11"));
//        verse.add(new Verse("1 Korinthiya 15:33","Nakhoibu minamhan-ganu: phattaba tinnabana aphaba machat manghalli. 1 Korinthiya 15:33"));
//        verse.add(new Verse("Luk 6:31","Amasung misingbu nakhoida touhanningbagumna, nakhoinasu makhoida adugumna tou. Luk 6:31"));
//        verse.add(new Verse("Romiya 1:12","Amasung madu asini, eikhoi amaga amagagi thajabana, nakhoigisu eigisu, nakhoigi narakta eiga nakhoigabu " +
//                "insinbinanabani. Romiya 1:12"));
//
//        VerseAdapter adapter = new VerseAdapter(this, verse);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//    }
//}
