package com.rizalhimself.latihan1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btPesanDua, btTampilkanNama, btTambah, btKurang, btBagi, btKali;
    EditText etNama, etBil1, etBil2, etHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btPesanDua = findViewById(R.id.btPesanDua);
        btPesanDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ini dari tombol Pesan Dua", Toast.LENGTH_SHORT).show();
            }
        });

        etNama = findViewById(R.id.etNama);
        btTampilkanNama = findViewById(R.id.btTampilkanNama);
        btTampilkanNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, etNama.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        etBil1 = findViewById(R.id.etbil1);
        etBil2 = findViewById(R.id.etbil2);
        etHasil = findViewById(R.id.etHasil);

        btTambah = findViewById(R.id.btTambah);
        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vbil1 = Double.valueOf(etBil1.getText().toString());
                double vbil2 = Double.valueOf(etBil2.getText().toString());
                double vhasil = vbil1 + vbil2;
                etHasil.setText(String.valueOf(vhasil));
            }
        });
        btKurang = findViewById(R.id.btKurang);
        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vbil1 = Double.valueOf(etBil1.getText().toString());
                double vbil2 = Double.valueOf(etBil2.getText().toString());
                double vhasil = vbil1 - vbil2;
                etHasil.setText(String.valueOf(vhasil));
            }
        });
        btBagi = findViewById(R.id.btBagi);
        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vbil1 = Double.valueOf(etBil1.getText().toString());
                double vbil2 = Double.valueOf(etBil2.getText().toString());
                double vhasil = vbil1 / vbil2;
                etHasil.setText(String.valueOf(vhasil));
            }
        });
        btKali = findViewById(R.id.btKali);
        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vbil1 = Double.valueOf(etBil1.getText().toString());
                double vbil2 = Double.valueOf(etBil2.getText().toString());
                double vhasil = vbil1 * vbil2;
                etHasil.setText(String.valueOf(vhasil));
            }
        });
    }

    public void tampilkanPesan(View view) {
        Toast.makeText(this, "Selamat Belajar Android", Toast.LENGTH_LONG).show();
    }
}