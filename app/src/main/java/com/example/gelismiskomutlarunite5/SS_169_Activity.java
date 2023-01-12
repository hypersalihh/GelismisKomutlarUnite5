package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_169_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_169_activity);

        EditText txt1 = findViewById(R.id.edittxt5);
        EditText txt2 = findViewById(R.id.edittxt6);
        Button toplabtn = findViewById(R.id.btntopla);
        Button cikarbtn = findViewById(R.id.btncikar);
        Button carpbtn = findViewById(R.id.btncarp);
        Button bolbtn = findViewById(R.id.btnbol);
        toplabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SS_169_Activity.this, "Sayıların Toplamı = " + topla(txt1,txt2), Toast.LENGTH_SHORT).show();
            }
        });
        cikarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SS_169_Activity.this, "Sayıların Çıkarımı = " + cikar(txt1,txt2), Toast.LENGTH_SHORT).show();
            }
        });
        carpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SS_169_Activity.this, "Sayıların Çarpımı = " + carp(txt1,txt2), Toast.LENGTH_SHORT).show();
            }
        });
        bolbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SS_169_Activity.this, "Sayıların Bölümü = " + bol(txt1,txt2), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public int topla(EditText txt1, EditText txt2)
    {
        return Integer.parseInt(txt1.getText().toString()) + Integer.parseInt(txt2.getText().toString());
    }
    public int cikar(EditText txt1, EditText txt2)
    {
        return Integer.parseInt(txt1.getText().toString()) - Integer.parseInt(txt2.getText().toString());
    }
    public int carp(EditText txt1, EditText txt2)
    {
        return Integer.parseInt(txt1.getText().toString()) * Integer.parseInt(txt2.getText().toString());
    }
    public int bol(EditText txt1, EditText txt2)
    {
        return Integer.parseInt(txt1.getText().toString()) / Integer.parseInt(txt2.getText().toString());
    }
}
