package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    //TextView txt_profile_name;
    Button btn_logout;

    SharedPreferences sharedpreferences;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //txt_profile_name = (TextView) findViewById(R.id.txt_profile_name);
        //txt_profile_name.setText(getIntent().getExtras().get("name").toString());

        btn_logout = (Button) findViewById(R.id.btn_logout);
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });

    }

    private void logout() {
        sharedpreferences = getSharedPreferences(
                LoginActivity.my_shared_preferences, Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putBoolean(LoginActivity.session_status, false);
        editor.putString(LoginActivity.TAG_ID, null);
        editor.putString(LoginActivity.TAG_EMAIL, null);
        editor.putString(LoginActivity.TAG_NAME, null);
        editor.putString(LoginActivity.TAG_PHONE, null);
        editor.commit();

        intent = new Intent(Home.this, LoginActivity.class);
        finish();
        startActivity(intent);


    }

    public void home(View view) {
        Intent home= new Intent(Home.this, MainActivity.class);
        startActivity(home);
    }

    public void tentang(View view) {
        Intent tentang= new Intent(Home.this, Tentang.class);
        startActivity(tentang);
    }

    public void DaftarBuku(View view) {
        Intent DaftarBuku= new Intent(Home.this, ActivityDaftarBuku.class);
        startActivity(DaftarBuku);
    }
}