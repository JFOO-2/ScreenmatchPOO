package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{
    private int temperoda;
    private int episodiosPorTemporada;
    int minutosPorEpisodio;

    @Override
    public int getDuracionEnMinutos(){
        return temperoda * episodiosPorTemporada * minutosPorEpisodio;


    }

    public int getTemperoda() {
        return temperoda;
    }

    public void setTemperoda(int temperoda) {
        this.temperoda = temperoda;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
