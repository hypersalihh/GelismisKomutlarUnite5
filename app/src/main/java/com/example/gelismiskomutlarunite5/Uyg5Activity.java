package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);

        Button btn1 = findViewById(R.id.button14);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtcihazadi = findViewById(R.id.txtcihazadi);
                EditText txtKW = findViewById(R.id.txtKW);
                EditText txtgks = findViewById(R.id.txtgks);
                TextView textViewSonuc = findViewById(R.id.textView4);

                String cihazAdi = txtcihazadi.getText().toString();
                int kw = Integer.parseInt(txtKW.getText().toString());
                int saat = Integer.parseInt(txtgks.getText().toString());
                ElektrikliCihaz cihaz1 = new ElektrikliCihaz();
                cihaz1.cihazAdi = cihazAdi;
                cihaz1.cihazKW = kw;
                cihaz1.gunlukSaatKullanimi=saat;
                double sonuc = cihaz1.aylikTuketim();
                textViewSonuc.setText(Double.toString(sonuc));
            }
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg5Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
