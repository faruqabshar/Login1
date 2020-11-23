package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
    }

    public void home(View view) {
        Intent home= new Intent(Tentang.this, Home.class);
        startActivity(home);
    }

    public void tentang(View view) {
        Intent tentang= new Intent(Tentang.this, Tentang.class);
        startActivity(tentang);
    }

    public void DaftarBuku(View view) {
    }
}