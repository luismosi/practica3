package com.example.gabriel.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Lugares extends AppCompatActivity {

    private ImageButton leye;
    private ImageButton obelisco;
    private ImageButton sirena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);


        ImageButton leye = (ImageButton)findViewById(R.id.parquevallenata);
        ImageButton obelisco = (ImageButton)findViewById(R.id.obelisco);
        ImageButton sirena = (ImageButton)findViewById(R.id.sirena);
        final TextView informa_turistica = (TextView)findViewById(R.id.inform_turistic);

        leye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                informa_turistica.setText(getText(R.string.info_leyenda));

            }
        });

        sirena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                informa_turistica.setText(getText(R.string.inf_sirena));

            }
        });
        obelisco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                informa_turistica.setText(getText(R.string.inf_obelisco));

            }
        });

    }
    public void ubicacion_sirena(View view){

        Intent demografo = new Intent(this, Mapssirenayrio.class);
        startActivity(demografo);
    }
    public void ubicacion_vallenata(View view){

        Intent demografo = new Intent(this, Mapsparque.class);
        startActivity(demografo);
    }

    public void ubicacion_obelisco(View view){

        Intent demografo = new Intent(this, Mapsobeliso.class);
        startActivity(demografo);
    }
}