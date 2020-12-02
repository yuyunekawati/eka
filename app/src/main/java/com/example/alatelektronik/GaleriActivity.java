package com.example.alatelektronik;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alatelektronik.jenis.Alatelektronik;

import java.util.List;

public class GaleriActivity extends AppCompatActivity {

    List<Alatelektronik> alatelektroniks;
    int indeksTampil = 0;
    String JenisAlatelektronik;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txNama,txAsal,txDeskripsi,txJudul;
    ImageView ivFotoAlatelektronik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_alatelektronik);
        Intent intent = getIntent();
        JenisAlatelektronik = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        alatelektroniks = DataProvider.getAlatelektroniksByTipe(this,JenisAlatelektronik);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> alatelektronikPertama());
        btnTerakhir.setOnClickListener(view -> alatelektronikTerakhir());
        btnSebelumnya.setOnClickListener(view -> alatelektronikSebelumnya());
        btnBerikutnya.setOnClickListener(view -> alatelektronikBerikutnya());

        txNama = findViewById(R.id.txNama);
        txAsal= findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoAlatelektronik = findViewById(R.id.gambarAlatelektronik);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Beberapa Nama Alat Elektronik "+JenisAlatelektronik);
    }


    private void tampilkanProfil() {
        Alatelektronik k = alatelektroniks.get(indeksTampil);
        Log.d("KULKAS","Menampilkan kulkas"+k.getnama());
        txNama.setText(k.getnama());
        txAsal.setText(k.getalamat());
        txDeskripsi.setText(k.gettgl_lahir());
        ivFotoAlatelektronik.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void alatelektronikPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void alatelektronikTerakhir() {
        int posAkhir = alatelektroniks.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void alatelektronikBerikutnya() {
        if (indeksTampil == alatelektroniks.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void alatelektronikSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}
