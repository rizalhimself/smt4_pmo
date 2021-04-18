package com.rizalhimself.latihan6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public final static String EXTRA_MESSAGE = "";
    Button btnPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Ini adalah Activity 1", Toast.LENGTH_SHORT).show();
        btnPesan = findViewById(R.id.btnPesan);
        btnPesan.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menumain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menuTambahOrang) {
            Toast.makeText(getApplicationContext(), "Menu Tambah Dipanggil", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menuCari) {
            Toast.makeText(getApplicationContext(), "Menu Cari Dipanggil", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menuEdit) {
            Toast.makeText(getApplicationContext(), "Menu Edit Dipanggil", Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        EditText editText = (EditText) findViewById(R.id.txtPesan);
        String pesan = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, pesan);
        startActivity(intent);
    }
}