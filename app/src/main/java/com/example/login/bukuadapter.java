package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class bukuadapter extends BaseAdapter {

    private Context context;
    private ArrayList<buku> bukus = new ArrayList<>();

    //setter hasil generate
    public void setHeroes(ArrayList<buku> heroes) {
        this.bukus = heroes;
    }

    //constructor hasil generate
    public bukuadapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return bukus.size();
    }

    @Override
    public Object getItem(int i) {
        return bukus.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemView = view;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_buku, viewGroup, false);
        }
        ViewHolder viewHolder = new ViewHolder(itemView);
        buku Buku = (buku) getItem(i);
        viewHolder.bind(Buku);
        return itemView;
    }

    private class ViewHolder {
        private TextView txtName;
        private TextView txtDescription;
        private ImageView imgPhoto;

        ViewHolder(View view) {
            txtName = view.findViewById(R.id.txt_name);
            txtDescription = view.findViewById(R.id.txt_description);
            imgPhoto = view.findViewById(R.id.img_photo);
        }

        void bind(buku Buku) {
            txtName.setText(Buku.getName());
            txtDescription.setText(Buku.getDescription());
            imgPhoto.setImageResource(Buku.getPhoto());
        }
    }
}