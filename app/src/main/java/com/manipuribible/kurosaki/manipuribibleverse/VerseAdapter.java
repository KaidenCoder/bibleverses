//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//public class VerseAdapter extends ArrayAdapter<Verse> {
//
//    public VerseAdapter(Context context, ArrayList<Verse> verse){
//        super(context, 0, verse);
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent){
//        View listItemView = convertView;
//        if (listItemView == null){
//            listItemView = LayoutInflater.from(getContext()).inflate(
//                    R.layout.old_list_item, parent, false);
//        }
//        final Verse currentVerse = getItem(position);
//
//        TextView headerTextView = listItemView.findViewById(R.id.verse);
//        headerTextView.setText(currentVerse.getmVerse());
//
//        TextView descriptionTextView = listItemView.findViewById(R.id.description);
//        descriptionTextView.setText(currentVerse.getmDescription());
//
//
//
//        return listItemView;
//    }
//
//
//}
