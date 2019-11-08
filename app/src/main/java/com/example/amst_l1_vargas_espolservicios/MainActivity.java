package com.example.amst_l1_vargas_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button academico_bttn;
    private Button sidweb_bttn;
    private Button bienestar_bttn;
    private Button vinculos_bttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        academico_bttn.findViewById(R.id.academico_bttn);
        sidweb_bttn.findViewById(R.id.sidweb_bttn);
        vinculos_bttn.findViewById(R.id.vinculos_bttn);
        bienestar_bttn.findViewById(R.id.bienestar_bttn);


    }


    public void irTalLugara(View view){
        Intent toAcademico= new Intent(this,AcademicoActivity.class);
        startActivity(toAcademico);
        finish();
    }
    public void irTalLugar2(View view){
        Intent toSidweb= new Intent(this,SidwebActivity.class);
        startActivity(toSidweb);
        finish();
    }
    public void irTalLugar3(View view){
        Intent tovinculos= new Intent(this,VinculosActivity.class);
        startActivity(tovinculos);
        finish();
    }
    public void irTalLugar4(View view){
        Intent tobienestar= new Intent(this,BienestarActivity.class);
        startActivity(tobienestar);
        finish();
    }
}
