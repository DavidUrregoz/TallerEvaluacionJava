package poin17;

import com.sun.source.doctree.SummaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Electrodomestico {
    protected double precioBase = 100;
    protected String color = "blanco";
    protected char consumo = 'F';
    protected double peso = 5;

    public Electrodomestico(){

    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumo, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumo);
        this.peso = peso;

    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }


    protected void comprobarConsumoEnergetico(char letra){
        String letratempora = ""+letra;
        letra =letratempora.toUpperCase().charAt(0);
        String letrasCorrectas = "ABCDEFabcdef";
        if(letrasCorrectas.contains(""+letra)){
            System.out.println("Consumo valido");
            this.consumo=letra;
        }
    }

    protected void comprobarColor(String color){
        color=color.toLowerCase();
        List<String> colores = new ArrayList<>();
        colores.add("blanco");colores.add("negro");colores.add("rojo");
        colores.add("azul");colores.add("gris");
        for (int i=0; i < colores.size() ;i++){
            if(color.equals(colores.get(i))){
                this.color=color;
            }else {
                System.out.println("no esta el color");
            }
        }
    }

    public double prcioFinal(){
        double suma = 0;
        //CONSUMO
        switch (this.consumo){
            case 'A':
                suma += 100;
                break;
            case 'B':
                suma+=80;
                break;
            case 'C':
                suma+=60;
                break;
            case 'D':
                suma+=50;
                break;
            case 'E':
                suma+=30;
                break;
            case 'F':
                suma+=10;
                break;
        }

        //TAMANIO
        if(this.peso > 0 && this.peso<=19){
            suma+=10;
        }else if(this.peso >= 20 && this.peso<=49){
            suma+=50;
        }else if(this.peso >= 50 && this.peso<=79){
            suma+=80;
        }else if(this.peso >= 80 ){
            suma+=100;
        }


        return this.precioBase + suma;
    }


}
