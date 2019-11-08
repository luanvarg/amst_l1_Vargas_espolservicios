package com.example.amst_l1_vargas_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class VinculosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinculos);

        Toast toast=Toast.makeText(getApplicationContext(),"Horario de Atención de Lunes a Viernes",Toast.LENGTH_SHORT);
        toast.show();
    }
}
