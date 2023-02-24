package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_188_Activity extends AppCompatActivity {
    int deger,deger2,deger3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_188_activity);

        EditText Kenar1 = findViewById(R.id.ss_188_Kenar1);
        EditText Kenar2 = findViewById(R.id.ss_188_Kenar2);
        EditText Kenar3 = findViewById(R.id.ss_188_Kenar3);
        Button Eskenar = findViewById(R.id.ss_188_Eskenar);

        Eskenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger = Integer.parseInt(Kenar1.getText().toString());
                Ucgen islem = new Ucgen(deger);
            }
        });
    }
}
