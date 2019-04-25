package com.example.recycler_demo;

public class Pelicula {
    private String Nombre;
    private int Anio;
    private int imagen;
    private float rating;

    public Pelicula(String nombre, int anio, int imagen, float rating) {
        Nombre = nombre;
        Anio = anio;
        this.imagen = imagen;
        this.rating = rating;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
