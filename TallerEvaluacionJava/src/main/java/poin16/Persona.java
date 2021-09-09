package poin16;

import domain.Puntos;

import java.util.Scanner;

public class Persona {
    private Scanner sc =new Scanner(System.in) ;
    private String nombre="";
    private int edad = 0;
    private String DNI;
    private char sexo = 'M';
    private double peso = 0;
    private double altura = 0;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
        double salida = this.peso/(Math.pow(this.altura,2));
        if(salida < 20)
            return -1;
        else if(salida > 25)
            return  1;
        else {
            return 0;
        }
    }

    public boolean esMayorDeEdad(){
        if(this.edad>=18){
            return true;
        }else {
            return false;
        }
    }

    private void comprobarSexo(char sexo){
        if(sexo == 'M' || sexo=='m'){
            this.sexo= 'M';
        }else {
            this.sexo = 'H';
        }
    }

    private void generarDNI(){
        double numero =  Math.random()*99999999;
        long numero2 = Math.round(numero);
        this.DNI=gernerarNumCaracter(numero2);
        System.out.println(this.DNI);
    }

    private String gernerarNumCaracter(long numero2){
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        char numeroLetra= caracteres.charAt(Math.round(numero2%23));
        return  ""+numero2 + numeroLetra;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }


    public boolean pedirAltura(){
        System.out.println("Ingrese por favos su Altura");
        String alturaTemporal=sc.next();
        if(Puntos.comprobarNumero(alturaTemporal)){
            this.altura=Integer.parseInt(alturaTemporal);
            return false;
        }else {
            System.out.println("Solo numeros \n");
            return true;
        }
    }
    public boolean pedirEdad(){
        System.out.println("Ingrese por favos su edad");
        String edadTemporal=sc.next();
        if(Puntos.comprobarNumero(edadTemporal)){
            this.edad=Integer.parseInt(edadTemporal);
            return false;
        }else {
            System.out.println("Solo numeros \n");
            return true;
        }
    }
    public boolean pedirPeso(){
        System.out.println("Ingrese por favor su peso");
        String pesoTemporal=sc.next();
        if(Puntos.comprobarNumero(pesoTemporal)){
            this.peso=Integer.parseInt(pesoTemporal);
            return false;
        }else{
            System.out.println("Solo numeros \n");
            return true;
        }
    }

}
