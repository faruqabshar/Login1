package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ActivityDaftarBuku extends AppCompatActivity {

    private RecyclerView rvBuku;
    private ArrayList<buku> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_buku);

        rvBuku = findViewById(R.id.rv_buku);
        rvBuku.setHasFixedSize(true);

        list.addAll(getListHeroes());
        showRecyclerList();
    }

    public ArrayList<buku> getListHeroes() {
        String[] dataName = getResources().getStringArray(R.array.data_name);
        String[] dataDescription = getResources().getStringArray(R.array.data_description);
        String[] dataPhoto = getResources().getStringArray(R.array.data_photo);
        ArrayList<buku> listbuku = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) {
            buku bukus = new buku();
            bukus.setName(dataName[i]);
            bukus.setDescription(dataDescription[i]);
            bukus.setPhoto(dataPhoto[i]);
            listbuku.add(bukus);
        }
        return listbuku;
    }

    private void showRecyclerList(){
        rvBuku.setLayoutManager(new LinearLayoutManager(this));
        bukuadapter listbukuadapter = new bukuadapter(list);
        rvBuku.setAdapter(listbukuadapter);
    }

    public void home(View view) {
        Intent home= new Intent(ActivityDaftarBuku.this, Home.class);
        startActivity(home);
    }

    public void tentang(View view) {
        Intent tentang= new Intent(ActivityDaftarBuku.this, Tentang.class);
        startActivity(tentang);
    }

    public void DaftarBuku(View view) {
        Intent DaftarBuku= new Intent(ActivityDaftarBuku.this, ActivityDaftarBuku.class);
        startActivity(DaftarBuku);
    }
}