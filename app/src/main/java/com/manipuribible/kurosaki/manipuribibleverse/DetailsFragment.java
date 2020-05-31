//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.support.v4.app.Fragment;
////import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
////import android.widget.ImageView;
//import android.widget.TextView;
//
//public class DetailsFragment extends Fragment {
//
//    private static final String LOG_TAG = DetailsFragment.class.getSimpleName();
//    private static final String ARG_MOVIE = "arg_movie";
//
//    private Blog mMovie;
//
//    public DetailsFragment() {
//        // Required empty public constructor
//    }
//
//    // Create new Fragment instance
//    public static DetailsFragment newInstance(Blog movieSelected) {
////        DetailsFragment fragment = new DetailsFragment();
////        Bundle args= new Bundle();
//        args.putParclable(ARG_MOVIE, movieSelected);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mMovie = getArguments().getParcelable(ARG_MOVIE);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        View view = inflater.inflate(R.layout.old_fragment_details, container, false);
//
//        if (mMovie != null) {
//
//            //ImageView posterView = (ImageView) view.findViewById(R.id.poster);
//            //Glide.with(getActivity()).load(mMovie.getPosterUri()).into(posterView);
//
//            TextView titleView = (TextView) view.findViewById(R.id.title_content);
//            titleView.setText(mMovie.getmTitle());
//
//            TextView releaseDateView = (TextView) view.findViewById(R.id.author_content);
//            releaseDateView.setText(mMovie.getmAuthor());
//
//            TextView averageView = (TextView) view.findViewById(R.id.verse_content);
//            averageView.setText(mMovie.getmBibleVerse());
//
//            TextView overviewView = (TextView) view.findViewById(R.id.description_content);
//
//            // In portuguese, some movies does not contain overview data. In that case, displays
//            // default text: @string/overview_not_available
//            if (!TextUtils.isEmpty(mMovie.getmDescription())) {
//                overviewView.setText(mMovie.getmDescription());
//            }
//        }
//
//        return view;
//    }
//}
//
