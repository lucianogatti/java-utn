
package com.mycompany.valormayor;

import java.util.Scanner;

public class valormayor {
     static int mayor,acum;
     static Scanner entrada= new Scanner(System.in);

    public static void main(String[] args) {
        /*Ingreso de numeros y comprobación*/
        System.out.println("Ingrese el primer numero: ");
        acum=entrada.nextInt();
        mayor=acum;
        System.out.println("Segundo numero: ");
        entradaComprobada();
        System.out.println("Tercer numero: ");
        entradaComprobada();
        System.out.println("Cuarto numero: ");
        entradaComprobada();
        /*Mostrar mayor por pantalla*/
        System.out.println("El mayor es: \n"+ mayor);
            
    }
    /*Comprobar entrada*/
    static void entradaComprobada () {
        acum=entrada.nextInt();
        if (acum>mayor) mayor=acum;
    }
}
       
