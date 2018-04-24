package com.example.javier.tarea05;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class fragrecyclerview extends Fragment implements View.OnClickListener{
    Button button;
    Comunicador comunicador;
    int contador = 0;

    @Override public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        if (null == savedInstanceState) {
            contador = 0;
        } else {
            contador = savedInstanceState.getInt("contador", 0);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_fragrecyclerview,container, false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        comunicador = (Comunicador) getActivity();
        button = (Button) getActivity().findViewById(R.id.btn_fragrecycle);
        button.setOnClickListener(this);
    }


    @Override public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("contador", contador);
    }

    @Override
    public void onClick(View view){
        contador++;
        comunicador.responder("Cantidad de clicks"+ contador);

    }
}