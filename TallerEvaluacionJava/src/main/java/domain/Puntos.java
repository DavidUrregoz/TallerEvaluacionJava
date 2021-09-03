package domain;

public class Puntos {
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

    public static void main(String[] args) {
        Puntos punto =new Puntos();
        punto.punto1();
    }
}
