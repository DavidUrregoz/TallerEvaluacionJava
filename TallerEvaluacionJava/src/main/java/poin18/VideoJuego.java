package poin18;

public class VideoJuego implements Entregable{
    private String titulo;
    private int horasEstimadas =10;
    private boolean entregado =false;
    private String genero;
    private String compania;

    public VideoJuego() {
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
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

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false
    }

    @Override
    public boolean inEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        if (a instanceof VideoJuego) {
            VideoJuego b = (VideoJuego) a;
            if (this.horasEstimadas > b.horasEstimadas) {
                return 1;
            } else if (this.horasEstimadas < b.horasEstimadas) {
                return -1;
            } else
                return 0;
        }else
            return 0;
    }
}
