package com.example.alatelektronik;

import android.content.Context;

import com.example.alatelektronik.jenis.Alatelektronik;
import com.example.alatelektronik.jenis.Kulkas;
import com.example.alatelektronik.jenis.Laptop;
import com.example.alatelektronik.jenis.Setrika;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Alatelektronik> Alatelektroniks = new ArrayList<>();

    private static List<Kulkas> initDataKulkas(Context ctx) {
        List<Kulkas> kulkas = new ArrayList<>();
        kulkas.add(new Kulkas("Kulkas Sharp", "Osaka",
                "Kulkas Sharp dilengkapi dengan fitur Plasmacluster Ion yang dapat membasmi kuman dan bakteri secara aktif", R.drawable.kulkas_sharp));
        kulkas.add(new Kulkas("Kulkas Aqua", "Kumagaya",
                "Kulkas Aqua memiliki kompartemen terpisah untuk makanan basah dan kering sehingga tidak cepat busuk dan tidak bau", R.drawable.kulkas_aqua));
        kulkas.add(new Kulkas("Kulkas LG", "Korea Selatan",
                "Kulkas LG hadir dengan teknologi terbaru yang dapat menjaga kandungan vitamin serta kesegaran dari buah dan sayuran", R.drawable.kulkas_lg));
        kulkas.add(new Kulkas("Kulkas Samsung", "Jepang",
                "kulkas Samsung juga hadir dalam berbagai pilihan warna yang bisa dipilih sesuai dengan tema ataupun tone dapur, sehingga dapat mempercantik tampilan dapur", R.drawable.kulkas_samsung));
        kulkas.add(new Kulkas("Kulkas Toshiba", "Jepang",
                "Kulkas Toshiba dirancang dengan menggunakan bahan non-CFC yang dapat menjamin kualitas makanan yang tersimpan di dalam kulkas serta mempunyai kemampuan khusus untuk mengindari makanan dari bau yang tidak sedap", R.drawable.kulas_toshiba));
        return kulkas;
    }

    private static List<Laptop> initDataLaptop(Context ctx) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell XPS 13", "Texas, Amerika Serikat",
                "Dell XPS 13 hadir dengan design bezel tipis dengan ketebalan 5,2 mm dan dilengkapi spesifikasi yang tinggi", R.drawable.laptop_dellxps13));
        laptops.add(new Laptop("Lenovo Yoga", "Indonesia",
                " Lenovo Yoga hadir dengan pilihan RAM 8 GB atau 16 GB dan processor Intel Core i7 yang membuat pergerakan laptop ini akan sangat cepat untuk kegiatan multitasking ", R.drawable.laptop_lenovoyoga920));
        laptops.add(new Laptop("HP Spectre X360", "Amerika Serikat",
                "HP Spectre X360 memiliki layar full HD / 4K touch screen yang fleksibel hingga 360 derajat yang dibekali hardware dengan spesifikasi tinggi.", R.drawable.laptop_hpspectrex360));
        laptops.add(new Laptop("Asus ZenBook UX310UQ", "Taiwan",
                "Asus ZenBook UX310UQ adalah pilihan laptop terbaik di 2018 selanjutnya yang menyematkan processor Intel Core i7 6500U dan RAM 8 GB DDR4 yang menghasilkan performa maksimal. ", R.drawable.laptop_asuszenbookux310));
        laptops.add(new Laptop("Apple Macbook Pro MLW82", " Cupertino, California ",
                "Apple Macbook Pro MLW82 merupakan salah satu produk laptop unggulan produksi Apple yang telah disemati berbagai spesifikasi dan fitur baru salah satunya adalah Touch Bar.", R.drawable.laptop_applemacbookpro));
        return laptops;
    }


    private static List<Setrika> initDataSetrika(Context ctx) {
        List<Setrika> setrikas = new ArrayList<>();
        setrikas.add(new Setrika("Strika Philips", "Eindhoven, Belanda",
                "Philips punya kualitas produk setrika watt kecil yang tahan lama.", R.drawable.setrika_philips));
        setrikas.add(new Setrika("Setrika Panasonic", "Indonesia",
                "Model yang dikeluarkannya yaitu, setrika uap, dan setrika listrik", R.drawable.setrika_panasonic));
        setrikas.add(new Setrika("Setrika Maspion", "Sidoarjo",
                "Namun walaupun produk dalam negeri jangan remehkan kualitasnya yang memang sudah terjamin.", R.drawable.setrika_maspion));
        setrikas.add(new Setrika("Setrika Oxone", "Jepang",
                "Oxone adalah salah satu merk dagang yang memang khusus diciptakan untuk memenuhi kebutuhan rumah tangga.", R.drawable.setrika_oxsone));
        setrikas.add(new Setrika("Setrika Miyako", "Jepang",
                "Miyako adalah salah satu merk setrika listrik yang paling direkomendasikan.", R.drawable.setrika_miyako));
        return setrikas;
    }

    private static void initAllAlatelektroniks(Context ctx) {
        Alatelektroniks.addAll(initDataKulkas(ctx));
        Alatelektroniks.addAll(initDataLaptop(ctx));
        Alatelektroniks.addAll(initDataSetrika(ctx));
    }

    public static List<Alatelektronik> getAllPahlawan(Context ctx) {
        if (Alatelektroniks.size() == 0) {
            initAllAlatelektroniks(ctx);
        }
        return  Alatelektroniks;
    }

    public static List<Alatelektronik> getAlatelektroniksByTipe(Context ctx, String jenis) {
        List<Alatelektronik> AlatelektroniksByType = new ArrayList<>();
        if (Alatelektroniks.size() == 0) {
            initAllAlatelektroniks(ctx);
        }
        for (Alatelektronik h : Alatelektroniks) {
            if (h.getprofil().equals(jenis)) {
                AlatelektroniksByType.add(h);
            }
        }
        return AlatelektroniksByType;
    }
}
