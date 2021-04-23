package com.rick.arraylist2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String titulos[]={"Alumno No.1","Alumno No.2","Alumno No.3","Alumno No.4","Alumno No.5","Alumno No.6","Alumno No.7",
            "Alumno No.8","Alumno No.9"};
    String descripciones[]={"Jimenez Cruz Ricardo","Cruz Cruz Laura","Cruz Torres Juan",
            "Zul Zul Paty","Torres Torres Pedro","Perez Perez Reyna",
            "Huerta Ramirez Emmanuel","Trejo Ramirez Julio", "Trejo Ramirez Mario" };
    int avatar[]={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,
            R.drawable.i};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instanciar vista
        listView = findViewById(R.id.lista);
        //instanciar elementos que contiene la lista mediante SetAdapter
        listView.setAdapter(new Datos(this,titulos,descripciones,avatar));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { //Este metodo se usa cuando se da click en un item de la lista
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDescripcion=new Intent(view.getContext(),Informacion.class);// nuevo evento
                visorDescripcion.putExtra("TIT",titulos[position]);//extra titulo
                visorDescripcion.putExtra("DESC",descripciones[position]);//extra descripcion
                startActivity(visorDescripcion);//inicioamos la actividad
            }
        });
    }
}