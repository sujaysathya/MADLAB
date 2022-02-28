package com.example.final_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myweb = findViewById(R.id.weber);
        myweb.setWebViewClient(new WebViewClient());
        myweb.loadUrl("file:///android_asset/test.html");
        Spinner myspin = (Spinner) findViewById(R.id.spinner1);

        String[] items = new String[]{"item1","item2","item3"};

        ArrayAdapter<String> myadap = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,items);
        myspin.setAdapter(myadap);

        myspin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String val = myspin.getSelectedItem().toString();
                if(val.equals("item2"))
                {
                    myweb.loadUrl("file:///android_asset/test2.html");
                }
                if(val.equals("item1"))
                {
                    myweb.loadUrl("file:///android_asset/test.html");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}