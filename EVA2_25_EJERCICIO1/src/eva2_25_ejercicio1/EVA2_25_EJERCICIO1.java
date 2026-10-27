/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author elgus
 */
public class EVA2_25_EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner catu = new Scanner(System.in);
    int ni, nf;
    System.out.println("Coloca tu numeor incial");
    ni = catu.nextInt();
    catu.nextLine();
     System.out.println("Coloca tu numeor final");
    nf = catu.nextInt();
    catu.nextLine();
    for (int i = ni; i <= nf; i++){
        System.out.println(i);
    }
    
 
    }
    
}
