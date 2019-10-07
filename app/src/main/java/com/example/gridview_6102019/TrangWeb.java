package com.example.gridview_6102019;

import java.net.URL;

public class TrangWeb {
    private String ten, url;
    private int hinh;


    public TrangWeb(String ten, String url, int hinh) {
        this.ten = ten;
        this.url = url;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
