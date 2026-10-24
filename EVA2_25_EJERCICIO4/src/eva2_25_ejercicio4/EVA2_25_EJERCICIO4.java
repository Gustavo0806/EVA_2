/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_25_EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero base");
        int n = sc.nextInt(); 
        sc.nextLine();
         System.out.println("Numero exponencial");
      int e = sc.nextInt();
      sc.nextLine();
      int p = 1;
      for(int i = 1; i <= e; i++) 
           p = p * e;
      System.out.println(n + "elevado a la" + e + "=" + p);
      
    }
    
}
