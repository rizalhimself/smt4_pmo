package com.rizalhimself.latihan6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Ini adalah Activity 2", Toast.LENGTH_SHORT).show();

        //Ambil pesan dari intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Buat TextView
        TextView tvMainActivity2 = new TextView(this);
        tvMainActivity2.setTextSize(40);
        tvMainActivity2.setText(message);
        tvMainActivity2.setPadding(30,8,30,20);

        //Jadikan TextView sebagai main activity layout
        setContentView(tvMainActivity2);
    }
}