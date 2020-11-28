package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityDaftarBuku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_buku);
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