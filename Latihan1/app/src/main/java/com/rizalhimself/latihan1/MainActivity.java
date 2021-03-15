package com.rizalhimself.latihan1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    /*Deklarasi Variabel-variabel yang digunakan pada subclass On Create*/
    Button btPesanDua, btTampilkanNama, btTambah, btKurang, btBagi, btKali;
    EditText etNama, etBil1, etBil2, etHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Tombol Pesan Dua*/
        btPesanDua = findViewById(R.id.btPesanDua);
        btPesanDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ini dari tombol Pesan Dua", Toast.LENGTH_SHORT).show();
            }
        });

        /*Tombol Tampilkan Nama*/
        etNama = findViewById(R.id.etNama);
        btTampilkanNama = findViewById(R.id.btTampilkanNama);
        btTampilkanNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, etNama.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        /*Operasi Bilangan*/
        etBil1 = findViewById(R.id.etbil1);
        etBil2 = findViewById(R.id.etbil2);
        etHasil = findViewById(R.id.etHasil);

        btTambah = findViewById(R.id.btTambah);                             //Tombol Tambah
        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusIsian() == true) {
                    double vbil1 = Double.valueOf(etBil1.getText().toString());
                    double vbil2 = Double.valueOf(etBil2.getText().toString());
                    double vhasil = vbil1 + vbil2;
                    etHasil.setText(String.valueOf(vhasil));
                }
            }
        });
        btKurang = findViewById(R.id.btKurang);                             //Tombol Kurang
        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusIsian() == true) {
                    double vbil1 = Double.valueOf(etBil1.getText().toString());
                    double vbil2 = Double.valueOf(etBil2.getText().toString());
                    double vhasil = vbil1 - vbil2;
                    etHasil.setText(String.valueOf(vhasil));
                }
            }
        });
        btBagi = findViewById(R.id.btBagi);                                 //Tombol Bagi
        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusIsian() == true) {
                    double vbil1 = Double.valueOf(etBil1.getText().toString());
                    double vbil2 = Double.valueOf(etBil2.getText().toString());
                    double vhasil = vbil1 / vbil2;
                    etHasil.setText(String.valueOf(vhasil));
                }
            }
        });
        btKali = findViewById(R.id.btKali);                                 //Tombol Kali
        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (statusIsian() == true) {
                    double vbil1 = Double.valueOf(etBil1.getText().toString());
                    double vbil2 = Double.valueOf(etBil2.getText().toString());
                    double vhasil = vbil1 * vbil2;
                    etHasil.setText(String.valueOf(vhasil));
                }
            }
        });
    }

    /*Tombol Pesan*/
    public void tampilkanPesan(View view) {
        Toast.makeText(this, "Selamat Belajar Android", Toast.LENGTH_LONG).show();
    }

    /*Method Status Isian*/
    boolean statusIsian() {
        boolean vStatus = true;
        if (etBil1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Harap isi bilangan 1", Toast.LENGTH_SHORT).show();
            etBil1.requestFocus();
            vStatus = false;
        } else if (etBil2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Harap isi bilangan 2", Toast.LENGTH_SHORT).show();
            etBil2.requestFocus();
            vStatus = false;
        }
        return vStatus;
    }
}