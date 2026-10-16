/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_16_DESCUENTO {

   /**
    * @param args the command
    * line arguments
    */
   public static void main(String[] args) {
     Scanner captu = new Scanner(System.in); 
    int edad;
    String credencial, estudiante;
      
      System.out.println("Cual es tu edad?");
      edad = captu.nextInt();
      if (edad <= 18 ) { 
      System.out.println("Eres estudiante? Si/No");
      estudiante = captu.nextLine();
    captu.nextLine();
      System.out.println("Cuentas con credencial vigente");
      credencial = captu.nextLine();
      captu.nextLine();
      if (credencial.equals ("Si"))
         System.out.println("Puedes pasar con descuento");
      else
        System.out.println("Puedes pasar sin descuento");
      
      }
      
      if (edad >= 60 ) { 
         System.out.println("Cuenta con credencial? Si/No");
        credencial = captu.nextLine();
        captu.nextLine();
        if (credencial.equals ("Si"))
         System.out.println("Puedes pasar con descuento");
      else
        System.out.println("Puedes pasar sin descuento");
      
      }
           
      
     
    
     
      
      
      
      
   

   
   }
}
