//package com.manipuribible.kurosaki.manipuribibleverse;
//
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
////import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.List;
//
//public class BlogRecyclerViewAdapter extends RecyclerView.Adapter<BlogRecyclerViewAdapter
//        .ViewHolder> {
//
//    private static final String LOG_TAG = BlogRecyclerViewAdapter.class.getSimpleName();
//
//    private final List<Blog> mMoviesList;
//    private final BlogListFragment.OnMoviesListInteractionListener mListener;
//
//    public BlogRecyclerViewAdapter(List<Blog> moviesList, BlogListFragment
//            .OnMoviesListInteractionListener listener) {
//        mMoviesList = moviesList;
//        mListener = listener;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.old_fragment_blog_item, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(final ViewHolder holder, int position) {
//        holder.mItem = mMoviesList.get(position);
//
//       // Glide.with(holder.mPosterView.getContext()).load(holder.mItem.getPosterUri())
//       //         .dontTransform().into(holder.mPosterView);
//
//        holder.mTitle.setText(holder.mItem.getmTitle());
//        holder.mAuthor.setText(holder.mItem.getmAuthor());
//        holder.mView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (null != mListener) {
//                    // Notify the active callbacks interface (the activity, if the
//                    // fragment is attached to one) that an item has been selected.
//                    mListener.onMoviesListInteraction(holder.mItem);
//                }
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return mMoviesList.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//
//        public Blog mItem;
//
//        public final View mView;
//       // public final ImageView mPosterView;
//        public final TextView mTitle;
//        public final TextView mAuthor;
//
//        public ViewHolder(View view) {
//            super(view);
//            mView = view;
//           // mPosterView = (ImageView) view.findViewById(R.id.poster);
//            mTitle = (TextView) view.findViewById(R.id.title);
//            mAuthor = view.findViewById(R.id.author);
//        }
//
//        @Override
//        public String toString() {
//            return super.toString();
//        }
//    }
//
//    //@Override
//    //public void onViewRecycled(ViewHolder holder) {
//   //     Glide.clear(holder.mPosterView);
//   // }
//
//
//    // Method implementation based on http://stackoverflow
//    // .com/questions/29978695/remove-all-items-from-recyclerview
//    // It resets the list and notifies the adapter
//    public void clearRecyclerViewData() {
//        int size = mMoviesList.size();
//        if (size > 0) {
//            for (int i = 0; i < size; i++) {
//                mMoviesList.remove(0);
//            }
//            notifyItemRangeRemoved(0, size);
//        }
//    }
//}
//
