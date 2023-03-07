package Tema9.Ej07_SeriesVideojuegos;

public class Serie implements Entregable{

    private final static int NUM_TEMPORADAS_DEF = 3;

    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this("", NUM_TEMPORADAS_DEF, "", "");
    }

    public Serie(String titulo, String creador) {
        this(titulo, NUM_TEMPORADAS_DEF, "", creador);
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setnumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getcreador() {
        return creador;
    }

    public void setcreador(String creador) {
        this.creador = creador;
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
        return "Información de la Serie: \n"
                + "\tTitulo: " + titulo + "\n"
                + "\tNumero de temporadas: " + numeroTemporadas + "\n"
                + "\tGenero: " + genero + "\n"
                + "\tCreador: " + creador;
    }
}
