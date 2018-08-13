package com.example.coder.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.coder.loginactivity.adapter.CustomListAdapter;

public class ListMakanan extends AppCompatActivity {

    //declarasi Variable
    ListView listmakanan;

    //membuat Array
    String nama_makanan[] = {"bakso","gado-gado","Gorengan","Gudeg","Opor-Ayam","Pempek",
            "Rawon","Rendang","Soto","Nasi Kuning","Otak-otak","Sate","Pecel Lele","Ketoprak"};

    String harga_makanan[] = {"Rp. 15.000","Rp. 10.000","Rp. 4.000","Rp. 30.000","Rp. 55.000","Rp. 30.000",
            "Rp. 20.000","Rp. 65.000","Rp. 18.000","Rp. 8.000","Rp. 7.000","Rp. 25.000","Rp. 15.000","Rp. 12.000"};

    int gambar_makanan[]={R.drawable.bakso,R.drawable.gadogado,R.drawable.gorengan,R.drawable.gudeg,
            R.drawable.oporyam,R.drawable.pempek,R.drawable.rawon,R.drawable.rendang,R.drawable.soto,R.drawable.nasikuning,
            R.drawable.otakotak,R.drawable.sate,R.drawable.pecellele,R.drawable.ketoprak};

    int detail_makanan[]={R.string.bakso,R.string.gadogado,R.string.gorengan,R.string.gudeg,
            R.string.oporyam,R.string.pempek,R.string.rawon,R.string.rendang,R.string.soto,R.string.nasikuning,
            R.string.otakotak,R.string.sate,R.string.pecellele,R.string.ketoprak};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_makanan);

        //inisialisasi
        listmakanan = (ListView)findViewById(R.id.listmakanan);

        CustomListAdapter adapter = new CustomListAdapter(this,nama_makanan,gambar_makanan,harga_makanan);

        //untuk mengisi data ke widget list view
        listmakanan.setAdapter((ListAdapter) adapter);

        //aksi atau event listener dari widget list view

        listmakanan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent kirimdata = new Intent(ListMakanan.this,DetailMakanan.class);
                kirimdata.putExtra("gbrM",gambar_makanan[i]);
                kirimdata.putExtra("namaM",nama_makanan[i]);
                kirimdata.putExtra("hargaM",harga_makanan[i]);
                kirimdata.putExtra("detailM",detail_makanan[i]);

                startActivity(kirimdata);
            }
        });

    }
}