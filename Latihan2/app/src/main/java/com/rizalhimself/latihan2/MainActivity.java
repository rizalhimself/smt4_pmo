package com.rizalhimself.latihan2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btPesan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btPesan2 = (Button) findViewById(R.id.btPesan2);
        btPesan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ini dari Tombol 2", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void tampilkanPesan(View view) {
        Toast.makeText(this, "Selamat Belajar Android", Toast.LENGTH_SHORT).show();
    }
}