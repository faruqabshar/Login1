package com.example.login;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ActivityDaftarBuku extends AppCompatActivity {

    private bukuadapter adapter;
    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;
    private ArrayList<buku> buku;
    private RelativeLayout relative1,relative2,relative3,relative4, relative5, relative6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_buku);

        relative1 = (RelativeLayout) findViewById(R.id.relative1);
        relative2 = (RelativeLayout) findViewById(R.id.relative2);
        relative3 = (RelativeLayout) findViewById(R.id.relative3);
        relative4 = (RelativeLayout) findViewById(R.id.relative4);
        relative5 = (RelativeLayout) findViewById(R.id.relative5);

        relative1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityDaftarBuku.this, viewpdf.class);
                intent.putExtra("nama_file", "Buku1.pdf");
                startActivity(intent);
            }
        });
        relative2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityDaftarBuku.this, viewpdf.class);
                intent.putExtra("nama_file", "Buku2.pdf");
                startActivity(intent);
            }
        });
        relative3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityDaftarBuku.this, viewpdf.class);
                intent.putExtra("nama_file", "Buku3.pdf");
                startActivity(intent);
            }
        });
        relative4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityDaftarBuku.this, viewpdf.class);
                intent.putExtra("nama_file", "Buku5.pdf");
                startActivity(intent);
            }
        });
        relative5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityDaftarBuku.this, viewpdf.class);
                intent.putExtra("nama_file", "Buku4.pdf");
                startActivity(intent);
            }
        });
//        ListView listView = findViewById(R.id.lv_list);
//        adapter = new bukuadapter(this);
//        listView.setAdapter(adapter);



//        prepare();
//        addItem();
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent= new Intent(ActivityDaftarBuku.this, activity_lihat2.class);
//                startActivity(intent);
//            }
//        });
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