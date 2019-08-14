package com.TUGAS_UAS_AKB_AKB1_10116008.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.TUGAS_UAS_AKB_AKB1_10116008.R;


public class SlideAdapter extends PagerAdapter {

    /**
     * NIM : 10116008
     * NAMA : Ahmad Surya Baihaqqi
     * KELAS : IF - 1 / AKB-1
     * TANGGAL PENGERJAAN : 17 MEI 2019
     */


    Context context;
    LayoutInflater inflater;

    public SlideAdapter(Context context) {
        this.context = context;
    }

    // berikut adalah list gambar
    public int[] lst_images = {
            R.drawable.logolauncher,
            R.drawable.contact11,
            R.drawable.list,

    };
    // berikut adalah list untuk title
    public String[] lst_title = {
            "eBuddy Friend",
            "Contact",
            "List Friend",
    };
    // berikut adalah list untuk deskripsi
    public String[] lst_deskripsi = {
            "Sebuah Aplikasi untuk menampilkan berbagai " +
                    "tampilan seperti Profil, Kontak, List Friend, dll",
            "Dapat menampilkan semua Kontak Friend ",
            "Bagian ini kalian akan melihat list-list teman kalian ",
    };

    // berikut adalah list untuk warna background
    public int[] lst_background = {
            Color.rgb(174, 214, 241),
            Color.rgb(174, 214, 241),
            Color.rgb(174, 214, 241),
    };

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = ( LayoutInflater ) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutsilde = view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView) view.findViewById(R.id.slideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView)view.findViewById(R.id.deskripsi);
        layoutsilde.setBackgroundColor(lst_background[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_deskripsi[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position,  Object object) {
        container.removeView((LinearLayout)object);
    }
}
