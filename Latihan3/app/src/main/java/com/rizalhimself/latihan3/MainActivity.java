package com.rizalhimself.latihan3;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView view = findViewById(R.id.tvCobaHTML);
        String formattedText = "Ini adalah <i>sebuah</i> <b>percobaan</b>" +
                " dari <a href='http://rizalhimself.blogspot.com'>Website Saya</a>";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            view.setText(Html.fromHtml(formattedText, Html.FROM_HTML_MODE_LEGACY));

        } else {
            view.setText(Html.fromHtml(formattedText));
        }

    }
}