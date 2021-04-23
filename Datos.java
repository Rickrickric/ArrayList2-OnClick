package com.rick.arraylist2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//extends de BaseAdapter y generar metodos
public class Datos extends BaseAdapter {
    //variables globales
    //layout inflater se utiliza para instanciar el archivo de diseño y que se muestre en MainActivity
    LayoutInflater inflater=null;
    //generar los datos
    Context context;
    String[] titulos;
    String [] descripciones;
    int [] avatar;

    //generar constructor
    public Datos(Context context, String[] titulos, String[] descripciones, int[] avatar) {
        this.context = context;
        this.titulos = titulos;
        this.descripciones = descripciones;
        this.avatar = avatar;

        //inicializar inflater
        inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    //generar vista y asignar mediante inflate los elementos del archivo xml
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = inflater.inflate(R.layout.item_fila,null);
        //referenciar
        TextView Titulo= vista.findViewById(R.id.titulo);
        TextView Descripcion = vista.findViewById(R.id.descripcion);
        ImageView Avatar = vista.findViewById(R.id.avatar);

        //asignar datos a cada una de las posiciones
        Titulo.setText(titulos[position]);
        Descripcion.setText(descripciones[position]);
        Avatar.setImageResource(avatar[position]);

        Avatar.setTag(position);//podemos asociarle información a una View.
        Avatar.setOnClickListener(new View.OnClickListener() {// el metodo setOnClickListener que lanza una accion al hacer click
            @Override
            public void onClick(View v) { //inicio de la implementacion del  metodo onClick
                Intent visorImagen=new Intent(context,VisorImagen.class); //Iniciamos otra actividad dentro del context de otra clase.
                visorImagen.putExtra("IMG",avatar[(Integer)v.getTag()]);//declaramos que realizara una accion extra y nos enviara el id de ima
                context.startActivity(visorImagen); //iniciamos la actividad en el contexto de la clase visor Imagen
                }
                });

        return vista;
    }
    @Override
    public int getCount() {
        return avatar.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}