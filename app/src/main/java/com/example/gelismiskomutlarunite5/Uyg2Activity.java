package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_activity);

        Button btn1 = findViewById(R.id.button3);
        EditText edittxt1 = findViewById(R.id.editTextNumber);
        EditText edittxt2 = findViewById(R.id.editTextNumber2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Toplam: " + topla(edittxt1,edittxt2),Toast.LENGTH_LONG).show();
            }
        });
    }

    private int topla(EditText sayi1, EditText sayi2) {
        return Integer.parseInt(sayi1.getText().toString()) + Integer.parseInt(sayi2.getText().toString());
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg2Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
