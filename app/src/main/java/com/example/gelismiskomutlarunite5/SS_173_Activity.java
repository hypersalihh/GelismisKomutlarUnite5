package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_173_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_173_activity);

        EditText edittxt1 = findViewById(R.id.editTextTextPersonName);
        EditText edittxt2 = findViewById(R.id.editTextTextPersonName2);

        Button btn1 = findViewById(R.id.button12);
        Button btn2 = findViewById(R.id.button13);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SS_173_Activity.this, "Merhaba " + adsoyad(edittxt1), Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SS_173_Activity.this, "Kötü Günler " + adsoyad(edittxt1,edittxt2), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String adsoyad(EditText edittxt1) {
        return edittxt1.getText().toString();
    }
    private String adsoyad(EditText edittxt1, EditText edittxt2) {
        return edittxt1.getText().toString() + " " + edittxt2.getText().toString();
    }
}
