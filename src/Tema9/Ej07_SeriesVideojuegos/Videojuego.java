package Tema9.Ej07_SeriesVideojuegos;

public class Videojuego implements Entregable{

    private final static int HORAS_ESTIMADAS_DEF = 10;

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;

    public Videojuego() {
        this("", HORAS_ESTIMADAS_DEF, "", "");
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this(titulo, horasEstimadas, "", "");
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
        this.entregado = false;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia, String entregado) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
        // sc.next()
        if (entregado.toLowerCase().equals("si"))
            this.entregado = true;
        else
            this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getcompañia() {
        return compañia;
    }

    public void setcompañia(String compañia) {
        this.compañia = compañia;
    }

    public void entregar() {
        entregado = true;
    }

    public void devolver() {
        entregado = false;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public String toString() {
        return "Informacion del videojuego: \n"
                + "\tTitulo: " + titulo + "\n"
                + "\tHoras estimadas: " + horasEstimadas + "\n"
                + "\tGenero: " + genero + "\n"
                + "\tcompañia: " + compañia;
    }
}

