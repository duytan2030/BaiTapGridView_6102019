package com.example.gridview_6102019;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Browser;
import android.webkit.WebView;

public class Main2Activity extends Activity {
    WebView browser;
    String url="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         browser = (WebView)findViewById(R.id.webkit);
         browser.getSettings().setJavaScriptEnabled(true);
         Intent intent = getIntent();
         url = intent.getStringExtra("url");

         browser.loadUrl(url);

    }
}
