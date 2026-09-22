/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_eva_1_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_EVA_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int edad;
        Scanner captu = new Scanner(System.in);
       System.out.println("Cual es tu edad");
         edad = captu.nextInt();
       if (edad >= 18) {
       System.out.println("Puedes entrar");
    }  else {
    System.out.print("No puedes entrar"); }
    
    }

    
}
