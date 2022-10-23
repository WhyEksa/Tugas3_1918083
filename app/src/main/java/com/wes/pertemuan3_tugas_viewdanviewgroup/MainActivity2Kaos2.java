package com.wes.pertemuan3_tugas_viewdanviewgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2Kaos2 extends AppCompatActivity {
    ImageView kaos_1,kaos_2,kaos_3,kaos_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_kaos2);

        kaos_1 = findViewById(R.id.imageView1);
        kaos_3 = findViewById(R.id.imageView2);
        kaos_4 = findViewById(R.id.imageView3);

        kaos_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kaos_1 = new Intent(MainActivity2Kaos2.this,MainActivity.class);
                startActivity(kaos_1);
            }
        });
        kaos_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kaos_3 = new Intent(MainActivity2Kaos2.this,MainActivity2Kaos3.class);
                startActivity(kaos_3);
            }
        });
        kaos_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kaos_4 = new Intent(MainActivity2Kaos2.this,MainActivity2Kaos4.class);
                startActivity(kaos_4);
            }
        });
    }
}