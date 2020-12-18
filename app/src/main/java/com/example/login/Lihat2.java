package com.example.login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;


public class Lihat2 extends AppCompatActivity{

    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat1);

        pdfView.fromAsset("Buku1.pdf")
                .enableSwipe(true)
                .load();
    }
}
