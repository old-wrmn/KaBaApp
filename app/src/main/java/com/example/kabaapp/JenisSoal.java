package com.example.kabaapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class JenisSoal extends AppCompatActivity {

    TextView textangka;

    TextView texttipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_soal);

        Intent operasi= getIntent();
        String angka = operasi.getStringExtra("angka");
        textangka = findViewById(R.id.textView2);
        textangka.setText(angka);

        String tipe = operasi.getStringExtra("tipe");
        texttipe = findViewById(R.id.textView3);
        texttipe.setText(tipe);

    }
}
