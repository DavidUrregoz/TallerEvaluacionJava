package poin16;

import domain.Puntos;

import java.time.temporal.Temporal;
import java.util.Scanner;

public class EjecutarPeronsa {
    private String nombreTemporal;
    private int edadTemportal;
    private double alturaTemporal;
    private double pesoTemporal;
    Scanner sc = new Scanner(System.in);
    public EjecutarPeronsa(){

        System.out.println("Ingresa tu nombre por favor ");
        this.nombreTemporal = sc.nextLine();
        System.out.println("Ingrese su sexo por favor");
        String sex= sc.next();
        char sexo = sex.charAt(0);
        pedirEdad();
        pedirPeso();
        pedirAltura();

        Persona persona1 = new Persona(this.nombreTemporal,this.edadTemportal,sexo,this.pesoTemporal,this.alturaTemporal);
        Persona persona2 = new Persona(this.nombreTemporal,this.edadTemportal,sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Jose Federico");
        persona3.setEdad(88);
        persona3.setSexo('H');
        persona3.setPeso(79);
        persona3.setAltura(160);

        System.out.println(persona1);
        imprimirIM(persona1.calcularIMC());

        System.out.println(persona2);
        imprimirIM(persona2.calcularIMC());

        System.out.println(persona3);
        imprimirIM(persona3.calcularIMC());

    }

    public void imprimirIM(int x){
        switch (x){
            case 1:
                System.out.println("Tiene sobrepeso");
                break;
            case 0:
                System.out.println("Tiene un peso Ideal");
                break;
            case -1:
                System.out.println("Estas por debajo del peso");
                break;
        }
    }

    public void pedirAltura(){
        while (true) {
            System.out.println("Ingrese por favos su Altura");
            String alturaTemporal = sc.next();
            if (Puntos.comprobarNumero(alturaTemporal)) {
                this.alturaTemporal = Integer.parseInt(alturaTemporal);
                break;
            } else {
                System.out.println("Solo numeros \n");
            }
        }
    }
    public void pedirEdad(){
        while (true) {
            System.out.println("Ingrese por favos su edad");
            String edadTemporal = sc.next();
            if (Puntos.comprobarNumero(edadTemporal)) {
                this.edadTemportal = Integer.parseInt(edadTemporal);
                break;
            } else {
                System.out.println("Solo numeros \n");
            }
        }
    }
    public void pedirPeso(){
        while (true) {
            System.out.println("Ingrese por favor su peso");
            String pesoTemporal = sc.next();
            if (Puntos.comprobarNumero(pesoTemporal)) {
                this.pesoTemporal = Double.valueOf(pesoTemporal);
                break;
            } else {
                System.out.println("Solo numeros \n");
            }
        }
    }



    public static void main(String[] args) {
        EjecutarPeronsa jej =new EjecutarPeronsa();
    }
}
