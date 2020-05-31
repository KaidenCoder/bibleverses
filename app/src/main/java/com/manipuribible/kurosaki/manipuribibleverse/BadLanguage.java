//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class BadLanguage extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_verse_list);
//
//        final ArrayList<Verse> verse = new ArrayList<>();
//        verse.add(new Verse("Karigi aremba wa ngangloidabano haiba khangnaba padasing asi pabiyu.", ""));
//        verse.add(new Verse("Khongshanba 20:7", "Arembada nakhoigi Mapu Ibungo Lainingthougi minglendu palloidabani. Maran leiba midu Lainingthou Ibungogi minglen shonjadunasu maran leite haina louroi. Khongshanba 20:7"));
//        verse.add(new Verse("Paorou 13:13", "Paotak louningdrabadi khudongthiba taba shoidrabani, paotak illabadi khudongthiba tade. Paorou 13:13"));
//        verse.add(new Verse("Kolosiya 4:6", "Nakhoina mi khudingda karmna khumgadaba khangnanaba , thumgum haohanduna thoujan-ga loinana mattam leiba khibikta nakhoigi wa ngangba oisanu. Kolosiya 4:6"));
//        verse.add(new Verse("Kolosiya 3:8", "Adubu houjikti nakhoinasu pumnamak asi: haibadi, asaoba, meihouna saoba, kallakpa, thina nagangba, nachin nachindagi akamba ngangba thadok-u. Kolosiya 3:8"));
//        verse.add(new Verse("Ephisa 5:4", "Aduga amotpa machet amasung apangba wangang nattraga phagi jugai, pumnamak asi matik chade, adubu madugi mahutta thagatpa tousanu. Ephisa 5:4"));
//        verse.add(new Verse("I Timothiya 4:12", "Nang nahani haiduna kana amatana usittaba toudasanu; adubu nahakti thajabasinggi damak waheida, lichat sajatta nungaibada, thajabada, asengbada pandam oiyu. I Timothiya 4:12"));
//        verse.add(new Verse("Matthi 12:34-35", "He lingi dharasa, nakhoina phatti phattana karamna aphaba ngangba ngambage? Maramdi pukningda leiba ayamba adudagi chinna ngangthok-i. Aphaba mina aphaba pukkeidagi aphaba potsing puthoki, amasung phattaba mina phattaba pukkeidagi phattaba potsing puthok-i. Matthi 12:34-35"));
//        verse.add(new Verse("Matthi 12:36,37", "Amasung eina nakhoida hairibani, misingna nganggabada warem khudingmakki maram wayen-gi numitta pigadabani. Maramdi nanggi waheisingdagi nangbu chummi haina, amasung nanggi waheisingdagi nangbu lalli haina singthanagani. Matthi 12:36,37"));
//
//        VerseAdapter adapter = new VerseAdapter(this, verse);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//    }
//}
