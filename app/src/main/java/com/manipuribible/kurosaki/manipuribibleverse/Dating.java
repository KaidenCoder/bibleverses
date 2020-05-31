//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class Dating extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_verse_list);
//
//        final ArrayList<Verse> verse = new ArrayList<>();
//        verse.add(new Verse("Unabagi maramda khangnaba padasing asi pabiyu", ""));
//        verse.add(new Verse("I Korinthiya 6:13", "Achapotna pukkidamakni, aduga pukna achapotkidamakni, adubu Ishorna amabusu amabusu manghangani. Touigumbasung hakchangdi marumbi thabakkidamak natte, Prabhugidamakni; aduga Prabhuna hakchanggidamakni. I Korinthiya 6:13"));
//        verse.add(new Verse("I Korinthiya 6:18", "Marumbi thabaktagi  chenthoku. Mina touba pap khuding hakchanggi mapandani; adubu marumbi tinnaba mahak aduna mahakmakki hakchangbu yeknaduna pap toubani. I Korinthiya 6:18"));
//        verse.add(new Verse("II Timothiya 2:22", "Touigumbasung naha oibagi apaiba makheidagi chenthok-u, asengba pukningdagi prabhubu koujabasingga loinana dharmachenbagi, nungsibagi, ingthabagi matung illa. II Timothiya 2:22"));
//        verse.add(new Verse("Amos 3:3", "Munu taibang anina haina-shingna leitanadi karamna punna amuktada chatminnagadage? Amos 3:3"));
//        verse.add(new Verse("Paorou 22:24", "Yamna shaoganba aduga tamthiba pukchen chenbasingga tinnaruganu. Paorou 22:24"));
//        verse.add(new Verse("II Korinthiya 6:14-15", "Thajadabasingga pabot oiminnaganu. maramdi dharmachenbaga dharmachendabaga kari mapang oibage?  Aduga anganbaga amambaga kari tinnabage? Amasung Khristaga* Beliyalga kari mannaba leibage? Aduga thajabaga thajadabaga kari saruk oinabage? II Korinthiya 6:14-15"));
//        verse.add(new Verse("I Korinthiya 5:11", "Adubu masingumbani, ichin inao minggou thoknaba kanagumbana marumbi thamba, karamba, lai-murti latpa wahei thiba, yu ngaoba nattraga namjanamtheknaba oirabadi, mi adugumbaga totnaganu haibata natte, chaba phaoba chaminnaganu haiduna eina nakhoida ikhibani. I Korinthiya 5:11"));
//        verse.add(new Verse("II Theslonikiya 3:6", "Amahiksung, ichin inaosa, eikhoina nakhoibu Prabhu Jisu Khrista gi mingda yathang piri. Haibadi, atanba amasung nakhoina ekhoidagi phangkhiba chatnarakhiba adugi matung indaba nachin nanao khuding dagi nakhoi nasana khaidokchou. II Theslonikiya 3:6"));
//        verse.add(new Verse("I Pitar 3:4", "Adubu nakhoigi leiteng pukninggi arotpa mi adu tappa amasung ingba thawaigi mangdaba phijetna leitengba oisanu, masi iswargi mityengda mamal lubani. I Pitar 3:4"));
//        verse.add(new Verse("Laishon Ishei 51:2-4", "Phattaba pumba kokhanbiduna nanaigi iran leihanbiganu. Nanaigi irandu khangjare,  Nanaina toujakhiba iran pumba khangjadaba natte. Ibungogi naphamda nanaina langjakhrabani, Ibungogi mityengda phatte haiba thabaksingdu nanaina toukhre. Nanaibu wayen cheirak pibiba matamda hainingai leijade, Nanaibu awapham pibada hainingai leijade. Laishon Ishei 51:2-4"));
//        verse.add(new Verse("Romiya 15:5,6", "Pukning amata mina nakhoina chin amana eikhoigi prabhu Jisu Khristagi iswarsu mapasu oiba adubu thagatnaba, Khrista Jisugi matung inna amaga amaga mannaba pukning adubu khangheibagi amasung insinbibagi iswarna nakhoida pibisanu. Romiya 15:5,6"));
//        verse.add(new Verse("Philippiya 2:1,2 ", "Maram aduna Khristadagi karigumba insinbiba, nungsibagi karigumba themjinbiba, *thawaigi karigumba tinnaba, karigumba nungsiheiba amasung chanbiba leirabadi, Nakhoina chap mannaba nungsiba leiduna, pukning amata, thawai amata oiduna, pukning mannaduna, eigi haraoba mapung phahanbiyu. Philippiya 2:1,2 "));
//        verse.add(new Verse("Philippiya 2:4", "Nakhoi mi khudingna magi magi marannai yengdaduna, atei ateisinggidasu yengsanu. Philippiya 2:4"));
//        verse.add(new Verse("Meihouron 2:18", "Masigi matungda Mapu Ibungo Lainingthouna hairammi, \"Nipasi matomta leiba phatte. Eina mahakkidamak mapang ama pibirage?\" Meihouron 2:18"));
//        verse.add(new Verse("Paorou 19:14", "Mapa mamagi lan thum amadi yumdu phanghourabasu loushing leibi nupi ama taloi oina phangba haibasidi Lainingthougi thoushinni. Paorou 19:14"));
//        verse.add(new Verse("Laishon Ishei 37:4", "Lainingthoubu phangjabaduna nahakki nungaibani, Nahakki thammoina pamlibadu Ibungona mapan naidana pinabigani. Laishon Ishei 37:4"));
//        verse.add(new Verse("II Pitar 1:6,7", "Nakhoigi khangbada nasa khudum chanjaba, nakhoigi nasa khudum chanjaba khangheiba, nakhoigi khangheibada iswarningba, Nakhoigi iswar ningbada nachin nanaogumna channaba, amasung nakhoigi nachin nanaogumna channabada nungsiba hapchillu. II Pitar 1:6,7"));
//        verse.add(new Verse("Romiya 13:13", "Eikhoina nungthinda chatpagumna chumna chatsi; lamchat haptaba amasung yungaoba, machat phattaba amasung apaiba, khatna-cheinaba amasung kallakpa touganusi. Romiya 13:13"));
//        verse.add(new Verse("I Johan 3:3", "Aduga ibungogi maphamda khourang-na ningba asi leiba mi khuding-na, ibungona sengbagumna, masa mathantabu sengdokchei. I Johan 3:3"));
//        verse.add(new Verse("I Theslonikiya 4:3-5", "Maramdi nakhoigi sengdokpiba asi iswargi ningbani, haibadi, nakhoina marumbi thamdanaba, Iswarbu khangdaba atoppa jatsinggumna, apaibada thawai luppa oiduna, Nakhoi mi khudingna nasa nasagi nupibu sengma amasung ikaikhumnana louba nakhoina khangnaba. I Theslonikiya 4:3-5"));
//        verse.add(new Verse("Matthi 6:8", "Maram aduna makhoi gumganu, maramdi nakhoina nijadringeida nakhoigi awatpa leiba adu *napana khangbi."));
//
//        VerseAdapter adapter = new VerseAdapter(this, verse);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//    }
//}
