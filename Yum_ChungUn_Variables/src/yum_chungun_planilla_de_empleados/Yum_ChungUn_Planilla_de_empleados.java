/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yum_chungun_planilla_de_empleados;

import java.util.Scanner;

public class Yum_ChungUn_Planilla_de_empleados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre_empleado;
        int horas_mensuales;
        float tarifa_por_hora;
        double salario_mensual;
        
        System.out.println("**Programa para la realizacion de boleta del empleado/nIngrese su nombre completo: ");
        nombre_empleado= entrada.nextLine();
        
        System.out.println("Ingrese su cantidad de horas mensuales: ");
        horas_mensuales= entrada.nextInt();
        
        System.out.println("Ingrese su salario por hora: Lps. ");
        tarifa_por_hora = entrada.nextInt();
        
        
    }
    
}
