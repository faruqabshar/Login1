package com.example.login;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ActivityDaftarBuku extends AppCompatActivity {

    private bukuadapter adapter;
    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;
    private ArrayList<buku> buku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_buku);
        ListView listView = findViewById(R.id.lv_list);
        adapter = new bukuadapter(this);
        listView.setAdapter(adapter);



        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                for ( i = 0; i < dataName.length; i++) {
                    buku hero = new buku();
                    hero.setPhoto(dataPhoto.getResourceId(i, -1));
                    hero.setName(dataName[i]);
                    hero.setDescription(dataDescription[i]);
                    buku.add(hero);
                }
                adapter.setHeroes(buku);
                Intent intent= new Intent(ActivityDaftarBuku.this, Lihat1.class);
                intent.putExtra("dataName", dataName[i] );
                startActivity(intent);
            }



        });
    }
    private void prepare() {
        dataName = getResources().getStringArray(R.array.data_name);
        dataDescription = getResources().getStringArray(R.array.data_description);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
    }
        private void addItem() {
            buku = new ArrayList<>();

            for (int i = 0; i < dataName.length; i++) {
                buku hero = new buku();
                hero.setPhoto(dataPhoto.getResourceId(i, -1));
                hero.setName(dataName[i]);
                hero.setDescription(dataDescription[i]);
                buku.add(hero);
            }
            adapter.setHeroes(buku);
        }
    public void home(View view) {
        Intent home= new Intent(ActivityDaftarBuku.this, MainActivity.class);
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