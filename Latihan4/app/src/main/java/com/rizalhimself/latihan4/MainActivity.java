package com.rizalhimself.latihan4;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> mFoto = new ArrayList<>();
    ArrayList<String> mNama = new ArrayList<>();
    ArrayList<String> mAlamat = new ArrayList<>();
    ArrayList<String> mEmail = new ArrayList<>();
    RecyclerView recyclerView;
    Spinner spJmlKolom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFoto.add("https://subalpine-bits.000webhostapp.com/0620059003.jpg");
        mNama.add("Abdul Azis");
        mAlamat.add(" JL. RAYA KARANG SARI RT 03 02 KEC KEMBARAN KAB BANYUMAS ");
        mEmail.add(" adazis9@amikompurwokerto.com ");

        mFoto.add("https://subalpine-bits.000webhostapp.com/0615089001.jpg");
        mNama.add("Adam Prayogo Kuncoro");
        mAlamat.add("Purwokerto");
        mEmail.add(" adam@amikompurwokerto.ac.id ");

        mFoto.add("https://subalpine-bits.000webhostapp.com/AgusPram.JPG");
        mNama.add("Agus Pramono");
        mAlamat.add(" Rempoah RT 03 RW 02 Kecamatan Baturaden 53151 ");
        mEmail.add(" agus@amikompurwokerto.ac.id ");

        mFoto.add("https://subalpine-bits.000webhostapp.com/akto.jpg");
        mNama.add("Akto Hariawan");
        mAlamat.add(" Sokawera RT. 005 RW. 001 Sokawera Somagede Banyumas ");
        mEmail.add(" akto.85@gmail.com ");

        mFoto.add("https://subalpine-bits.000webhostapp.com/andi.jpg");
        mNama.add("Andi Dwi Riyanto");
        mAlamat.add(" Jl. Melati No 544 RT. 24 RW. 12 Pucung Kidul, Kroya, Cilacap ");
        mEmail.add(" andi@amikompurwokerto.ac.id ");

        mFoto.add("https://subalpine-bits.000webhostapp.com/andik.jpg");
        mNama.add("Andik Wijanarko");
        mAlamat.add(" Jl. Kauman Lama II, Kec Purwokerto Timur, Kab. BANYUMAS ");
        mEmail.add(" andikwijanarko@amikompurwokerto.ac.id ");

        mFoto.add("https://subalpine-bits.000webhostapp.com/argyan.jpg");
        mNama.add("Argiyan Dwi Pritama");
        mAlamat.add("Jl. Pramuka Raya, Karangklesem RT02/02 No.10, Purwokerto Selatan, purwokerto, banyumas, Jawatengan, Indonesia ");
        mEmail.add(" argiyandwi@amikompurwokerto.ac.id ");

        mFoto.add("https://subalpine-bits.000webhostapp.com/arif.jpg");
        mNama.add("Arief Adhy Kurniawan");
        mAlamat.add(" Jl. Anggrek No. 29 RT/RW 04-06 Grendeng, Purwokerto ");
        mEmail.add(" ariefadhykurniawan@gmail.com ");

        mFoto.add("https://subalpine-bits.000webhostapp.com/aulia.jpg");
        mNama.add("Aulia Hamdi");
        mAlamat.add(" Jl. Candrawijaya No.3, Dusun II, Beji, Kec. Baturraden, Kabupaten Banyumas, Jawa Tengah 53126 ");
        mEmail.add(" hamdi@amikompurwokerto.ac.id ");

        mFoto.add("https://subalpine-bits.000webhostapp.com/danar.jpg");
        mNama.add("Dhanar Intan Surya Saputra");
        mAlamat.add(" Ciberem, RT. 05/01, Kec. Sumbang, Kab. Banyumas ");
        mEmail.add(" dhanar.amikom@gmail.com ");

        recyclerView = (RecyclerView) findViewById(R.id.resDataDosen);
        ListDataDosenAdapter adapter = new ListDataDosenAdapter(this, mFoto, mNama, mAlamat, mEmail);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        spJmlKolom=(Spinner)findViewById(R.id.spJumlahKolom);
        spJmlKolom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getSelectedItem().toString().equalsIgnoreCase("1")) {
                    recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1));
                } else if (parent.getSelectedItem().toString().equalsIgnoreCase("2")) {
                    recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                } else if (parent.getSelectedItem().toString().equalsIgnoreCase("3")) {
                    recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        }
    }
}