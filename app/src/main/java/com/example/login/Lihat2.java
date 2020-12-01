package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class Lihat2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat1);
    }

    public void baca(View view) {
        Intent baca= new Intent(Lihat2.this, activity_lihat2.class);
        startActivity(baca);
    }
}
