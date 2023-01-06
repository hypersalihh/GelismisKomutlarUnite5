package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_165_Activity extends AppCompatActivity {
    Button btn1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_165_activity);
        btn1 = findViewById(R.id.button6);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                topla();
            }
        });
    }

    private void topla() {
        int sayi1 = 10;
        int sayi2 = 5;
        int sonuc = sayi1+sayi2;
        Toast.makeText(this, "Toplam:" + sonuc, Toast.LENGTH_LONG).show();
    }

}
