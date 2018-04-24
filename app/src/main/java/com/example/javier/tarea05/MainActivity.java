package com.example.javier.tarea05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Comunicador{
    RecyclerView rv;
    /*SeriesAdapter adapter;
    ArrayList<Serie> series;*/
    LinearLayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void responder(String datos){
        android.app.FragmentManager fragmentManager = getFragmentManager();
        fragtwo ftwo = (fragtwo) fragmentManager.findFragmentById(R.id.ftwo_element);
        fragtwo.cambiartxt(datos);
    }

}
