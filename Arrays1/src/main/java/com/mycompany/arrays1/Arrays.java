
package com.mycompany.arrays1;

import java.util.Scanner;

public class Arrays {
 
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
        
        int Corredores[] = new int[161];
        boolean ciclo = true;
        int opcion;
        
        while (ciclo) 
        {
            System.out.println("Seleccione que desea hacer:");
            System.out.println("Opcion 1: Cargar el tiempo de un competidor");
            System.out.println("Opcion 2: Mostrar los tiempos almacenados");
            System.out.println("Opcion 3: Salir");
            opcion = entrada.nextInt();
          
            switch (opcion)
            {
                case 1: //Cargar tiempo
                {
                    int competidor, tiempo;
                    
                    do
                    {
                        System.out.println("Ingrese el identificador del competidor (Entre 1 y 160)");
                        competidor = entrada.nextInt();
                        
                        if (competidor < 1 || competidor > 160)
                        {
                            System.out.println("Identificador invalido, Por favor reintente.");
                        }                    
                    } while (competidor < 1 || competidor > 160);
                    
                    do
                    {
                        System.out.println("Ingrese el tiempo que desea cargar (En Minutos)");
                        tiempo = entrada.nextInt();                    
                        if (tiempo < 1)
                        {
                            System.out.println("Las letras y simbolos no son validas, el tiempo debe ser mayor a 0, Por favor reintente.");
                        }              
                    } while (tiempo <1);                 
                    
                    Corredores[competidor] = tiempo;
                    break;
                    
                }
                case 2:  //Ordenar e imprimir 
                {
                    int CorredoresCopia[] = Corredores.clone();
                    int contcorredores = 0;
                    int identcorredor = 0;
                    boolean corredores = false;
                    
                    java.util.Arrays.sort(CorredoresCopia);//Ordenar arreglo
                    
                    for (int i = 1; i < CorredoresCopia.length; i++)
                    {
                        if (CorredoresCopia[i] != 0)
                        {
                            if (corredores == false)
                            {
                                corredores = true;
                                
                            }   
                            contcorredores++;
                            
                            for (int j = 1; j < Corredores.length; j++)  //Asignar tiempo
                            {
                                if (Corredores[j] == CorredoresCopia[i])
                                {
                                    identcorredor = j;
                                }
                            }
                            
                            System.out.println("Posicion: " + contcorredores + " Competidor: " + identcorredor + " Tiempo (minutos): " + CorredoresCopia[i]); //Imprimir tiempo      
                        }
                    }
                    
                    if (corredores == false)
                    {
                        System.out.println("No se cargo el tiempo de ningun jugador\n");   
                    }
                    break;    
                }
                
                case 3:
                {
                    ciclo = false;
                    break;  
                }
                
                default:
                {
                    System.out.println("Opcion invalida, por favor reintente.\n");
                    break;
                    
                } 
            }  
        }
    }  
}
