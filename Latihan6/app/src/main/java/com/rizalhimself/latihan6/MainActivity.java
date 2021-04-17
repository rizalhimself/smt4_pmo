package com.rizalhimself.latihan6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {
    public final static String EXTRA_MESSAGE = "";
    Button btnPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPesan = findViewById(R.id.btnPesan);
        btnPesan.setOnClickListener(this);
        };

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        EditText editText = (EditText) findViewById(R.id.txtPesan);
        String pesan = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, pesan);
        startActivity(intent);
    }
}