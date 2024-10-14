import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula pellicula = new Pelicula(); //instanciar un objeto
        pellicula.setNombre("Encanto");
        pellicula.setFechaDeLanzamiento(2021);
        pellicula.setDuracionEnMinutos(120);
        pellicula.setIncluidoEnELPlan(true);


        pellicula.muestraFichaTecnica();
        pellicula.evalua(7);
        pellicula.evalua(10);

        System.out.println(pellicula.getTotalDeLasEvaluaciones());
        System.out.println(pellicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemperoda(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(pellicula);
        calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());






        //crear otro objeto Pelicual

       /* com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 120;

        otraPelicula.muestraFichaTecnica();*/






    }
}
