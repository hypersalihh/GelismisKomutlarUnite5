package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_206_Activity extends AppCompatActivity {
    public Asker asker;
    public  Tankci tankci;
    public  Topcu topcu;
    String mesaj = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_206_activity);

        asker = new Asker();
        tankci = new Tankci();
        topcu = new Topcu();

        TextView textViewMesaj = findViewById(R.id.textViewMesaj);
        Button buttonAsker = findViewById(R.id.buttonAsker);
        Button buttonTankci = findViewById(R.id.buttonTankci);
        Button buttonTopcu = findViewById(R.id.buttonTopcu);

        buttonAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = asker.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
        buttonTankci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = tankci.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
        buttonTopcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = topcu.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
    }
    }
