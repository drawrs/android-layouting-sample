package com.khilman.www.layoutingandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    // TODO 1 : Deklarasi
    Button btnLinear;
    Button btnRelativeSatu;
    Button btnRelativeDua;
    Button btnScrollView;
    Button btnTableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 2: Inisilisasi widget
        btnLinear = (Button) findViewById(R.id.btnLinear);
        btnRelativeSatu = (Button) findViewById(R.id.btnRelativeSatu);
        btnRelativeDua = (Button) findViewById(R.id.btnRelativeDua);
        btnScrollView = (Button) findViewById(R.id.btnScrollView);
        btnTableLayout = (Button) findViewById(R.id.btnTableLayout);

        // TODO 3 : Beri Event
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO 3.1 : Aksi yang akan dilakukan ketiak btn di Klik
                // Mulai Activity Baru (LinearLayoutActivity)
                startActivity(new Intent(MainActivity.this, LinearLayoutActivity.class)); // kelas sekarang, kelas tujan
            }
        });

        // Event klik button Relative satu
        btnRelativeSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO 3.1 : Aksi yang akan dilakukan ketiak btn di Klik
                // Mulai Activity Baru (LinearLayoutActivity)
                startActivity(new Intent(MainActivity.this, RelativeLayoutActivity.class)); // kelas sekarang, kelas tujan
            }
        });

        // Event klik button Relative Dua
        btnRelativeDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO 3.1 : Aksi yang akan dilakukan ketiak btn di Klik
                // Mulai Activity Baru (LinearLayoutActivity)
                startActivity(new Intent(MainActivity.this, RelativeExampleActivity.class)); // kelas sekarang, kelas tujan
            }
        });
        // Event klik button Scroll view
        btnScrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO 3.1 : Aksi yang akan dilakukan ketiak btn di Klik
                // Mulai Activity Baru (LinearLayoutActivity)
                startActivity(new Intent(MainActivity.this, ScrollViewActivity.class)); // kelas sekarang, kelas tujan
            }
        });
        // Btn table layout
        btnTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO 3.1 : Aksi yang akan dilakukan ketiak btn di Klik
                // Mulai Activity Baru (LinearLayoutActivity)
                startActivity(new Intent(MainActivity.this, TableLayoutActivity.class)); // kelas sekarang, kelas tujan
            }
        });
    }
}
