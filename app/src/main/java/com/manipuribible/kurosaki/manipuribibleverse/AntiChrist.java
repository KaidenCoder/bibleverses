//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class AntiChrist extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_verse_list);
//
//        final ArrayList<Verse> verse = new ArrayList<>();
//        verse.add(new Verse("Anti Christ ki maramda cheksinnaba padasing asi pabiyu",""));
//        verse.add(new Verse("2 Johan 1:7","Maramdi Jisu Khristana hakchang oina lengbiraki haiba yadaba ayamba minambasingna taibangpanda thokkhre. Asi minamba mi aduni amasung Anti Christ aduni. 2 Johan 1:7"));
//        verse.add(new Verse("I Johan 2:18", "Angangsa, akonba pungni; aduga +anti-Khrista lak-i haiba nakhoina tarabagumna houjiksu ayamnba +anti-Khristtasing thoklakle; asidagi akonba pungni haiba eikhoina khang-i. I Johan 2:18"));
//        verse.add(new Verse("I Johan 2:19", "Makhoidi eikhoidagi chathokkre, adubu makhoidi eikhoigi oiramde; maramdi makhoina eikhoigi oiramlabadi, eikhoiga tattana leiminnaramgadabani; touigumbasung makhoi pumnamak eikhoigi oiramde haiba phongdoknanaba chatthokkre. I Johan 2:19"));
//        verse.add(new Verse("I Johan 2:22", "Jisubu Khristani haiba yadaba mahak adu nattana chin thiba adu kanano? *Mapabasu macha nipa adubusu yadaba +anti-Khrist adu asini. I Johan 2:22"));
//        verse.add(new Verse("I Johan 4:1", "Achanbasa, thawai khudingbu thajaganu, adubu thawaising adu iswardagira chang yeng-u; maramdi ayamba iswargi wa takthoksinnabasing taibangpan-gi manungda chathokkhre. I Johan 4:1"));
//        verse.add(new Verse("II Korinthiya 11:4,13-15", "Maramdi arakpa mina eikhoina sandoktaba atoppa Jisu sandoklabadi, nattraga nakhoina phangdaba tonganba thawai phanglabadi nattraga nakhoina jadaba tonganba aphaba wapao yarabadi, nakhoina mahakpu phajana khangbida! Maramdi asigumba misingdi chumdaba pakhonchatpa, minamba thabak touba, Khristagi pakhonchatpasingga makhoi masana mannahanjaba misingni. Aduga masi angakpa natte, maramdi *seitannasu masa mathantabu mangan-gi dutka mannahanjei. Maram aduna magi thougan toubasingna masa masabu dharmachenbagi thougan toubasinngumna mannahanjarabadi, madu achouba wa natte; makhoigi aroibadi makhoi makhoigi thabak matung inba oigani. II Korinthiya 11:4,13-15"));
//        verse.add(new Verse("II Theslonikiya 2:8", "Amasung matam aduna wayel yathang indaba mahak adubu phongdokkani; Prabhu Jisuna Ibungogi chin-gi nungsaswarna mahakpu hattuna, Ibungo lengbirakpa uhanbana aremba oihan-gani. II Theslonikiya 2:8"));
//        verse.add(new Verse("II Theslonikiya 2:9,10", "Mahak lakpa adu seitan-gi thabak toubagi matung inna panggal pumnamakka, khudamsinnga, minamba angak angakpa ga, Amasung manglibasinggi damak dharamachandabagi minamba pumnamakka loinagani; maramdi makhoi kanbiba phangnanaba achumbagi nungsiba adubu makhoina loude. II Theslonikiya 2:9,10"));
//        verse.add(new Verse("Matthi 7:15", "Yaogi phijet setpa, adubu manungdadi charamnaba keisal oina nakhoida lakpa iswargi wa takthopksinnabasingbu cheksillu. Matthi 7:15"));
//        verse.add(new Verse("Matthi 7:21-23", "Eingonda prabhu, prabhu, haiba mi khudingmakna swarga leibakta changloi, touigumbasung swargada leiba ipagi ningba touriba mi aduna changani. Numit aduda ayambana eigonda haigani, prabhu, prabhu, eikhoina ibungogi minggi mapanna iswargi wa takthok chakhidra, ibungogi minggi mapanna bhutsingbu tanthokchakhidra, amasung ibungogi minggi manpanna toungamdaba thabak ayamba toujakhidra? Matam aduda eina makhoida phongna haidokkani, eina keidoungeidasu nakhoibu khanglamde; he touheidaba toubasa, eingondagi chatthokkhro. Matthi 7:21-23"));
//        verse.add(new Verse("Matthi 24:4-5", "Aduda Jisuna makhoida khumlak-i, kananasu nakhoibu serannana lamjingdanaba cheksillu. Maramdi, ei Khristani, haiduna ayambana eigi imingda lakkani; aduga ayambabu serannana chingani. Matthi 24:4-5"));
//        verse.add(new Verse("Matthi 24:23-26", "Matam aduda, yeng-u asida, nattraga aduda Khrista lei, haina kanagumbana nakhoida hairabadi thajaganu. Maramdi khrista sasinnabasing amasung iswargi wa takthoksinnabasing thokkani, aduda ngamlabadi khan-gat-pasing phaoba serannana lamjingnaba, achouba khudamsing amasung angak angakpa utkani. Yeng-u, eina nakhoida mangjounana haikhre. Maram aduna makhoina nakhoida, yeng-u, Ibungo lamjaoda lei, hairabadi chatthokluganu; aduga, yeng-u, Ibungo achikpa kada lei, hairabasu thajaruganu. Matthi 24:23-26"));
//
//        VerseAdapter adapter = new VerseAdapter(this, verse);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//    }
//}
