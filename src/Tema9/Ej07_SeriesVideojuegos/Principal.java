package Tema9.Ej07_SeriesVideojuegos;

/*
Implementar una clase Serie con las siguientes características:
    • Atributos: titulo, numero de temporadas, entregado, genero y creador.
    • Por defecto, el numero de temporadas es  3 y entregado false.
    • Constructores:
            ▪ Un constructor por defecto.
            ▪ Un constructor con el titulo y creador. El resto por defecto.
            ▪ Un constructor con todos los atributos, excepto de entregado.
    • Métodos:
        ◦ Getter y setter de todos los atributos, excepto de entregado.
        ◦ Sobrescribe los métodos toString.

Crear una clase Videojuego:
    • Atributos: titulo, horas estimadas, entregado, genero y compañia.
    • Por defecto, las horas estimadas serán de 10 horas y entregado false.
    • Constructores:
            ▪ Un constructor por defecto.
            ▪ Un constructor con el titulo y horas estimadas. El resto por defecto.
            ▪ Un constructor con todos los atributos, excepto de entregado.
    • Métodos:
            ▪ Getter y setter de todos los atributos, excepto de entregado.
            ▪ Sobrescribe los métodos toString.

Las clases anteriores tienen campos y métodos en común,
por eso vamos a hacer una interfaz llamada Entregable 
con los siguientes métodos:
    • entregar(): cambia el atributo prestado a true.
    • devolver(): cambia el atributo prestado a false.
    • isEntregado(): devuelve el estado del atributo
	entregado.

Ahora crea una aplicación ejecutable y realiza lo siguiente:
    • Crea dos ArrayList, uno de Series y otro de Videojuegos.
    • Crea un objeto en cada posición, con los valores que desees, puedes usar distintos constructores.
    • Entrega algunos Videojuegos y Series con el método entregar().
    • Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
    • Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas. Muéstralos en pantalla con toda su información (usa el método toString()).
 */
import java.util.ArrayList;
import java.util.Comparator;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Serie> listaSeries = new ArrayList<>();
        ArrayList<Videojuego> listaVideojuegos = new ArrayList<>();

        listaSeries.add(new Serie());
        listaSeries.add(new Serie("Juego de tronos", "George R. R. Martin "));
        listaSeries.add(new Serie("Los Simpsons", 25, "Humor", "Matt Groening"));
        listaSeries.add(new Serie("Padre de familia", 12, "Humor", "Seth MacFarlane"));
        listaSeries.add(new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan"));

        listaVideojuegos.add(new Videojuego());
        listaVideojuegos.add(new Videojuego("Assasin creed 2", 30, "Aventura", "EA"));
        listaVideojuegos.add(new Videojuego("God of war 3", 25));
        listaVideojuegos.add(new Videojuego("Super Mario 3DS", 30, "Plataforma", "Nintendo"));
        listaVideojuegos.add(new Videojuego("Final fantasy X", 200, "Rol", "Square Enix"));

        listaSeries.get(1).entregar();
        listaSeries.get(4).entregar();
        listaVideojuegos.get(0).entregar();
        listaVideojuegos.get(3).entregar();

        //// SERIES Y VIDEOJUEGOS ENTREGADOS
        int entregados = 0;

        for (int i = 0; i < listaSeries.size(); i++) {
            if (listaSeries.get(i).isEntregado()) {
                entregados += 1;
                listaSeries.get(i).devolver();

            }
            if (listaVideojuegos.get(i).isEntregado()) {
                entregados += 1;
                listaVideojuegos.get(i).devolver();
            }
        }

        System.out.println("Hay " + entregados + " artículos entregados");

        //// VIDEOJUEGO CON MÁS HORAS Y SERIE CON MÁS TEMPORADAS
        listaSeries.sort(Comparator.comparing(Serie::getnumeroTemporadas));
        System.out.println("La serie con más temporadas es: " + listaSeries.get(listaSeries.size() - 1));
        listaVideojuegos.sort(Comparator.comparing(Videojuego::getHorasEstimadas));
        System.out.println("El videojuego con más horas estimadas es: " + listaVideojuegos.get(listaVideojuegos.size() - 1));

        /*
        Serie serieMayor = listaSeries.get(0);
        Videojuego videojuegoMayor = listaVideojuegos.get(0);

        for (int i = 1; i < listaSeries.size(); i++) {
            if (listaSeries.get(i).getnumeroTemporadas() > serieMayor.getnumeroTemporadas()) {
                serieMayor = listaSeries.get(i);
            }
            if (listaVideojuegos.get(i).getHorasEstimadas() > videojuegoMayor.getHorasEstimadas()) {
                videojuegoMayor = listaVideojuegos.get(i);
            }

        }
        System.out.println("El videojuego con más horas estimadas es: " + videojuegoMayor);
        System.out.println("La serie con más temporadas es: " + serieMayor);
        */
    }
}
