package com.mycompany.ordenar;

import java.util.Scanner;

public class ordenar {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int arg [] = new int[4];

       System.out.print("Ingrese los 4 numeros: \n"); 
       
       for (int i = 0; i < 4; i++) { 
            arg[i]=leer.nextInt();
        }
       
        for (int j = 0; j < 4; j++) {
            int aux = 0;
            for (int i = 0; i < 3 ; i++) {
                if (arg[i] < arg[i+1]) {
                    aux = arg[i];
                    arg [i] = arg [i+1];
                    arg [i+1]=aux;
                }
            }
        }
        
        /*Mostrar numeros ordenados*/
         int k=0;
         System.out.println("Numeros ordenados: \n");
         while(k<4){    
             System.out.println(arg[k]);
             k++;
         }
    }
    
} 
