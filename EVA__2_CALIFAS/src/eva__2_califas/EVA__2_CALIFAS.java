/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva__2_califas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA__2_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               double prom;
        Scanner captu = new Scanner(System.in);
       System.out.println("Hola bienvenido, para calcular su promedio introduzcalo porfavor: ");
       prom = captu.nextDouble();
      
       if (prom < 0 ) { 
           System.out.println("Dato no vaido");
       }
       else if (prom > 100 ) {
       System.out.println("Dato no valido ");
       }  
       else if (prom > 90 ) {
       System.out.println("sOBRESALIENTE ");
       }  
        else if (prom > 80 ) {
       System.out.println("SUFICIENTE ");
       } 
        else if (prom > 70 ) {
       System.out.println("ACEPTABLE ");
       } 
        else if (prom < 70 ) {
       System.out.println("INSUFICIENTE ");
       } 
       
    }
    
}
