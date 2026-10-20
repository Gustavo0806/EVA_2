/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_17_COVID {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
  
         Scanner captu = new Scanner(System.in);

        int edad;
        double peso, estatura, imc;
        String enfermedad;

        System.out.println("=== PERSONA DE RIESGO POR COVID-19 ===");

        // Pedir la edad
        System.out.print("Ingresa tu edad: ");
        edad = captu.nextInt();

        // Pedir el peso
        System.out.print("Ingresa tu peso en kilogramos: ");
        peso = captu.nextDouble();

        // Pedir la estatura
        System.out.print("Ingresa tu estatura en metros: ");
        estatura = captu.nextDouble();

        // Calcular el indice de masa corporal
        imc = peso / (estatura * estatura);

        // Preguntar si tiene una enfermedad cronica
        System.out.print("¿Tienes alguna enfermedad cronica? (si/no): ");
        enfermedad = captu.next();

        // Mostrar el IMC
        System.out.printf("Tu indice de masa corporal es: %.2f%n", imc);

        // Evaluar si la persona presenta riesgo
        if (edad > 65 || imc >= 25 || enfermedad.equalsIgnoreCase("si")) {
            System.out.println("La persona PRESENTA RIESGO por COVID-19.");
        } else {
            System.out.println("La persona NO PRESENTA RIESGO segun los criterios indicados.");
        }
         
        
            
         
      
      
   }
   
   
}
