package com.rick.arraylist2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Informacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        TextView titulo = (TextView) findViewById(R. id. tbTitulo);
        TextView detalles = (TextView) findViewById(R. id. tbdescripcion);

        Intent intent = getIntent();
        Bundle b = intent. getExtras();

        if(b!=null) {
            titulo. setText(b. getString("TIT" ));
            detalles. setText(b. getString("DESC" ));
        }

    }
}