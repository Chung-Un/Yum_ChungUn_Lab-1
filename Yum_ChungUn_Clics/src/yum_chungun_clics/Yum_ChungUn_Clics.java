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
       int clics; 
       double costo_promedio,costo_total,iva;
       double costo_ind=0;
       
       System.out.println("Ingrese la cantidad de clics en su anuncio: ");
       clics= entrada.nextInt();
      
      switch (clics){
      
       case 1 : 
       if(clics<=20){
       costo_ind= 0.80;
      }
       case 2: 
        if(clics>20 || clics<=60){
         costo_ind=0.30;
      }
      
       case 3:
         if(clics>60){
          costo_ind=0.25;
      }
              }
      costo_total = clics*costo_ind;
      costo_promedio = costo_total/clics;
      
      System.out.println("El costo promedio de sus clics es: " + costo_promedio + "\nEl costo total sin impuestos es: "+costo_total);
      
      iva= (costo_total*0.16)+(costo_total);
      
      System.out.println("Costo total es "+iva);
      
      }
      
      }
