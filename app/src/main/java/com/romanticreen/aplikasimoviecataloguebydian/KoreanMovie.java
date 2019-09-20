package com.romanticreen.aplikasimoviecataloguebydian;

import android.os.Parcel;
import android.os.Parcelable;

public class KoreanMovie implements Parcelable {
    private String koreanmoviename;
    private String koreanmoviedesc;
    private String koreanmoviephoto;

    protected KoreanMovie(Parcel in) {
        koreanmoviename = in.readString();
        koreanmoviedesc = in.readString();
        koreanmoviephoto = in.readString();
    }

    public KoreanMovie() {

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(koreanmoviename);
        dest.writeString(koreanmoviedesc);
        dest.writeString(koreanmoviephoto);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<KoreanMovie> CREATOR = new Creator<KoreanMovie>() {
        @Override
        public KoreanMovie createFromParcel(Parcel in) {
            return new KoreanMovie(in);
        }

        @Override
        public KoreanMovie[] newArray(int size) {
            return new KoreanMovie[size];
        }
    };

    public String getKoreanmoviename() {
        return koreanmoviename;
    }

    public void setKoreanmoviename(String koreanmoviename) {
        this.koreanmoviename = koreanmoviename;
    }

    public String getKoreanmoviedesc() {
        return koreanmoviedesc;
    }

    public void setKoreanmoviedesc(String koreanmoviedesc) {
        this.koreanmoviedesc = koreanmoviedesc;
    }

    public String getKoreanmoviephoto() {
        return koreanmoviephoto;
    }

    public void setKoreanmoviephoto(String koreanmoviephoto) {
        this.koreanmoviephoto = koreanmoviephoto;
    }

    public void setName(String aDatum) {
    }

    public void setDesc(String aDatum) {
    }

    public void setPhoto(String aDatum) {
    }