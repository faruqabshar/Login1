package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lihat1 extends AppCompatActivity {
    TextView lihat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat1);

        lihat = (TextView) findViewById(R.id.textView14);
    }

    public void baca(View view) {
        Intent baca= new Intent(Lihat1.this, Lihatbuku1.class);
        startActivity(baca);
    }
}