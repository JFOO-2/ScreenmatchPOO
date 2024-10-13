package com.aluracursos.screenmatch.modelos;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnELPlan;
    private double sumaDeEvaluaciones;
    private int totalDeLasEvaluaciones = 0;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnELPlan() {
        return incluidoEnELPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnELPlan(boolean incluidoEnELPlan) {
        this.incluidoEnELPlan = incluidoEnELPlan;
    }


    public   int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: "+ nombre);
        System.out.println("Fue lanzada en: " + fechaDeLanzamiento);
        System.out.println("Duracion: "+getDuracionEnMinutos());

    }

    public void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeEvaluaciones/ totalDeLasEvaluaciones;
    }

}
