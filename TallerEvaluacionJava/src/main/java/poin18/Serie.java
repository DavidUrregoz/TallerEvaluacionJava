package poin18;

public class Serie implements Entregable{
    private String titulo;
    private int numeroTemporadas = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    public Serie() {
    }

    public Serie(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public boolean inEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        if (a instanceof Serie) {
            Serie b = (Serie)a;
            if (this.numeroTemporadas > b.numeroTemporadas) {
                return 1;
            } else if (this.numeroTemporadas < b.numeroTemporadas) {
                return -1;
            }else
                return 0;
        }else
            return 0;

    }

}
