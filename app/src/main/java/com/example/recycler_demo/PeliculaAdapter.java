package com.example.recycler_demo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.PeliculaViewHolder> {

    private List<Pelicula> items;

    @NonNull
    @Override
    public PeliculaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.pelicula_item_layout, viewGroup,false);

        return new PeliculaViewHolder(v);
    }

    public PeliculaAdapter(List<Pelicula> items) {
        this.items = items;
    }

    @Override
    public void onBindViewHolder(@NonNull PeliculaViewHolder peliculaViewHolder, int i) {
        peliculaViewHolder.imagen.setImageResource(items.get(i).getImagen());
        peliculaViewHolder.nombre.setText(items.get(i).getNombre());
        peliculaViewHolder.anio.setText(""+items.get(i).getAnio());
        peliculaViewHolder.rating.setRating(items.get(i).getRating());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class PeliculaViewHolder extends RecyclerView.ViewHolder {

        public ImageView imagen;
        public TextView nombre;
        public TextView anio;
        public RatingBar rating;

        public PeliculaViewHolder(@NonNull View itemView) {
            super(itemView);

            imagen = itemView.findViewById(R.id.imagen);
            nombre = itemView.findViewById(R.id.nombre);
            anio = itemView.findViewById(R.id.anio);
            rating = itemView.findViewById(R.id.rating);
        }
    }
}
