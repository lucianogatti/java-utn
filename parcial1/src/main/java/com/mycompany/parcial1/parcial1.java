
package com.mycompany.parcial1;

import java.util.Scanner;

public class parcial1 {

    public static void main(String[] args) {
    /*Declaracion de variables*/
      int pasaje;
      double porc, precio;
    /*Leer destino*/  
    Scanner dest = new Scanner (System.in);
    System.out.println("Seleccione el destino al cual desea ir: \n"
            + "0. Resistencia \n" 
            + "1. Charata \n" 
            + "2. Las Breñas \n" 
            + "3. La Verde \n" 
            + "4. Castelli \n" 
            + "5. Miraflores \n" 
            + "6. San Martin \n" 
            + "7. Las Garzitas \n");
    pasaje = dest.nextInt();
    /*Calcular monto pasaje*/
     porc = ((2.0/10)*1.5)*pasaje;
     precio = 2.0 + porc;
    /*Imprimir monto*/
    System.out.println ("EL VALOR A PAGAR ES: \n"+"$"+precio);
    }
    }
    
    
    