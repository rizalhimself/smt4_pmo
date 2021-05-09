package com.rizalhimself.login_relative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String ExnTot = "total", ExnTugas = "tugas", ExnPresensi = "presensi", ExnUTS = "uts", ExnUAS = "uas",
    ExnHuruf = "huruf", ExMatkul = "matkul";
    Spinner sp_namamatkul;
    EditText etTugas, etPresensi, etUTS, etUAS;
    Button btClear, btProses;
    double nTot, nTugas, nPresensi,nUTS,nUAS;
    String nHuruf, selectedSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp_namamatkul = findViewById(R.id.sp_namamatkul);
        etTugas = findViewById(R.id.etTugas);
        etPresensi = findViewById(R.id.etPresensi);
        etUTS = findViewById(R.id.etUTS);
        etUAS = findViewById(R.id.etUAS);
        btClear = findViewById(R.id.btClear);
        btProses = findViewById(R.id.btProses);



        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearAllEditText(v);
            }
        });

        btProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungIsiNilai(v);
                tampilActivity2(v);
            }
        });

    }

    public void clearAllEditText (View view){
        etPresensi.setText("");
        etTugas.setText("");
        etUTS.setText("");
        etUAS.setText("");
    }

    public void hitungIsiNilai (View view) {
        selectedSpinner = sp_namamatkul.getSelectedItem().toString();
        nTugas = Double.parseDouble(etTugas.getText().toString());
        nPresensi = Double.parseDouble(etPresensi.getText().toString());
        nUTS = Double.parseDouble(etUTS.getText().toString());
        nUAS = Double.parseDouble(etUAS.getText().toString());
        nTot = ((nPresensi/100)*10)+((nTugas/100)*20)+((nUTS/100)*30)+((nUAS/100)*40);
        if (nTot >= 80) {
            nHuruf = "A";
        } else if (nTot >= 70 ) {
            nHuruf = "B";
        } else if (nTot >= 60 ) {
            nHuruf = "C";
        } else if (nTot >= 50 ) {
            nHuruf = "D";
        } else nHuruf = "D";
    }

    public void tampilActivity2 (View view) {
        Intent intent = new Intent(MainActivity.this, activity_dua.class);
        intent.putExtra("total", String.valueOf(nTot));
        intent.putExtra("presensi", String.valueOf(nPresensi));
        intent.putExtra("tugas", String.valueOf(nTugas));
        intent.putExtra("uas", String.valueOf(nUAS));
        intent.putExtra("uts", String.valueOf(nUTS));
        intent.putExtra("huruf", nHuruf);
        intent.putExtra("matkul", selectedSpinner);
        startActivity(intent);

    }
}