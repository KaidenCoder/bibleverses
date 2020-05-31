//package com.manipuribible.kurosaki.manipuribibleverse;
//
////import android.net.Uri;
//import android.os.Parcel;
//import android.os.Parcelable;
//
//public class Blog implements Parcelable {
//
//    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
//        public Blog createFromParcel(Parcel in) {
//            return new Blog(in);
//        }
//
//        public Blog[] newArray(int size) {
//            return new Blog[size];
//        }
//    };
//    private String mId;
//    private String mTitle;
//    private String mAuthor;
//    private String mBibleVerse;
//    private String mDescription;
//
//    public Blog(String id, String title, String releaseDate, String voteAverage, String
//            description) {
//        mId = id;
//        mTitle = title;
//        mAuthor = releaseDate;
//        mBibleVerse = voteAverage;
//        mDescription = description;
//
//    }
//
//    public Blog(Parcel in) {
//        mId = in.readString();
//        mTitle = in.readString();
//        mAuthor = in.readString();
//        mBibleVerse = in.readString();
//        mDescription = in.readString();
//    }
//
//    public String getmId() {
//        return mId;
//    }
//
//    public void setmId(String mId) {
//        this.mId = mId;
//    }
//
//    public String getmTitle() {
//        return mTitle;
//    }
//
//    public void setmTitle(String mTitle) {
//        this.mTitle = mTitle;
//    }
//
//    public String getmAuthor() {
//        return mAuthor;
//    }
//
//    public void setmAuthor(String mAuthor) {
//        this.mAuthor = mAuthor;
//    }
//
//    public String getmBibleVerse() {
//        return mBibleVerse;
//    }
//
//    public void setmBibleVerse(String mBibleVerse) {
//        this.mBibleVerse = mBibleVerse;
//    }
//
//    public String getmDescription() {
//        return mDescription;
//    }
//
//    public void setmDescription(String mDescription) {
//        this.mDescription = mDescription;
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int i) {
//        dest.writeString(mId);
//        dest.writeString(mTitle);
//        dest.writeString(mAuthor);
//        dest.writeString(mBibleVerse);
//        dest.writeString(mDescription);
//    }
//}
//
