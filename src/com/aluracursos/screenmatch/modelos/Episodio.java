package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {

    private int numero;
    private String nombre;
    private Serie serie; //tomando clase Serie de referencia
    private int totalVisualicaciones;

    public int getTotalVisualicaciones() {
        return totalVisualicaciones;
    }

    public void setTotalVisualicaciones(int totalVisualicaciones) {
        this.totalVisualicaciones = totalVisualicaciones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if (totalVisualicaciones > 100){
            return 4;
        }else {
            return 2; //retorna nota 2 y en el anterior 4
        }
    }
}
