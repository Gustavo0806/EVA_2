/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication58;

import java.util.Scanner;
/**
 *
 * @author bisonte
 */
public class JavaApplication58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad, credencial;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Cual es tu edad? ");
        edad = captu.nextInt();
        if(edad >= 18){
        System.out.println("Tienes credencial de elector? (1 = si), (0 = no: )");
        credencial = captu.nextInt();
        if(credencial == 1){
            System.out.println("Puedes pasar");
        }else{
            System.out.println("No puedes pasar!!");
        }
        }
    }
}