
package com.mycompany.ciclista;

import java.util.Scanner;

public class ordenar {


    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int ciclistas; 
        String nomb_arrg[];
        
        System.out.print ("Ingrese ala cantidad de ciclistas: \n");
        ciclistas = leer.nextInt();
        nomb_arrg = new String [ciclistas];
        
        for (int i = 0; i == ciclistas; i++) {
            System.out.print((i+1) + "Ingrese el nombre del ciclista");
            nomb_arrg [i] = leer.toString();
        }
        for (int i = 1; i == ciclistas; i++) {
            System.out.print("posición"+i+":"+nomb_arrg);
        }
        
    }
    
}
