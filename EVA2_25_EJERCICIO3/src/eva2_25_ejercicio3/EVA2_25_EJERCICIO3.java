/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_25_EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un numero");
      int n = sc.nextInt();
      sc.nextLine();
      for (int i = 1; i <=10; i++) { 
          System.out.println(n + "x" + i + "=" + (n * i));
      }   
    
    }
    
}
