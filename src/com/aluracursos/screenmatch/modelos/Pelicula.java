package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {    //Herencia extends, implements para Interfaces
    private String director;
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) calculaMedia()/2; // estamos haciendo un casting ya que el metodo calcular media es de un valor double y se requiere un valor entero para esta clase
        // esto es para dar la clsaificacion del titulo "la nota de la pelicula como un valor de estrellas"
    }
}