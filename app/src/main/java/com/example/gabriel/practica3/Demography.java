package com.example.gabriel.practica3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Demography extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demography);

    }
    public void Ubicacion_valledupar(View view){

        Intent demografo = new Intent(this, Mapsdemografia.class);
        startActivity(demografo);
    }

}