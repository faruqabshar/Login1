package com.example.login;

import android.os.Parcel;
import android.os.Parcelable;

public class buku implements Parcelable{
    private String name;
    private String description;
    private String photo;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.photo);
    }
    buku() {
    }
    private buku(Parcel in) {
        this.name = in.readString();
        this.description = in.readString();
        this.photo = in.readString();
    }
    public static final Parcelable.Creator<buku> CREATOR = new Parcelable.Creator<buku>() {
        @Override
        public buku createFromParcel(Parcel source) {
            return new buku(source);
        }
        @Override
        public buku[] newArray(int size) {
            return new buku[size];
        }
    };
}
