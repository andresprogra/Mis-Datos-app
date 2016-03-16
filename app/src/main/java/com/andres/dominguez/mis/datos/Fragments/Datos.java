package com.andres.dominguez.mis.datos.Fragments;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.andres.dominguez.mis.datos.Comunicador;
import  com.andres.dominguez.mis.datos.R;


/**
 * Created by Andres Dominguez on 29/02/2016.
 */
public class Datos extends Fragment {
    View rootView;
    EditText name;
    EditText last;
    TextView war;
    EditText age;
    Button boton;
    Comunicador comunicacion;
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
       rootView = inflater.inflate(R.layout.datos,container,false);
        //Casting
        name = (EditText) rootView.findViewById(R.id.name);
        last = (EditText) rootView.findViewById(R.id.lastname);
        age = (EditText) rootView.findViewById(R.id.age);
        war = (TextView) rootView.findViewById(R.id.war);
        boton = (Button) rootView.findViewById(R.id.btnEnviar);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameD;
                String lastD;
                String ageD;
                nameD = name.getText().toString();
                lastD = last.getText().toString();
                ageD = age.getText().toString();

                comunicacion = (Comunicador) getActivity();
                try{
                    comunicacion.responder(nameD, lastD, ageD);
                    //war.setText("¡Felicidades! la comunicación se a hecho con éxito");
                } catch (Exception e){
                  war.setText(e.toString());
                }
            }
        });

        return rootView;
    }



}
