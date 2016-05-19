package com.example.gabriel.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Hotels extends AppCompatActivity {
    private ImageButton hotels_arawak;
    private ImageButton hotels_leyendavallenata;
    private ImageButton hotels_vajamar;
    private TextView information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        ImageButton hotels_arawak = (ImageButton)findViewById(R.id.arawak);
        ImageButton hotels_leyendavallenata = (ImageButton)findViewById(R.id.leyenda);
        ImageButton hotels_vajamar = (ImageButton)findViewById(R.id.vajamar);
        final TextView information = (TextView)findViewById(R.id.information);

        hotels_arawak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                information.setText(getText(R.string.inf_arawak));

            }
        });

        hotels_leyendavallenata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                information.setText(getText(R.string.info_leyenda));

            }
        });
        hotels_vajamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                information.setText(getText(R.string.inf_vajamar));

            }
        });
    }

    public void ubicacion_vajamar(View View)

    {
        Intent vajamar = new Intent(this, Maps_vajamar.class);
        startActivity(vajamar);
    }
    public void ubicacion_arawak(View View)

    {
        Intent arawak = new Intent(this, Maps_Arawa.class);
        startActivity(arawak);

    }
    public void Mleyenda(View view){

        Intent leyenda = new Intent(this, Maps_leyenda.class);
        startActivity(leyenda);
    }

}


