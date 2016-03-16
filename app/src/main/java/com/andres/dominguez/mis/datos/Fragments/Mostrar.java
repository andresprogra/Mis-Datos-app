package com.andres.dominguez.mis.datos.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.andres.dominguez.mis.datos.R;

/**
 * Created by Andres Dominguez on 29/02/2016.
 */
public class Mostrar extends Fragment {
    View rootView;
    TextView name;
    TextView last;
    TextView age;
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.mostrar,container,false);
        //Casting
        name = (TextView) rootView.findViewById(R.id.nombre);
        last = (TextView) rootView.findViewById(R.id.apellido);
        age = (TextView) rootView.findViewById(R.id.edad);
        return rootView;
    }

    public void ObtenerDatos(String nameD,String lastD, String ageD){
        name.setText("Tu nombre es: " + nameD );
        last.setText("Tu apellido es: " + lastD );
        age.setText("Tu edad es: " + ageD );
    }









    /*
    public void ObtenerDatos(String nameD, String lastD, String ageD){
        name.setText("Tu nombre es: " + nameD);
        last.setText("Tu apellido es: " +lastD);
        age.setText("Tu edad es: " +ageD);


    }*/
}
