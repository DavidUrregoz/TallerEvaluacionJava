package poin17;

import java.util.ArrayList;
import java.util.List;

public class Ejecutar17 {
    private List<Electrodomestico> lista;
    public Ejecutar17(){
        Electrodomestico elec4 = new Electrodomestico();
        Electrodomestico elec1 = new Electrodomestico(120,"negro",'C',40);
        Electrodomestico elec2 = new Electrodomestico(56,"azul",'D',70);
        Electrodomestico elec3 = new Electrodomestico(78,"blanco",'A',400);
        Lavadora lava1 =new Lavadora(300,"gris",'A',250,50);
        Lavadora lava2 =new Lavadora(500,"rojo",'A',700,333);
        Lavadora lava3 =new Lavadora(50,40);
        Televisor tv1 = new Televisor(250,"negro",'E',18,80,true);
        Televisor tv2 = new Televisor(100,"azul",'F',10,12,false);
        Televisor tv3 = new Televisor(1000,"gris",'A',72,250,true);

        lista=new ArrayList<>();
        lista.add(elec1);
        lista.add(elec2);
        lista.add(elec3);
        lista.add(elec4);
        lista.add(lava1);
        lista.add(lava2);
        lista.add(lava3);
        lista.add(tv1);
        lista.add(tv2);
        lista.add(tv3);
    }

    public void precioFinal(){

        double sumatvs=0,sumalava= 0,sumaEle=0;
        int contadortvs=0,contadorlava=0,contadorElec=0;
        for (int i = 0;i<this.lista.size();i++){
             if(lista.get(i) instanceof Lavadora){
                contadorlava+=1;
                sumalava+=lista.get(i).precioTotal;
            }
            else if(lista.get(i) instanceof Televisor) {
                contadortvs += 1;
                sumatvs += lista.get(i).precioTotal;
            }else if(lista.get(i) instanceof Electrodomestico) {
                contadorElec += 1;
                sumaEle += lista.get(i).precioTotal;
            }
        }

        System.out.println("Se compraron:\n"+contadorElec+" Electrodomesticos por una suma de: "+sumaEle+
                "\n"+contadorlava+" Lavadoras por una suma de: "+sumalava+
                "\n"+contadortvs+" Televisores por una suma de: "+sumatvs+
                "\nPARA UNA SUMA DE "+(sumaEle+sumalava+sumatvs));
    }

}
