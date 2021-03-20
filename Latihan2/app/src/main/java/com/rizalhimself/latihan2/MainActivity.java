package com.rizalhimself.latihan2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    /*Deklarasi Variabel-variabel yang digunakan pada subclass On Create*/
    Button btPesanDua, btTampilkanNama, btTambah, btKurang, btBagi, btKali, btWhile, btDoWhile, btFor;
    EditText etNama, etBil1, etBil2, etHasil;
    TextView tvBilangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Tombol Pesan Dua*/
        btPesanDua = findViewById(R.id.btPesan2);
        btPesanDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ini dari tombol Pesan Dua", Toast.LENGTH_SHORT).show();
            }
        });

        /*Tombol Tampilkan Nama*/
        etNama = findViewById(R.id.etPesan1);
        btTampilkanNama = findViewById(R.id.btTampilkanNama);
        btTampilkanNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, etNama.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        /*Operasi Bilangan*/
        etBil1 = findViewById(R.id.etBil1);
        etBil2 = findViewById(R.id.etBil2);
        etHasil = findViewById(R.id.etHasil);

        btTambah = findViewById(R.id.btTambah);                             //Tombol Tambah
        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Tambah");                         //Implementasi method proses operasi Bilangan Tambah
            }
        });
        btKurang = findViewById(R.id.btKurang);                             //Tombol Kurang
        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Kurang");                         //Implementasi method proses operasi Bilangan Kurang
            }
        });
        btBagi = findViewById(R.id.btBagi);                                 //Tombol Bagi
        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Bagi");                           //Implementasi method proses operasi Bilangan Bagi
            }
        });
        btKali = findViewById(R.id.btKali);                                 //Tombol Kali
        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesMatematika("Kali");                           //Implementasi method proses operasi Bilangan Kali
            }
        });

        /*Operasi Perulangan*/
        tvBilangan = findViewById(R.id.tvBilangan);

        /*Perulangan While*/
        btWhile = findViewById(R.id.btWhile);
        btWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bil = 2;
                tvBilangan.setText("");
                while (bil <= 20) {
                    tvBilangan.setText(tvBilangan.getText().toString() + bil + ",");
                    bil += 2;
                }
            }
        });

        /*Perulangan DoWhile*/
        btDoWhile = findViewById(R.id.btDoWhile);
        btDoWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bil = 1;
                tvBilangan.setText("");
                do {
                    tvBilangan.setText(tvBilangan.getText().toString() + bil + ",");
                    bil += 2;
                } while (bil <= 20);
            }
        });

        /*Perulangan For*/
        btFor = findViewById(R.id.btFor);
        btFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvBilangan.setText("");
                for (int bil = 1; bil <= 10; bil++)
                    tvBilangan.setText(tvBilangan.getText().toString() + bil + ",");
            }
        });
    }

    /*Tombol Pesan*/
    public void tampilkanPesan(View view) {
        Toast.makeText(this, "Selamat Belajar Android", Toast.LENGTH_LONG).show();
    }

    /*Method Proses Operasi Bilangan Matematika*/
    void prosesMatematika(String jenisProses) {
        if (statusIsian() == true) {
            prosesHitung2 prosesHitung2 = new prosesHitung2(Double.valueOf(etBil1.getText().toString()), Double.valueOf(etBil2.getText().toString()));
            if (jenisProses.equalsIgnoreCase("Tambah")) {
                etHasil.setText(String.valueOf(prosesHitung2.getTambah()));
            } else if (jenisProses.equalsIgnoreCase("Kurang")) {
                etHasil.setText(String.valueOf(prosesHitung2.getKurang()));
            } else if (jenisProses.equalsIgnoreCase("Bagi")) {
                etHasil.setText(String.valueOf(prosesHitung2.getBagi()));
            } else if (jenisProses.equalsIgnoreCase("Kali")) {
                etHasil.setText(String.valueOf(prosesHitung2.getKali()));
            }

        }
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