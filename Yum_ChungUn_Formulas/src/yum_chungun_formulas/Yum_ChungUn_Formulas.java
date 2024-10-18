/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yum_chungun_formulas;

import java.util.Scanner;


public class Yum_ChungUn_Formulas {

    public static void main(String[] args) {
      
        Scanner entrada = new Scanner (System.in);
        double numerador1,denominador1,numerador2,denominador2, resultado;
        
        System.out.println("Ejercicio A\nIngrese el primer numerador de su operacion: ");
        numerador1 = entrada.nextDouble();
        
        System.out.println("Ingrese el primer denominador de su operacion: ");
        denominador1= entrada.nextDouble();
        
        System.out.println("Ingrese el segundo numerador de su operacion: ");
        numerador2= entrada.nextDouble();
        
        System.out.println("Ingrese el segundo denomindor de su operacion: ");
        denominador2= entrada.nextDouble();
        
        resultado = (numerador1/denominador1) + (numerador2/denominador2);
        
        System.out.println("Su resultado es: "+ resultado);
        
    }
    
}
