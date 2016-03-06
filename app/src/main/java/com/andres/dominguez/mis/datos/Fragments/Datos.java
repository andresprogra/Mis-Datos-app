package com.andres.dominguez.mis.datos.Fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andres.dominguez.mis.datos.R;

/**
 * Created by Andres Dominguez on 29/02/2016.
 */
public class Datos extends Fragment {
    View rootView;
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
       rootView = inflater.inflate(R.layout.datos,container,false);
        return rootView;
    }

}
