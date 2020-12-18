package com.example.login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Lihatbuku1 extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihatbuku1);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Buku2.pdf")
                .enableSwipe(true)
                .load();
    }
}