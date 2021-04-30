package com.mycompany.fact;

import java.util.Scanner;


public class factoria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int  a, fact = 1;
        
        System.out.println("INGRESE UN NÚMERO");
        a = leer.nextInt();

        for (int i = a; i > 0; i--) {  
        fact = i * fact;
        }     
        System.out.println("El resultado es: " + fact);
    }
    
}
