/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_dowhile;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_28_DOWHILE {
   
static final String USUARIO = "admin";
static final String CONTRA = "1234";

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner captu = new Scanner(System.in);
      String usu, contra;
      
      do{
         System.out.println("Usuario: ");
         usu = captu.nextLine();
         System.out.println("Contraseña: ");
         contra = captu.nextLine();
      }while (!(usu.equals(USUARIO)) || !(contra.equals(CONTRA)));
      System.out.println("ACCESO CONCEDIDO");
   }
   
}
