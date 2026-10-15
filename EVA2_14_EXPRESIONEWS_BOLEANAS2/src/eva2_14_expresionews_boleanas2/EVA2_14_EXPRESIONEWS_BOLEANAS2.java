/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresionews_boleanas2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_14_EXPRESIONEWS_BOLEANAS2 {

   /**
    * @param args the command
    * line arguments
    */
   public static void main(String[] args) {
   //BECA
   //PROMEDIO
   //Esta en equipo representavio
   int promedio;
     String equipo;
   Scanner captu = new Scanner(System.in);
   System.out.println("Estas en equipo representatuivo) Si/No");
   equipo = captu.nextLine();
   System.out.println("Tienes buen promedio?");
   promedio = captu.nextInt();
   if (equipo.equals ("Si") || promedio >= 95)
    System.out.println("Tienes Beca");
    else 
    System.out.println("No tienes beca");
           
            
    
   
  
   
   
          
   
          
 
   
   }
   
}
