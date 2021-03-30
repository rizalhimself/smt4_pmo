package com.rizalhimself.latihan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> mFoto = new ArrayList<>();
    ArrayList<String> mNama = new ArrayList<>();
    ArrayList<String> mAlamat = new ArrayList<>();
    ArrayList<String> mEmail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFoto.add("https://dosen.amikompurwokerto.ac.id/foto_dosen/0620059003.jpg");
        mNama.add("Abdul Azis");
        mAlamat.add(" JL. RAYA KARANG SARI RT 03 02 KEC KEMBARAN KAB BANYUMAS ");
        mEmail.add(" adazis9@amikompurwokerto.com ");

        mFoto.add("https://dosen.amikompurwokerto.ac.id/foto_dosen/0615089001.jpg");
        mNama.add("Adam Prayogo Kuncoro");
        mAlamat.add("Purwokerto");
        mEmail.add(" adam@amikompurwokerto.ac.id ");

        mFoto.add("https://dosen.amikompurwokerto.ac.id/foto_dosen/0608088007.JPG");
        mNama.add("Agus Pramono");
        mAlamat.add(" Rempoah RT 03 RW 02 Kecamatan Baturaden 53151 ");
        mEmail.add(" agus@amikompurwokerto.ac.id ");

        mFoto.add("https://dosen.amikompurwokerto.ac.id/foto_dosen/0617108501.jpg");
        mNama.add("Akto Hariawan");
        mAlamat.add(" Sokawera RT. 005 RW. 001 Sokawera Somagede Banyumas ");
        mEmail.add(" akto.85@gmail.com ");

        mFoto.add("https://dosen.amikompurwokerto.ac.id/foto_dosen/0620018601.jpg");
        mNama.add("Andi Dwi Riyanto");
        mAlamat.add(" Jl. Melati No 544 RT. 24 RW. 12 Pucung Kidul, Kroya, Cilacap ");
        mEmail.add(" andi@amikompurwokerto.ac.id ");

        mFoto.add("https://dosen.amikompurwokerto.ac.id/foto_dosen/0620058004.jpg");
        mNama.add("Andik Wijanarko");
        mAlamat.add(" Jl. Kauman Lama II, Kec Purwokerto Timur, Kab. BANYUMAS ");
        mEmail.add(" andikwijanarko@amikompurwokerto.ac.id ");

        mFoto.add("https://dosen.amikompurwokerto.ac.id/foto_dosen/0616019301.jpg");
        mNama.add("Argiyan Dwi Pritama");
        mAlamat.add("Jl. Pramuka Raya, Karangklesem RT02/02 No.10, Purwokerto Selatan, purwokerto, banyumas, Jawatengan, Indonesia ");
        mEmail.add(" argiyandwi@amikompurwokerto.ac.id ");

        mFoto.add("https://dosen.amikompurwokerto.ac.id/foto_dosen/0618107503.jpg");
        mNama.add("Arief Adhy Kurniawan");
        mAlamat.add(" Jl. Anggrek No. 29 RT/RW 04-06 Grendeng, Purwokerto ");
        mEmail.add(" ariefadhykurniawan@gmail.com ");

        mFoto.add("https://dosen.amikompurwokerto.ac.id/foto_dosen/0628128702.jpg");
        mNama.add("Aulia Hamdi");
        mAlamat.add(" Jl. Candrawijaya No.3, Dusun II, Beji, Kec. Baturraden, Kabupaten Banyumas, Jawa Tengah 53126 ");
        mEmail.add(" hamdi@amikompurwokerto.ac.id ");

        mFoto.add("https://dosen.amikompurwokerto.ac.id/foto_dosen/0618028602.jpg");
        mNama.add("Dhanar Intan Surya Saputra");
        mAlamat.add(" Ciberem, RT. 05/01, Kec. Sumbang, Kab. Banyumas ");
        mEmail.add(" dhanar.amikom@gmail.com ");

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.resDataDosen);
        

    }
}