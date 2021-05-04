package com.mycompany.punto59;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class punto49 
{
   
   public static void main(String[] args)    
   {
        Scanner leer = new Scanner (System.in);
        boolean ciclo = true;
    
     while(ciclo = true)        
        {
            int opcion; 
            System.out.println("**SISTEMA ESCOLAR**\nQUE DESEA HACER:\n1. CARGAR DATOS DEL ESTUDIANTE\n2. CARGAR NOTAS\n3. IMPRIMIR LISTA DE ALUMNOS\n4. SALIR");
            opcion = leer.nextInt();
        
         switch (opcion)
            {
                case 1:/*Cargar datos*/
                    System.out.println("cargar 1");
                    break;
            
                case 2:
                    System.out.println("cargar 2");
                    break;
           
                case 3:
                    System.out.println("cargar 3");
                    break;
            
                case 4:
                    ciclo = false;
                    break;
           
                default:
                    System.out.println("No carga");
                    break;         
            }             
        }
    }
   
}