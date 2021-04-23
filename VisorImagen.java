package com.rick.arraylist2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class VisorImagen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_imagen);

        ImageView Avatar = (ImageView) findViewById(R. id. ivImagenCompleta);//iportamos las clases y instanciamos nuestra imagen de nuestro diseño

        Intent intent=getIntent();//creamos un intent que va a obtener un intent que lo mando a llamar
        Bundle b=intent.getExtras();//Bundle que nos va a permitir obtener los datos y nos va a obtener la información que habíamos mandado desde la clase datos

        if(b!=null){//verificamos que no sea nulo
            Avatar.setImageResource(b.getInt("IMG"));// en la imagen se va a mandar el resurce de el extra y obtenemos el entero de la imagen con IMG
        }
    }
}
