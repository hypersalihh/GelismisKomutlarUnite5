package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_activity);
        EditText editTextYas = findViewById(R.id.editTextYas);
        Button buttonKaydet = findViewById(R.id.buttonKaydet);
        TextView textViewSonuc = findViewById(R.id.textViewSonuc);
        buttonKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int yas = Integer.parseInt(editTextYas.getText().toString());
                Personel personel = new Personel();
                personel.setYas(yas);
                textViewSonuc.setText(Integer.toString(personel.getYas()));
            }
        });
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg7Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
