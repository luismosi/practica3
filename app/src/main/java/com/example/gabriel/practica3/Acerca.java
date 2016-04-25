package com.example.gabriel.practica3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Acerca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);

        final TextView info_luis = (TextView)findViewById(R.id.info_luis);

        info_luis.setText(getText(R.string.luismosi));

    }

}
