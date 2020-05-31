//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class Love extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_verse_list);
//
//        final ArrayList<Verse> verse = new ArrayList<>();
//        verse.add(new Verse("Nungshibagi maramda khangba ngamnaba Bible gi padasing asi pabiyu.", ""));
//        verse.add(new Verse("Laishon Ishei 86:15", "Adubu he Ipuroi, Ibungodi  thoujan heiba Ibungoduni, matam leibada khangbiheiba, thoujan heiba amadi hongnaidabani. Laishon Ishei 86:15"));
//        verse.add(new Verse("Joshua 22:5", "Lainingthou Ibungogi manai Mousina taklamba napuroi Lainingthou Ibungobu luna tougadabani, Mahakki yathang ngakna  chatkadabani, Ibungo Mahakki aningbadu tougadabani, Ibungoda changjagadabani, aduga Ibungo Mahakpu thawai hakchang yaona seba tougadabani haikhibadu kaidana chatlu. Joshua 22:5"));
//
//
//        verse.add(new Verse("Romiya 5:8"," Touigumbasung eikhoina papchenba mi oiringeimaktada, Khristana eikhoigidamak sibiba " +
//                "aduda iswarna eikhoiromda ibungomahakmakki nungsiba utpire. Romiya 5:8"));
//        verse.add(new Verse("Johan 14:15","Nakhoina eibu nungsirabadi, eigi yathang pumnamak nakhoina ngakkani. Johan 14:15"));
//        verse.add(new Verse("Johan 13: 34-35","Anouba yathang ama eina nakhoida piri, nakhoi amaga amaga nungsinou; eina nakhoibu nungsiba " +
//                "adugumna nakhoisu amaga amaga nungsinou. Nakhoida amaga amaga nungsinaba leirabadi, asina mi pumnamakna nakhoi eigi sebokni haiba khanggani. Johan 13: 34-35"));
//        verse.add(new Verse("1 Korinthiya 13:4-7","Nungsibana kuina khangsu khangbi, chansu chanbi; nungsibana kallakte, napal toude, chaothokte, " +
//                "Athiba machat chatte, marannai thide, saode, phattaba sinthade; Dharmachendabada haraode, adubu achumbaga haraominnei; Pumnamak pubi, " +
//                "pumnamak thajei, pumnamak ining ningbi, pumnamak khangbi. 1 Korinthiya 13:4-7"));
//        verse.add(new Verse("1 Johan 4:18-19","Nungsibada akiba leite, touigumbasung changkhonba nungsibana akiba langthok-i; maramdi akibadi wakongga tinnabani; " +
//                "aduga akiba mahak aduna nungsibada changkhonde. Eikhoina nungsi, maramdi ibungo mahakna eikhoibu hanna nunsibire. 1 Johan 4:18-19"));
//
//        VerseAdapter adapter = new VerseAdapter(this, verse);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//    }
//}
