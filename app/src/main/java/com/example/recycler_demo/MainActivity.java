package com.example.recycler_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List items = new ArrayList();

        items.add(new Pelicula("Rambo III",1987,R.drawable.ic_launcher_background,3.5f));
        items.add(new Pelicula("Terminator II",1992,R.drawable.ic_launcher_background,4.1f));
        items.add(new Pelicula("Volver al Futuro II",1985,R.drawable.ic_launcher_background,2.6f));
        items.add(new Pelicula("Avengers: End Game",2019,R.drawable.ic_launcher_background,4.8f));
        items.add(new Pelicula("Shazam",2019,R.drawable.ic_launcher_background,4.6f));
        items.add(new Pelicula("Wonder Woman",2018,R.drawable.ic_launcher_background,3.3f));

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

// Crear un nuevo adaptador
        adapter = new PeliculaAdapter(items);
        recycler.setAdapter(adapter);
    }
}
