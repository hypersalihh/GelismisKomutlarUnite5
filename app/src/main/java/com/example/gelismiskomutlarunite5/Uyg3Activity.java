package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);

        Button btn1 = findViewById(R.id.button4);
        EditText editText1 = findViewById(R.id.edittxt3);
        EditText editText2 = findViewById(R.id.edittxt4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1;
                sayi1 = Integer.parseInt(editText1.getText().toString());
                int sayi2;
                sayi2 = Integer.parseInt(editText2.getText().toString());
                int sonuc = topla(sayi1, sayi2);
                Toast.makeText(getApplicationContext(), Integer.toString(sonuc), Toast.LENGTH_LONG).show();
            }
        });
    }

    private int topla(int sayi1, int sayi2) {

        return sayi1 + sayi2;
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg3Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
