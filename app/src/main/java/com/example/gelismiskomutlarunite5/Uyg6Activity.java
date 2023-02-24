package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
    EditText edittxtGenislik,edittxtUzun;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);
        edittxtGenislik = findViewById(R.id.editTextKisaKenar);
        edittxtUzun = findViewById(R.id.editTextUzunKenar);
    }
    public void uyg6Kare(View view){
        int uzunluk = Integer.parseInt(edittxtUzun.getText().toString());
        int genislik = Integer.parseInt(edittxtGenislik.getText().toString());
        if (edittxtGenislik.getText().toString() == ""){
            Dortgen hesapla = new Dortgen(uzunluk);
            int a = hesapla.sonuc;
            Toast.makeText(this,"Sonuç " + a ,Toast.LENGTH_LONG).show();
        }
        else{
            Dortgen hesapla = new Dortgen(uzunluk,genislik);
            int a = hesapla.sonuc;
            Toast.makeText(this,"Sonuç " + a ,Toast.LENGTH_LONG).show();
        }
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg6Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
