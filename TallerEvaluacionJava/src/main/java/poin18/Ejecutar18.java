package poin18;

import java.util.ArrayList;
import java.util.List;

public class Ejecutar18 {
    private List<Serie> listaSeries;
    private List<VideoJuego> listaVideoJuegos;
    public Ejecutar18(){
        listaVideoJuegos=new ArrayList<>();
        listaSeries=new ArrayList<>();
        Serie serie1 = new Serie("Juego de tronos",8,"Epico","Geroge RR");
        Serie serie2 = new Serie("La Casa de Papel","Accion/Drama");
        Serie serie3 = new Serie("Breaking Bad",5,"Thriller","Vince G");
        Serie serie4 = new Serie("Breaking Bad2",3,"Thriller","Vince G");
        Serie serie5 = new Serie("Vikingos",6,"Accion Epico","Earl Harald");
        serie1.entregar();
        serie5.entregar();
        listaSeries.add(serie1);
        listaSeries.add(serie2);
        listaSeries.add(serie3);
        listaSeries.add(serie4);
        listaSeries.add(serie5);

        VideoJuego juego1 = new VideoJuego("CoD",1000,"Disparos","Infinity W");
        VideoJuego juego2 = new VideoJuego("LoL",1000000,"EstrategiaMoba","Riot G");
        VideoJuego juego3 = new VideoJuego("Mario",20,"Plataforma","Nintendo");
        VideoJuego juego4 = new VideoJuego("OW",90,"Disparos","brizzard");
        VideoJuego juego5 = new VideoJuego("Eli",65,"Aventura","Cualquiera");
        juego5.entregar();
        juego1.entregar();
        juego3.entregar();
        listaVideoJuegos.add(juego1);
        listaVideoJuegos.add(juego2);
        listaVideoJuegos.add(juego3);
        listaVideoJuegos.add(juego4);
        listaVideoJuegos.add(juego5);
        juegosEntregados();
        serieslasEntregados();
        serieMaslarga();
        VideoMaslarga();
    }


    public void juegosEntregados(){
        System.out.println("***********************");
        int contador =0;
        for(VideoJuego v: this.listaVideoJuegos){
            if (v.inEntregado()){
                System.out.println("El Video Juego "+v.getTitulo()+"Esta entregado");
                v.devolver();
                contador +=1;
            }
        }
        System.out.println("Hay "+contador+" Videojuegos entregados");
    }

    public void serieslasEntregados(){
        System.out.println("***********************");
        int contador =0;
        for(Serie s: this.listaSeries){
            if (s.inEntregado()){
                System.out.println("El Video Juego "+s.getTitulo()+"Esta entregado");
                s.devolver();
                contador +=1;
            }
        }
        System.out.println("Hay "+contador+" Series entregadas");
    }

    public void serieMaslarga(){
        System.out.println("***********************");
        this.listaSeries.sort((x,y)->y.compareTo(x));
        System.out.println("La serie mas Larga es:");
        System.out.println(listaSeries.get(0));
    }
    public void VideoMaslarga(){
        System.out.println("***********************");
        this.listaVideoJuegos.sort((x,y)->y.compareTo(x));
        System.out.println("El videojuego mas largo es:");
        System.out.println(listaVideoJuegos.get(0));
    }


}
