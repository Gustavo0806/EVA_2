/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_continue2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_33_CONTINUE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int nume;
        int valor = 10;
        while(true){
            System.out.println("Introduce el valor");
            nume = captu.nextInt();
            captu.nextLine();
            
            if(nume == valor){
            System.out.println("ADIVINASTE, EL VALOR ES 10, GANASTE!!");
            break;
        }
        }
    }
    
}
