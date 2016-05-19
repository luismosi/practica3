package com.example.gabriel.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button hotels, bars, lugares, acerca, demography ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hotels = (Button) findViewById(R.id.hotels);
        bars = (Button)findViewById(R.id.bars);
        lugares = (Button)findViewById(R.id.lugares);
    }
    public void mostrar(View View)

    {
        Intent hotels = new Intent(this, Hotels.class);
        startActivity(hotels);

    }
    public void mostrarbars(View View)

    {
        Intent bars1 = new Intent(this, Bars.class);
        startActivity(bars1);

    }
    public void mostrarlugares(View View)

    {
        Intent home = new Intent(this, Lugares.class);
        startActivity(home);

    }


    public void mostrar_demo(View View)

    {
        Intent demo = new Intent(this, Demography.class);
        startActivity(demo);

    }

   }