package com.example.gridview_6102019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class gridAdapter extends ArrayAdapter<TrangWeb> {
    private Context context;
    private int layout;
    private ArrayList<TrangWeb> trangWebArr;

    public gridAdapter(@NonNull Context context, int resource, @NonNull ArrayList<TrangWeb> objects) {
        super(context, resource, objects);
        this.context=context;
        this.layout=resource;
        this.trangWebArr=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.custom_gridview,parent,false);

        TextView tv_ten = (TextView) convertView.findViewById(R.id.textview_ten);
        ImageView img_hinh = (ImageView) convertView.findViewById(R.id.image_hinh);

        TrangWeb trangWeb = trangWebArr.get(position);
        tv_ten.setText(trangWeb.getTen());
        img_hinh.setImageResource(trangWeb.getHinh());

        return convertView;
    }

}
