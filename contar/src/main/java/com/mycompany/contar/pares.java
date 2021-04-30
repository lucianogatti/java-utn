/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.contar;

import java.util.Scanner;

public class pares {

    public static void main(String[] args) {
        int a;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: \n");
        a = sc.nextInt();
        System.out.print("NUMEROS PARES: \n");
       if (a<51){
        for (int i = 51; i >= a; i--) {
           if (i%2==0){
               System.out.print(i+"\n"); 
               b++;
           }
       } 
       }else{
           for (int i = 51; i <= a; i++) {
           if (i%2==0){
               System.out.print(i+"\n"); 
               b++;
           }
       }
       }  
        System.out.print("CANTIDAD DE NÚMEROS PARES: \n"+b);
    }  
}  

