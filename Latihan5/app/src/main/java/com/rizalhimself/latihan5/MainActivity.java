package com.rizalhimself.latihan5;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7;

    ArrayList beberapaPilihan = new ArrayList();
    ProgressDialog progressDialog;
    private int progressBarStatus = 0;
    private final Handler progressBarHandler = new Handler();
    private long fileSize = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);


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
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fungsi ketika tombol5 diklik
                beberapaPilihan(v);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fungsi ketika tombol6 diklik
                dialogDenganLayoutKhusus(v);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fungsi ketika tombol7 diklik
                progressBarStart(v);
            }
        });
    }

    public void dialogDenganTombol(View view) {
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

    public void dialogDengan2Tombol(View view) {
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

    public void dialogDengan3Tombol(View view) {
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

    public void dialogTunggal(View view) {
        final String[] pilihan = {"Merah", "Kuning", "Biru", "Hijau", "Hitam"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Silakan pilih warna yang anda sukai")
                .setIcon(R.mipmap.ic_launcher)
                .setItems(pilihan, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Warna yang anda sukai : " + pilihan[which], Toast.LENGTH_SHORT).show();
                    }
                });
        builder.create().show();
    }

    public void beberapaPilihan(View view) {
        final String[] pilihan = {"Tahu", "Nasi Padang", "Kopi", "Rames"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Silakan pilih menu sarapan")
                .setIcon(R.mipmap.ic_launcher)
                .setMultiChoiceItems(pilihan, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        if (isChecked) {
                            beberapaPilihan.add(which);
                        } else if (beberapaPilihan.contains(which)) {
                            beberapaPilihan.remove(Integer.valueOf(which));
                        }
                    }
                })
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Sarapan yang anda pilih adalah : " + beberapaPilihan.toString(), Toast.LENGTH_SHORT).show();
                    }
                });
        builder.create().show();

    }

    public void dialogDenganLayoutKhusus(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.layout_masuk, null));
        builder.setPositiveButton("Masuk", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                setContentView(R.layout.activity_main);
                tampilNotif();
            }
        });
        builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Oke Terimakasih !", Toast.LENGTH_SHORT).show();
                keluar();
            }
        });
        builder.create().show();
    }

    private void tampilNotif() {
        String NOTIFICATION_CHANNEL_ID = "latihanNotif";
        Context context = this.getApplicationContext();
        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            String channelName = "Android Notif Channel";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel mChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, channelName, importance);
            manager.createNotificationChannel(mChannel);
        }

        Intent mIntent = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("fromnotif", "notif");
        mIntent.putExtras(bundle);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, mIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID);
        builder.setContentIntent(pendingIntent)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setLargeIcon(BitmapFactory.decodeResource(this.getResources(), R.drawable.ic_launcher_background))
                .setTicker("notif starting")
                .setAutoCancel(true)
                .setVibrate(new long[]{1000, 1000, 1000, 1000, 1000})
                .setLights(Color.RED, 3000, 3000)
                .setDefaults(Notification.DEFAULT_SOUND)
                .setContentTitle("Hai, Terimakasih telah mencoba program saya !")
                .setContentText("Ketuk notifikasi ini dulu sebelum coba yang lain :)");
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.notify(115, builder.build());

    }

    public void keluar() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void progressBarStart(View view) {
        progressDialog = new ProgressDialog(view.getContext());
        progressDialog.setCancelable(true);
        progressDialog.setMessage("Sedang melakukan Operasi ...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setProgress(0);
        progressDialog.setMax(100);
        progressDialog.show();
        progressBarStatus = 0;
        fileSize = 0;

        new Thread(new Runnable() {
            public void run() {
                while (progressBarStatus < 100) {
                    //Operasi ProgressBar
                    progressBarStatus = doOperation();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //Mengupdate ProgressBar
                    progressBarHandler.post(new Runnable() {
                        public void run() {
                            progressDialog.setProgress(progressBarStatus);
                        }
                    });
                }
                //Operasi ketika sudah finish
                if (progressBarStatus >= 100) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //tutup dialog progressBar
                    progressDialog.dismiss();
                }
            }
        }).start();
    }


    //Presentasi delay dari proses pada progressBar
    public int doOperation() {
        while (fileSize <= 10000) {
            fileSize++;
            if (fileSize == 1000) {
                return 10;
            } else if (fileSize == 2000) {
                return 20;
            } else if (fileSize == 3000) {
                return 30;
            } else if (fileSize == 4000) {
                return 40;
            } else if (fileSize == 5000) {
                return 50;
            }
        }
        return 100;
    }

}






