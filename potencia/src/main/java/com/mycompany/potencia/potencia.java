package com.mycompany.potencia;

import javax.swing.JOptionPane;

public class potencia {

    public static void main(String[] args) {
     int a, b;
     
     a = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese el valor de la base"));
     b = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese el valor del exponente"));
    
        if (a == 0) {
            
            if (b > 0) {
                JOptionPane.showMessageDialog(null, "0");
            }else{
                JOptionPane.showMessageDialog(null, "MATH ERROR");
            }
            
        }else{ 
            if (b==0) {
            JOptionPane.showMessageDialog(null, "1.0");}
    
            else {
            JOptionPane.showMessageDialog(null, Math.pow(a, b));
        }
        
        }
    }
    
}   
    
    

