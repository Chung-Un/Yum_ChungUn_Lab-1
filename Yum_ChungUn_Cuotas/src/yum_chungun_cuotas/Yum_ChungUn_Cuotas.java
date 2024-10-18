/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yum_chungun_cuotas;

import java.util.Scanner;

public class Yum_ChungUn_Cuotas {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       int plazo_pago,interesmensual, comision_cuota, seguro_mensual;
       double total_pagar,cuota_mensual;
       
       System.out.println("Bienvenido al programa para datos de tu prestamo\nIngrese el plazo de pago establecido(en meses):");
       plazo_pago= entrada.nextInt();
       
       System.out.println("Ingrese el interes aplicado al prestamo(porcentaje):");
       interesmensual= entrada.nextInt();
       interesmensual= interesmensual/100;
       
       
               
    }
    
}
