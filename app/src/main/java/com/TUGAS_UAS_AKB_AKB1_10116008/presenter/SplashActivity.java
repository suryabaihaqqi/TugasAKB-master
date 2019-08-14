package com.TUGAS_UAS_AKB_AKB1_10116008.presenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.TUGAS_UAS_AKB_AKB1_10116008.R;

public class SplashActivity extends AppCompatActivity {


    private TextView tv;
    private ImageView iv;
    private Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /**
         * NIM : 10116008
         * NAMA : Ahmad Surya Baihaqqi
         * KELAS : IF - 1 / AKB-1
         * TANGGAL PENGERJAAN : 10 Agustus 2019
         */

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tv = (TextView) findViewById(R.id.tv);
        iv = (ImageView) findViewById(R.id.iv);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.transisi);
        tv.startAnimation(myanim);
        iv.startAnimation(myanim);

        thread = new Thread() {
            public void run() {
                try {
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(SplashActivity.this, MainActivityLogin.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        thread.start();
    }

}
