package domain;


import poin16.EjecutarPeronsa;
import poin17.Ejecutar17;
import poin18.Ejecutar18;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Puntos {
    public Scanner sc;

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

    private void punto4(){
        sc= new Scanner(System.in);
        System.out.println("Ingrese el precio del producto por favor");
        String precio=sc.next();
        if(comprobarNumero(precio)){
            double precioDou=Double.valueOf(precio);
            System.out.println("El precio del producto del producto con IVA es de: "+(precioDou + 0.21*precioDou));
        }else
            System.out.println("Ingrese un numero por favor");
    }

    private void punto5(){
        List<Integer> pares=new ArrayList<>();
        List<Integer> impares=new ArrayList<>();
        int contador=0;
        while(contador<=100){
            if(contador%2==0){
                pares.add(contador);
            }else {
                impares.add(contador);
            }
            contador+=1;
        }
        System.out.println("Lista de numeros pares");
        pares.stream().forEach(System.out::println);
        System.out.println("Lista de numeros Impares");
        impares.stream().forEach(System.out::println);
    }

    private void punto6(){
        List<Integer> pares=new ArrayList<>();
        List<Integer> impares=new ArrayList<>();
        for(int i=0;i<=100;i++){
            if(i%2==0){
                pares.add(i);
            }else {
                impares.add(i);
            }
        }
        System.out.println("Lista de numeros pares");
        pares.stream().forEach(System.out::println);
        System.out.println("Lista de numeros Impares");
        impares.stream().forEach(System.out::println);
    }

    private void punto7(){
        sc= new Scanner(System.in);
        int nEnte;
        do {
            System.out.println("Ingrese un numero ");
            String nStr = sc.next();
            if (comprobarNumero(nStr)) {
                nEnte = Integer.parseInt(nStr);
            }else {
                System.out.println("Favor ingresar un numero");
                nEnte=-69;
                continue;
            }
        }while (nEnte <= 0);
        System.out.println("Gracias");
    }

    private void punto8(){
        sc= new Scanner(System.in);
        System.out.println("Favor ingresar el nombre del dia " +
                "de la semana");
        String dia=sc.next();
        dia=dia.toLowerCase();
        switch (dia){
            case "lunes":
                System.out.println("Es un dia Laboral");
                break;
            case "martes":
                System.out.println("Es un dia Laboral");
                break;
            case "miercoles":
                System.out.println("Es un dia Laboral");
                break;
            case "jueves":
                System.out.println("Es un dia Laboral");
                break;
            case "viernes":
                System.out.println("Es un dia Laboral");
                break;
            case "sabado":
                System.out.println("No es un dia Laboral");
                break;
            case "domingo":
                System.out.println("No es un dia Laboral");
                break;
            default:
                System.out.println("Ese no es un dia");
        }

    }

    private void punto9(){
        sc= new Scanner(System.in);
        String frase="La sonrisa sera la mejor arma contra la tristeza";
        frase = frase.replace('a','e');
        System.out.println("La frase es: \n"+frase +"\nQue frase desena anexar?");
        String frase2 =sc.nextLine();
        System.out.println(frase + " "+frase2);
    }

    private void punto10(){
        sc= new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase =sc.nextLine();
        frase = frase.replace(" ","");
        System.out.println(frase );
    }

    private void punto11(){
        sc= new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase =sc.nextLine();
        System.out.println("La frase tiene una longitud de: "+frase.length());
        char caracter;
        int numeroVocales=0;
        for(int i=0;i<frase.length();i++){
            caracter=frase.toLowerCase().charAt(i);
            if (caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u'){
                numeroVocales+=1;
            }
        }
        System.out.println("y el numero de vocales es: " + numeroVocales);
    }

    private void punto12() {
        sc = new Scanner(System.in);
        String palabra1, palabra2;
        char caracter1, caracter2;
        int contador = 0;
        System.out.println("Ingrese una palabra");
        palabra1 = sc.next();
        System.out.println("Ingrese otra palabra");
        palabra2 = sc.next();
        List<Character> diferencias = new ArrayList<>();

        if (palabra1.equals(palabra2)) {
            System.out.println("Son iguales ");
        } else {
            for (int i = 0; i < palabra1.length(); i++) {
                caracter1 = palabra1.toLowerCase().charAt(i);
                if (!diferencias.contains(caracter1)) {
                    diferencias.add(caracter1);
                }
                for (int j = 0; j < palabra2.length(); j++) {
                    caracter2 = palabra2.toLowerCase().charAt(j);
                    if (!diferencias.contains(caracter2)) {
                        diferencias.add(caracter2);
                    }
                    if (caracter1 == caracter2) {
                        contador += 1;
                        if(diferencias.contains(caracter2)){
                            diferencias.remove(caracter2);
                        }
                    }

                }

            }
            System.out.println("Las palabras conciden " + contador);
            System.out.println("Las diferecias son " + diferencias);
            //Hacerlo arreglo con todas las letras y quitar las repetidas (funcion lamda)
        }
    }

    private void punto13(){
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss a");
        System.out.println(formateador.format(fecha));
    }

    private void punto14(){
        sc = new Scanner(System.in);
        System.out.println("Por favor introduzca un numero ");
        String nStr=sc.next();
        if(comprobarNumero(nStr)){
            int nDoubl=Integer.parseInt(nStr);
            for (int i = nDoubl;i<=1000;i=i+2){
                System.out.println(i);
            }
        }
    }

    private void punto15(){
        sc=new Scanner(System.in);
        String opcion;
        Boolean banderaSalir=true;
        String mensaje="****** GESTION CINEMATOGRAFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR";
        System.out.println(mensaje);
        while (banderaSalir){
            opcion= sc.next();
            switch (opcion){
                case "1":
                    System.out.println(mensaje);
                    break;
                case "2":
                    System.out.println(mensaje);
                    break;
                case "3":
                    System.out.println(mensaje);
                    break;
                case "4":
                    System.out.println(mensaje);
                    break;
                case "5":
                    System.out.println(mensaje);
                    break;
                case "6":
                    System.out.println(mensaje);
                    break;
                case "7":
                    System.out.println(mensaje);
                    break;
                case "8":
                    System.out.println("SALISTE ");
                    banderaSalir=false;
                    break;
                default:
                    System.out.println("OPCION INCORRECTO");
                    break;
            }
        }
    }

    private void punto16(){
        EjecutarPeronsa ejec16=new EjecutarPeronsa();
    }

    private void punto17(){
        Ejecutar17 ejec17=new Ejecutar17();
    }

    private void punto18(){
        Ejecutar18 ejecuta= new Ejecutar18();
    }


    public static boolean comprobarNumero(String n){
        if(n.matches("[+-]?\\d*(\\.\\d+)?"))
            return true;
        return false;
    }


    public static void main(String[] args) {
        Scanner sc2=new Scanner(System.in);
        Puntos puntos = new Puntos();
        int eleccion;
        boolean salida= true;

        while (salida) {
            System.out.println("***********************************************************************************************************************");
            System.out.println("Por favor ingrese un numero del 1 al 18 para proceder a ver dicho ejercicio");
            System.out.println("PRESIONE 0 PARA SALIR");
            ;
            String temporal = sc2.next();
            if (comprobarNumero(temporal)) {
                eleccion = Integer.parseInt(temporal);
            } else {
                System.out.println("Ese no es un numero ");
                continue;
            }
            switch (eleccion){
                case 1:
                    puntos.punto1();
                    break;
                case 2:
                    puntos.punto2();
                    break;
                case 3:
                    puntos.punto3();
                    break;
                case 4:
                    puntos.punto4();
                    break;
                case 5:
                    puntos.punto5();
                    break;
                case 6:
                    puntos.punto6();
                    break;
                case 7:
                    puntos.punto7();
                    break;
                case 8:
                    puntos.punto8();
                    break;
                case 9:
                    puntos.punto9();
                    break;
                case 10:
                    puntos.punto10();
                    break;
                case 11:
                    puntos.punto11();
                    break;
                case 12:
                    puntos.punto12();
                    break;
                case 13:
                    puntos.punto13();
                    break;
                case 14:
                    puntos.punto14();
                    break;
                case 15:
                    puntos.punto15();
                    break;
                case 16:
                    puntos.punto16();
                    break;
                case 17:
                    puntos.punto17();
                    break;
                case 18:
                    puntos.punto18();
                    break;
                case 0:
                    salida=false;
                    break;
                default:
                    System.out.println("Ese no es un punto ");
                    break;
            }
        }

    }


}
