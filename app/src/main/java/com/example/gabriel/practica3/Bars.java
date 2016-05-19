package com.example.gabriel.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Bars extends AppCompatActivity {

    private ImageButton tierradecantores;
    private ImageButton kankarua;
    private ImageButton mamajuana;
    private TextView informationbars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars);

        ImageButton tierradecantores = (ImageButton)findViewById(R.id.tierra_cantores);
        ImageButton kankarua = (ImageButton)findViewById(R.id.kanakrua);
        ImageButton mamajuana = (ImageButton)findViewById(R.id.mamajuana);
        final TextView informationbars = (TextView)findViewById(R.id.informationbars);

        tierradecantores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                informationbars.setText(getText(R.string.inf_tierra));

            }
        });

        kankarua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                informationbars.setText(getText(R.string.inf_kakarua));

            }
        });
        mamajuana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                informationbars.setText(getText(R.string.inf_juana));

            }
        });


    }
    public void Kankarua(View View)

    {
        Intent k = new Intent(this, Mapskankarua.class);
        startActivity(k);
    }
    public void Mama_juana(View View)

    {
        Intent m = new Intent(this, Mapsmamajuana.class);
        startActivity(m);

    }
    public void Tierra_cantores(View view){

        Intent t= new Intent(this, Maps_tierradecantores.class);
        startActivity(t);
    }


}