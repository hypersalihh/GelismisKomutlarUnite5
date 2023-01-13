package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);
        EditText edittxt1 = findViewById(R.id.edittxt7);
        EditText edittxt2 = findViewById(R.id.edittxt8);
        EditText edittxt3 = findViewById(R.id.edittxt9);
        Button btn1 = findViewById(R.id.button8);
        Button btn2 = findViewById(R.id.button9);
        TextView textView = findViewById(R.id.textView2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1;
                sayi1 = Integer.parseInt(edittxt1.getText().toString());

                int sayi2;
                sayi2 = Integer.parseInt(edittxt2.getText().toString());
                int sonuc = topla(sayi1,sayi2);
                textView.setText(Integer.toString(sonuc));

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1;
                sayi1 = Integer.parseInt(edittxt1.getText().toString());

                int sayi2;
                sayi2 = Integer.parseInt(edittxt2.getText().toString());

                int sayi3;
                sayi3 = Integer.parseInt(edittxt3.getText().toString());
                int sonuc = topla(sayi1,sayi2,sayi3);
                textView.setText(Integer.toString(sonuc));
            }
        });
    }

    private int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    private int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg4Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
