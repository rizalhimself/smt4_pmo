package com.rizalhimself.login_relative;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activity_dua extends AppCompatActivity {
    TextView tvRincian, tvTot, tvHuruf;
    String nPresensi, nTugas, nUTS, nUAS, nTot, nHuruf, nMakul;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        tvRincian = findViewById(R.id.tvRincian);
        tvTot = findViewById(R.id.tvTot);
        tvHuruf = findViewById(R.id.tvHuruf);

        Intent intent = getIntent();
        nPresensi = intent.getStringExtra("presensi");
        nTugas = intent.getStringExtra("tugas");
        nUTS = intent.getStringExtra("uts");
        nUAS = intent.getStringExtra("uas");
        nTot = intent.getStringExtra("total");
        nHuruf = intent.getStringExtra("huruf");
        nMakul = intent.getStringExtra("matkul");
        


        tvRincian.setText("Nama Makul : "+ nMakul+
                " | Nilai Presensi : "+ nPresensi+
                " | Nilai Tugas : "+nTugas+
                " | Nilai UTS : "+nUTS+
                " | Nilai UAS : "+nUAS);
        tvTot.setText(nTot);
        tvHuruf.setText(nHuruf);

    }
}
