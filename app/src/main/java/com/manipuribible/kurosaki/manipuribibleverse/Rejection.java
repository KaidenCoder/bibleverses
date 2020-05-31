//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class Rejection extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.old_verse_list);
//
//        final ArrayList<Verse> verse = new ArrayList<>();
//        verse.add(new Verse("Jisu Khristabu yabikhide amasung Mahakna madu mayoknakhi. Yabidaba karamna mayoknagani haiba khangnaba padasing asi pabiyu", ""));
//        verse.add(new Verse("Shingtharon 14:11", "Lainingthou Ibungona Mousida hairammi, \"Kaya kuina misingsina eibu khonggaonagadage? Eina makhoigi marakta angakpa thabak kaya touraba phaobada makhoina eibu matam kaya kuina thajakhiroidage?. Shingtharon 14:11"));
//        verse.add(new Verse("Yasaia 53:3", "Mahakpu taibangna khonggaonarammi, Mahak misinggi mityengdadi thoina mamal leiramde, awa ana khangbatana mahak marai luklammi, eikhoisu mahakpu khonggaonarammi, thoina machangni haina louramde, oirammi mahak misingna yengningdaba potshak ama. Yasaia 53:3"));
//        verse.add(new Verse("Jiramaya 8:9", "Ashingba misingsu ikaiba nangle. Makhoi lammuknare aduga loushing mangle, mathak makha onthokle makhoina Lainingthougi yawadu. Adu oirabadi makhoina shinglibadu karino? . Jiramaya 8:9"));
//        verse.add(new Verse("Laishon Ishei 37:23-24", "Lainingthouna mioibabu lamjingbi, madu shoiba naide, Ibungona mioibana chaokhatpa uraga haraoi. Makhoina ngaihak waba yai adubu atek akaidi yaoroi, Lainingthouna makhoigi khut shambi. Laishon Ishei 37:23-24"));
//        verse.add(new Verse("Mark 6:4", "Amsung Jisuna makhoida hairak-i, iswargi wa takthokpa mibu mahakmakki sagei marakta, amasung mahakmakki imung manungda nattana ikaikhumnadaba natte. Mark 6:4"));
//        verse.add(new Verse("Matthi 5:11-12", "Eigi maramgi damak misingna nakhoibu cheiraba amasung ot-neiraba, aduga nakhoigi nathakta phattaba pumnamak theijillabada nakhoi yaiphabani. Haraojou amasung thoidokna nungaijou, maramdi swargada nakhoigi mana chaoi, maramdi nakhoigi namangda leiramba iswargi wa takthokpasingbu asumna ot neikhei. Matthi 5:11-12"));
//        verse.add(new Verse("Luk 13:34", "Iswargi wa takthokpasingbu hatpa amasung mangonda thakhibasingbu nungna thaba, he Jerusalem, Jerusalem! Yenbina magi mathada machasingbu konsinbagumna, eina nanggi nachasingbu kayatoina konsinningkhiba adubu nakhoina yaning khide! Luk 13:34"));
//        verse.add(new Verse("Luk 10:16", "Nakhoigi wa taba aduna eigi wa tabani, aduga nakhoibu yadaba aduna eibu yadabani, amasung eibu yadaba aduna eibu tharakpa ibungo mahakpu yadabani. Luk 10:16"));
//        verse.add(new Verse("Johan 1:10-11", "Ibungodi taibangpanda leirammi, aduga ibungogi mapanna taibangpal oirakle, amasung taibangpanna ibungobu khanglamde. Ibungona masagi oiba maphamda lengbirak-i, aduga ibungogi masagi oiba misingna ibungobu lousinde. Johan 1:10-11"));
//        verse.add(new Verse("Matthi 21:42", "Jisuna makhoida hai, yum sabasingna channadaba nung adu, madumakna chithekki mapi oihallammi; masi *prabhudagini, amasung masi eikhoigi mittadi angakpani, haina sastrada nakhoina kadoungeidasu pakhidabra? Matthi 21:42"));
//        verse.add(new Verse("Romiya 5:3-4", "Aduga asita natte, adubu eikhoigi awa anangdasu haraosi. Awa anangbana khangheiba, Khangheibana ngamjaba, aduga ngamjabana tarang tarang khangna ningba thokhalli haiba eikhoina khangi. Romiya 5:3-4"));
//
//        VerseAdapter adapter = new VerseAdapter(this, verse);
//        ListView listView = findViewById(R.id.list);
//        listView.setAdapter(adapter);
//    }
//}
