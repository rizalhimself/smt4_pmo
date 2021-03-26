package com.rizalhimself.latihan3;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*TextView coba HTML*/
        TextView view = findViewById(R.id.tvCobaHTML);
        String formattedText = "<h1>TextView HTML</h1> Ini adalah <i>sebuah</i> <b>percobaan</b>" +
                " <a href='http://rizalhimself.blogspot.com'>Website Saya</a>";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            view.setText(Html.fromHtml(formattedText, Html.FROM_HTML_MODE_LEGACY));
        } else {
            view.setText(Html.fromHtml(formattedText));
        }

        /*TextView coba HTML Panjang*/
        TextView tampilan2 = findViewById(R.id.tvCobaHTMLPanjang);
        String contohHTTPPanjang = getString(R.string.contohHttpPanjang);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tampilan2.setText(Html.fromHtml(contohHTTPPanjang, Html.FROM_HTML_MODE_LEGACY));
        } else {
            tampilan2.setText(Html.fromHtml(contohHTTPPanjang));
        }

        /*TextView Ime Options Kirim*/
        EditText etKirimin = (EditText) findViewById(R.id.etKirim);
        etKirimin.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEND){
                    Toast.makeText(MainActivity.this,
                            "Proses Kirim", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

        /*TextView Ime Options Cari*/
        EditText etCariin = (EditText) findViewById(R.id.etCari);
        etCariin.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if (actionId == EditorInfo.IME_ACTION_SEARCH){
                    Toast.makeText(MainActivity.this, "Sedang Dicari Um", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

        /*TextView Suggestion*/
        AutoCompleteTextView textView = (AutoCompleteTextView)  findViewById(R.id.autoTV);
        String[] negara = {"  Indonesia","  Brunei","  Malaysia","  Laos","  Vietnam","  Timor Leste","  Myanmar"};
        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, negara);
        textView.setAdapter((adaptor));

        ImageButton iTScooter = findViewById(R.id.iTScooter);
        iTScooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Anda mengklik gambar Skuter", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void tampilkanPesan(View view) {
        Toast.makeText(this,"Anda mengklik tombol Pesan", Toast.LENGTH_SHORT).show();
    }

    public void tampilkanPesanSkuter(View view) {
        Toast.makeText(this,"Anda mengklik tombol Skuter", Toast.LENGTH_SHORT).show();
    }


    public void onClickJK(View view) {
        Boolean diklik = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.rdButton1:
                if (diklik)
                    Toast.makeText(this, "Aku wong lanang",Toast.LENGTH_SHORT).show();
                break;
            case R.id.rdButton2:
                if (diklik)
                    Toast.makeText(this,"Aku wong wedok", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}