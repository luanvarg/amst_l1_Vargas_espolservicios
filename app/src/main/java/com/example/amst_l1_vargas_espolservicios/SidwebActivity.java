package com.example.amst_l1_vargas_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SidwebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidweb);

        Toast toast=Toast.makeText(getApplicationContext(),"Horario de Atención de Lunes a Domingo",Toast.LENGTH_SHORT);
        toast.show();

    }
}
