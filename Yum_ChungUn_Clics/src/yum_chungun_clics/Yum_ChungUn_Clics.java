/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yum_chungun_clics;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Yum_ChungUn_Clics {

    
    public static void main(String[] args) {
       Scanner entrada= new Scanner (System.in);
       int clicstotal; 
       double costo_promedio,costo_total,iva,clics1,clics2,clics3;
       
       
       System.out.println("Ingrese la cantidad de clics en su anuncio: ");
       clicstotal= entrada.nextInt();
       
       System.out.println("Ingrese la cantidad de clics en su primer grupo: ");
       clics1 = entrada.nextDouble();
       clics1 = clics1*0.30;
       
       System.out.println("Ingrese la cantidad de clics en su segundo grupo: ");
       clics2 = entrada.nextDouble();
       clics2= clics2*0.25;
       
       System.out.println("Ingrese la cantidad de clics en su tercer grupo: ");
       clics3 = entrada.nextDouble();
       clics3= clics3*0.80;
       
      costo_total= clics1+clics2+clics3;
      costo_promedio = costo_total/clicstotal;
      
      System.out.println("El costo promedio de sus clics es: $" + costo_promedio + "\nEl costo total sin impuestos es: $"+costo_total);
      
      iva= (costo_total*0.16)+(costo_total);
      
      System.out.println("Costo total es con isv es $"+iva);
      
      }
      
       } 
