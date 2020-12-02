package com.example.alatelektronik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKulkas,btnLaptop,btnSetrika;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }
    private void inisialisasiView() {
        btnKulkas = findViewById(R.id.btn_buka_profil_Kulkas);
        btnLaptop= findViewById(R.id.btn_buka_profil_Laptop);
        btnSetrika = findViewById(R.id.btn_buka_profil_Setrika);
        btnKulkas.setOnClickListener(view -> bukaGaleri("Kulkas"));
        btnLaptop.setOnClickListener(view -> bukaGaleri("Laptop"));
        btnSetrika.setOnClickListener(view -> bukaGaleri("Setrika"));
    }

    private void bukaGaleri(String JenisAlatelektronik) {
        Log.d("MAIN","Buka activity pahlawan_ampera");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, JenisAlatelektronik);
        startActivity(intent);
    }
}