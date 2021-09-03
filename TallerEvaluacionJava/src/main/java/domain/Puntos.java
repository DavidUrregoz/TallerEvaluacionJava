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
        if(n1.matches("[+-]?\\d*(\\.\\d+)?") && n2.matches("[+-]?\\d*(\\.\\d+)?")){
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

    public static void main(String[] args) {
        Puntos punto =new Puntos();
    }
}
