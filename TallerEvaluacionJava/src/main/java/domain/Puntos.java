package domain;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Puntos {
    private Scanner sc;

    private void punto1(){
        double n1,n2;
        n1=10;
        n2=32;
        if(n1> n2)
            System.out.println("El numero mayor es "+ n1);
        else if(n1<n2)
            System.out.println("El numero mayor es "+ n2);
        else
            System.out.println("Los numero son iguales ");

    }

    private void punto2(){
        String n1,n2;
        sc=new Scanner(System.in);
        System.out.println("Ingrese Un numero ");
        n1=sc.next();
        System.out.println("Ingrese el otro numero ");
        n2=sc.next();
        if(comprobarNumero(n1) && comprobarNumero(n2)) {
            double n1double=Double.valueOf(n1);
            double n2double=Double.valueOf(n2);
            if(n1double > n2double)
                System.out.println("El numero mayor es "+ n1double);
            else if(n1double<n2double)
                System.out.println("El numero mayor es "+ n2double);
            else
                System.out.println("Los numero son iguales ");
        }else{
            System.out.println("por favor ingrese solo un numero");
        }
    }
    private void punto3(){
        sc= new Scanner(System.in);
        System.out.println("Ingrese el Radio del circulo");
        String radioStr=sc.next();
        if(comprobarNumero(radioStr)){
            double radioDoub=Double.valueOf(radioStr);
            System.out.println("El radio es: "+(2*Math.PI)*Math.pow(radioDoub,2));
        }else{
            System.out.println("Ingrese un numero porfavor");
        }
    }

    public boolean comprobarNumero(String n){
        if(n.matches("[+-]?\\d*(\\.\\d+)?"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Puntos punto =new Puntos();
        punto.punto3();
    }




}
