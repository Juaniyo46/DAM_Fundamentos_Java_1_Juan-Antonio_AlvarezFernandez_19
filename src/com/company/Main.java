package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá una nota entre 0 y 10 y la mostrara en letras");

        //Declaramos las variables de la fecha y las pedimos por consola.
        System.out.println("Introduzca una nota entre 0 y 10");
        int nota = sc.nextInt();

        //Creamos un String vacío para introducir el valor de switch
        String notaLetras = new String();

        //Se realizan las comprobaciones para adjudicar cada nota a una palabra
        switch (nota) {
            case 0:
                notaLetras="Cero";
                break;
            case 1:
                notaLetras="Uno";
                break;
            case 2:
                notaLetras="Dos";
                break;
            case 3:
                notaLetras="Tres";
                break;
            case 4:
                notaLetras="Cuatro";
                break;
            case 5:
                notaLetras="Cinco";
                break;
            case 6:
                notaLetras="Seis";
                break;
            case 7:
                notaLetras="Siete";
                break;
            case 8:
                notaLetras="Ocho";
                break;
            case 9:
                notaLetras="Nueve";
                break;
            case 10:
                notaLetras="Diez";
                break;
        }
        //Se muestra el resultado
        System.out.println("La nota introducida es: "+notaLetras);


    }

}
