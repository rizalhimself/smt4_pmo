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
        String formattedText = "<h1>TextView HTML</h1> Ini adalah <i>sebuah</i> <b>percobaan</b>" +
                " <a href='http://rizalhimself.blogspot.com'>Website Saya</a>";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            view.setText(Html.fromHtml(formattedText, Html.FROM_HTML_MODE_LEGACY));
        } else {
            view.setText(Html.fromHtml(formattedText));
        }

        TextView tampilan2 = findViewById(R.id.tvCobaHTMLPanjang);
        String contohHTTPPanjang = getString(R.string.contohHttpPanjang);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tampilan2.setText(Html.fromHtml(contohHTTPPanjang, Html.FROM_HTML_MODE_LEGACY));
        } else {
            tampilan2.setText(Html.fromHtml(contohHTTPPanjang));
        }

    }
}