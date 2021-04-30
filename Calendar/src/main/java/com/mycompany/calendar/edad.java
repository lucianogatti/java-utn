package com.mycompany.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;



public class edad {

    public static void main(String[] args) {
      Scanner sca = new Scanner (System.in);
      Calendar cal = new GregorianCalendar();
      int diaactual=cal.get(Calendar.DAY_OF_MONTH), mesactual=cal.get(Calendar.MONTH), anoactual=cal.get(Calendar.YEAR);
      int dia, mes, ano;
      System.out.print("Ingrese el dia de su nacimiento");
      dia = sca.nextInt();
      System.out.print("Ingrese el mes de su nacimiento");
      mes = sca.nextInt();
      System.out.print("Ingrese el año de su nacimiento");
      ano = sca.nextInt();
      
      int dia_r= Math.abs (diaactual - dia);
      int mes_r= Math.abs (mesactual - mes);
      int ano_r= Math.abs (anoactual - ano);
    
        if (ano == anoactual) {
            if (mes < mesactual) {
             System.out.print("Tiene: "+mes_r+" y "+dia_r+" dias");   
            }else{
            System.out.print("Tiene: "+dia_r+" dias");}
        }else{
         System.out.print("Tiene: "+ano_r+" años");
        }
    
    }
    }
    
