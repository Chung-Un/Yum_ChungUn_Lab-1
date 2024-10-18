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
       double costo_promedio,costo_ind,isv;
       
       System.out.println("Ingrese la cantidad de clics en su anuncio: ");
       clics= entrada.nextInt();
       
      if(clics<=20){
       costo_ind= 0.80;
      }
      if (clics>20 || clics<=60){
         costo_ind=0.30;
      }
      
      if(clics>60){
          costo_ind=0.25;
      }
      }
      
    }
    
}
