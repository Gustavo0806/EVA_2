    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_20_EJERCICIO_SWITCH {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
       int num1, num2, operacion;
    System.out.println("Valor 1: ");
    num1 =  captu.nextInt();
    
    System.out.println("Valor2: ");
    num2 = captu.nextInt();
    
    System.out.println("OPERACIONES: ");
    System.out.println("1- (suma)");
    System.out.println("2- (resta)");
    System.out.println("3- (multiplicacion)");
    System.out.println("4- (division)");
    System.out.println("Elige una operacion: ");
    operacion = captu.nextInt();
    
    switch (operacion){
        case 1:
            System.out.println("RESULTADO: " + (num1 + num2));
            break;
            
        case 2:
            System.out.println("RESULTADO: " + (num1 - num2));
            break;
            
        case 3:
            System.out.println("RESULTADO: " + (num1 * num2));
            break;
            
        case 4:
            System.out.println("RESULTADO: " + (num1 / num2));
            break;
            
            default:
                    System.out.println("OPERACION INVLAIDA");
    }
    }
}
