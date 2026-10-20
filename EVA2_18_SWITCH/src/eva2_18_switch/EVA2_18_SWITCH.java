/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_switch;

import java.util.Scanner;



/**
 *
 * @author Usuario
 */
public class EVA2_18_SWITCH {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {

      Scanner captu = new Scanner (System.in);
      
     System.out.println ("Elgie el dia de la semana (1-7)");
  int dia = captu.nextInt();
  switch (dia) {
     case 1:
        System.out.println("Domingo");
        break;
         case 2:
        System.out.println("Lunes");
        break;
         case 3:
        System.out.println("Martes");
        break;
         case 4:
        System.out.println("Miercoles");
        break;
         case 5:
        System.out.println("Jueves");
        break;
         case 6:
        System.out.println("Viernes");
        break;
         case 7:
        System.out.println("Sabado");
        break;
         default:
            System.out.println("Dia no valido");
            
        
        
        
  }
     
      
      
     
   }
   
   
   }
   

