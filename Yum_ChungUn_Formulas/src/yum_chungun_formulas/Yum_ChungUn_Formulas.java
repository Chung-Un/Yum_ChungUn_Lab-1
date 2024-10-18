/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yum_chungun_formulas;

import java.util.Scanner;


public class Yum_ChungUn_Formulas {

    public static void main(String[] args) {
      
        Scanner entrada = new Scanner (System.in);
        double numerador1,denominador1,numerador2,denominador2, resultado, variablex,variabley,resultado2;
        
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
        
        System.out.println("Ejercicio B\nIngrese el variable X de su operacion: ");
        variablex= entrada.nextDouble();
        
        System.out.println("Ingrese el variable Y de su operacion: ");
        variabley= entrada.nextDouble();
        
        resultado2 =(1/variablex-5)-(3*variablex*variabley/4);
        
        System.out.println("Su resultado es: " + resultado2);
        
    }
    
}
