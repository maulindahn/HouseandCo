package com.example.hana.rentcostumes;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by user pc on 27/10/2016.
 */

public class LoadingScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //SETELAH 3 DETIK, MAKA AKAN KITA ARAHKAN KE HALAMAN UTAMA
                Intent a = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(a);
                finish();
            }
        }, 3000L);
    }
}
