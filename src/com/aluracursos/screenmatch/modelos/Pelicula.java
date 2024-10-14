package com.aluracursos.screenmatch.modelos;

public class Pelicula extends Titulo {    //Herencia
    private String director;
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }
}