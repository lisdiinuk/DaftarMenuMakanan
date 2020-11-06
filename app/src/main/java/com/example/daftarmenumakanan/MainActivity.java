package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> FotoMakanan = new ArrayList<>();
    private ArrayList<String> NamaMakanan = new ArrayList<>();
    private ArrayList<String> InfoMakanan = new ArrayList<>();
    private ArrayList<String> HargaMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(FotoMakanan, NamaMakanan, InfoMakanan, HargaMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void getDataFromInternet(){
        NamaMakanan.add("Mangut Iwak Beong");
        FotoMakanan.add("https://akcdn.detik.net.id/community/media/visual/2019/07/22/fbd53d92-293f-47cf-9960-dc0700d88f77.jpeg?a=1");
        InfoMakanan.add("Mangut Iwak Beong jadi sajian paling populer yang ada di kawasan Borobudur. Makanan ini dibuat dari daging ikan Beong yang banyak dan mudah didapati di Kali Progo.");
        HargaMakanan.add("Harga : Rp 50.000");

        NamaMakanan.add("Nasi Grombyang");
        FotoMakanan.add("https://akcdn.detik.net.id/community/media/visual/2019/07/22/54f32f35-e106-4969-bf13-9c817bb45c5c.jpeg?a=1");
        InfoMakanan.add("Nasi grombyang merupakan makanan khas Pemalang yang enak. Penamaannya yang unik ini dikarenakan, penyajian kuahnya lebih banyak dibandingkan dengan isinya. Sehingga sajian ini terlihat grombyang-grombyang atau bergoyang.");
        HargaMakanan.add("Harga : Rp 30.000");

        NamaMakanan.add("Brekecek");
        FotoMakanan.add("https://akcdn.detik.net.id/community/media/visual/2019/07/22/7b2f4f74-c8ff-4553-8b98-d53c04a60d43.jpeg?a=1");
        InfoMakanan.add("Namanya terdengar aneh namun unik. 'Brekecek', makanan khas Kota Cilacap, Jawa Tengah. Nama brekecek berasal dari kata 'brek' yang artinya dijatuhkan atau diletakkan dan 'kecek' artinya dikecek-kecek bumbunya.");
        HargaMakanan.add("Harga : Rp 25.000");

        NamaMakanan.add("Mie Kocok Bandung");
        FotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Mie-kocok-bandung.jpg");
        InfoMakanan.add("Makanan pertama yang menjadi salah satu makanan khas dari negara ini adalah mie kocok bandung. Mie kocok merupakan makanan khas dari kota bandung yang memiliki rasa segar, gurih, dan juga nikmat. Salah satu mangkuk mie kocok anda akan menemukan beberapa bahan makanan seperti mie gepeng, sayur tauge, dan juga potongan kikil.");
        HargaMakanan.add("Harga : Rp 25.000");

        NamaMakanan.add("Gulai Ikan Patin");
        FotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/04/gulai-ikan-patin-jambi.jpg");
        InfoMakanan.add("da makanan khas daerah Jambi, dengan nama gulai iakan patin. Masakan yang satu ini sangat populer di tengah masyarakat Jambi dan sekitarnya. Dengan menggunakan daging buah durian yang telah difermentasi, gulai ikan akan dimasak hingga matang dengan rasa yang dijamin bikin ketagihan.");
        HargaMakanan.add("Harga : Rp 60.000");

        prosesRecyclerViewAdapter();
    }
}