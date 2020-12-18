package com.example.login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class viewpdf extends AppCompatActivity {
    private PDFView pdfView;
    private String nama_file;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpdf);

        if (getIntent() != null){
            nama_file = getIntent().getStringExtra("nama_file");
        }

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset(nama_file)
                .enableSwipe(true)
                .load();
    }
}