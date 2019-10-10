package com.example.kabaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void perkalian(View view)
    {
        editAngka = findViewById(R.id.editText);
        String angka = editAngka.getText().toString();
        Intent operasi = new Intent(this, JenisSoal.class);
        operasi.putExtra("tipe","perkalian");
        operasi.putExtra("angka",angka);
        startActivity(operasi);
    }

    public void pembagian(View view)
    {
        editAngka = findViewById(R.id.editText);
        String angka = editAngka.getText().toString();
        Intent operasi= new Intent(this, JenisSoal.class);
        operasi.putExtra("tipe","pembagian");
        operasi.putExtra("angka",angka);
        startActivity(operasi);
    }
}
