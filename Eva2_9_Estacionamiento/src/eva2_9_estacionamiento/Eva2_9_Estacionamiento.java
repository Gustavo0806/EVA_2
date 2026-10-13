/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_9_Estacionamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int horas, pre1, pre2, pre3, pre4 = 150;
        Scanner captu = new Scanner(System.in);
      System.out.print("Hola, bienvenido a el estacionamiento, Inserte la cantidad de horas que desea pagar:");
      
      horas = captu.nextInt();
      pre1 = horas* 25;
      pre2 = horas* 20;
      pre3 = horas* 15;
      
      if (horas >10) {
         
          System.out.println(pre4);
      }
      else if(horas == 10) {
           System.out.println("Tu cobro es de: ");
          System.out.println(pre3);
          
      }      
       else if(horas == 9) {
            System.out.print("Tu cobro es de: ");
          System.out.println(pre3);
          
      }      
       else if(horas == 8) {
            System.out.print("Tu cobro es de: ");
          System.out.println(pre3);
          
      }      
       else if(horas == 7) {
            System.out.print("Tu cobro es de: ");
          System.out.println(pre3);
          
      }      
       else if(horas == 6) {
            System.out.print("Tu cobro es de: ");
          System.out.println(pre3);
          
      }  
      else if(horas == 5) {
           System.out.print("Tu cobro es de: ");
          System.out.println(pre2);
          
      } 
      else if(horas == 4) {
           System.out.print("Tu cobro es de: ");
          System.out.println(pre2);
          
      } 
      else if(horas == 3) {
           System.out.print("Tu cobro es de: ");
          System.out.println(pre2);
          
      } 
      else if(horas == 2) {
           System.out.print("Tu cobro es de: ");
          System.out.println(pre1);
          
      } 
      else if(horas == 1) {
           System.out.print("Tu cobro es de: ");
          System.out.println(pre1);
          
      }  
    }
    
}
