package com.example.gridview_6102019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gr_web;
    ArrayList<TrangWeb> trangWebArr;
    gridAdapter trangWebAdapter;
    String url="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gr_web=(GridView) findViewById(R.id.gridview);
        trangWebArr = new ArrayList<TrangWeb>();

        trangWebArr.add(new TrangWeb("facebook","https://www.facebook.com",R.drawable.facebook));
        trangWebArr.add(new TrangWeb("gapo","https://www.gapo.vn/login",R.drawable.gapo));
        trangWebArr.add(new TrangWeb("garena","https://www.garena.vn/   ",R.drawable.garena));
        trangWebArr.add(new TrangWeb("genk","http://genk.vn/",R.drawable.genk));
        trangWebArr.add(new TrangWeb("github","https://github.com/huynhnghiavn",R.drawable.github));
        trangWebArr.add(new TrangWeb("instagram","https://www.instagram.com/",R.drawable.instagram));
        trangWebArr.add(new TrangWeb("zing mp3","https://mp3.zing.vn/",R.drawable.mp3));
        trangWebArr.add(new TrangWeb("reddit","https://www.reddit.com/",R.drawable.reddit));
        trangWebArr.add(new TrangWeb("twitter","https://twitter.com/",R.drawable.twitter));
        trangWebArr.add(new TrangWeb("vnexpress","https://vnexpress.net/",R.drawable.vnpress));
        trangWebArr.add(new TrangWeb("you tube","https://www.youtube.com/?gl=VN",R.drawable.youtube));
        trangWebArr.add(new TrangWeb("zalo","https://chat.zalo.me/?c=",R.drawable.zalo));

        trangWebAdapter =new gridAdapter(MainActivity.this,R.layout.custom_gridview,trangWebArr);
        gr_web.setAdapter(trangWebAdapter);

        gr_web.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TrangWeb tw =trangWebArr.get(i);
                String ten = tw.getUrl();
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Main2Activity.class);
                intent.putExtra("url",ten);
                startActivity(intent);
                //Toast.makeText(MainActivity.this,ten,Toast.LENGTH_LONG).show();
            }
        });



    }
}
