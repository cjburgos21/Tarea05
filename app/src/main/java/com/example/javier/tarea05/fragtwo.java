package com.example.javier.tarea05;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class fragtwo extends Fragment {

    TextView tv;
    String  textoGuardado;

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.ftwo,container,false);
            if(savedInstanceState==null){

            }else{
                textoGuardado = savedInstanceState.getString("texto");
                tv=(TextView) rootView.findViewById(R.id.tv_ftwo);
                tv.setText(textoGuardado);
            }
            return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        tv = (TextView) getActivity().findViewById(R.id.tv_ftwo);
    }


    @Override public void onSaveInstaceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("texto", textoGuardado);
    }

    public void cambiarTexto(String texto){
        this.textoGuardado = texto;
        tv.setText(texto);
    }


    }

