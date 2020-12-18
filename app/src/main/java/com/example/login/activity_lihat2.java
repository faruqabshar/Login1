package com.example.login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class activity_lihat2 extends AppCompatActivity {
    private PDFView pdfView;
//    private TypedArray file = getResources().obtainTypedArray(R.array.data_file);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat2);
        
        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Buku1.pdf")
                .enableSwipe(true)
                .load();
    }
}