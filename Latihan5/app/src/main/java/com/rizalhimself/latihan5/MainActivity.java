package com.rizalhimself.latihan5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fungsi ketika tombol di klik
                dialogDenganTombol(v);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fungsi ketika tombol2 diklik
                dialogDengan2Tombol(v);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fungsi ketika tombol3 diklik
                dialogDengan3Tombol(v);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fungsi ketika tombol4 diklik
                dialogTunggal(v);
            }
        });
    }

    public void dialogDenganTombol (View view){
        AlertDialog.Builder peringatan = new AlertDialog.Builder(this);
        peringatan.setIcon(R.mipmap.ic_launcher);
        peringatan.setTitle("Ini dari tombol 1");
        peringatan.setMessage("Assalamu 'alaikum ukhti");
        peringatan.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Ini fungsi ketika tombol OK ditekan
            }
        });

        AlertDialog pesan = peringatan.create();
        pesan.show();
    }

    public void dialogDengan2Tombol (View view){
        AlertDialog.Builder peringatan = new AlertDialog.Builder(this);
        peringatan.setIcon(R.mipmap.ic_launcher);
        peringatan.setTitle("Ini dari tombol 2");
        peringatan.setMessage("Assalamu 'alaikum ukhti");
        peringatan.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Ini fungsi ketika tombol Ya ditekan
            }
        });
        peringatan.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //ini fungsi ketika tombol Tidak ditekan
            }
        });

        AlertDialog pesan = peringatan.create();
        pesan.show();
    }

    public void dialogDengan3Tombol (View view){
        AlertDialog.Builder peringatan = new AlertDialog.Builder(this);
        peringatan.setIcon(R.mipmap.ic_launcher);
        peringatan.setTitle("Ini dari tombol 3");
        peringatan.setMessage("Assalamu 'alaikum ukhti");
        peringatan.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Ini fungsi ketika tombol Ya ditekan
            }
        });
        peringatan.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //ini fungsi ketika tombol Tidak ditekan
            }
        });
        peringatan.setNeutralButton("Coba Lagi", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //ini fungsi ketika tombol Coba Lagi ditekan
            }
        });

        AlertDialog pesan = peringatan.create();
        pesan.show();
    }
    public void dialogTunggal (View view){
        final String pilihan[]={"Merah","Kuning","Biru","Hijau","Hitam"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Silakan pilih warna yang anda sukai")
                .setIcon(R.mipmap.ic_launcher)
                .setItems(pilihan, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Warna yang anda sukai : "+ pilihan[which], Toast.LENGTH_SHORT).show();
                    }
                });
        builder.create().show();
    }

    ArrayList beberapaPilihan = new ArrayList();
    public void beberapaPilihan (View view){
        final String pilihan[]={"Tahu","Nasi Padang","Kopi","Rames"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Silakan pilih menu sarapan")
                .setIcon(R.mipmap.ic_launcher)
                .setMultiChoiceItems(pilihan, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        if (isChecked){
                            beberapaPilihan.add(which);
                    } else if (beberapaPilihan.contains(which)){
                            beberapaPilihan.remove(Integer.valueOf(which));
                        }
                }
    })
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        builder.create().show();

    }

}