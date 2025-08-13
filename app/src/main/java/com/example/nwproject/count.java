package com.example.nwproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class count extends AppCompatActivity {

    private int angka = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        TextView textView2 = findViewById(R.id.textView1);
        Button buttonTambah = findViewById(R.id.button);
        Button buttonReset = findViewById(R.id.button3);
        Button kembali = findViewById(R.id.buttonK);

        buttonTambah.setOnClickListener(v -> {
            angka++;
            textView2.setText(String.valueOf(angka));
        });

        buttonReset.setOnClickListener(v -> {
            angka = 0;
            Toast.makeText(count.this, "Angka berhasil direset", Toast.LENGTH_SHORT).show();
            textView2.setText(String.valueOf(angka));
        });

        kembali.setOnClickListener(v -> {
            Intent intent = new Intent(count.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
