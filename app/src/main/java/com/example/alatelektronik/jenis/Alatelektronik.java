package com.example.alatelektronik.jenis;

public class Alatelektronik {
    private String jenis;
    private String nama;
    private String asal;
    private String deskripsi;
    private int drawableRes;

    public Alatelektronik(String jenis, String nama, String asal, String deskripsi, int drawableRes) {
        this.jenis = jenis;
        this.nama = nama;
        this.asal = asal;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }
    public String getprofil() {
        return jenis;
    }

    public void setprofil(String profil) {
        this.jenis = jenis;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getalamat() {
        return asal;
    }

    public void setalamat(String alamat) {
        this.asal = asal;
    }

    public String gettgl_lahir() {
        return deskripsi;
    }

    public void settgl_lahir(String tgl_lahir) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
