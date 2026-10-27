/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author elgus
 */
public class EVA2_25_EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Scanner captu = new Scanner(System.in);
     
     System.out.println("Numero:");
     int n = captu.nextInt();
     captu.nextLine();
     
     for(int i = 1; i <= n; i++)  {
        for (int j = 1; j <= i; j++) 
         System.out.print("*");
        System.out.println();
     }
     
     
             
        
    
    }
    
}
