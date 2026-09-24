/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_elseif;
import java.util.Scanner;
/**
 *
 * @author bisonte
 */
public class EVA2_6_elseif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Numero del dia de la semana: [1 - 7]");
        dia = captu.nextInt();
        if(dia == 1){
            System.out.println("Domingo");        
        }else if(dia == 2){
            System.out.println("Lunes");        
        }else if(dia == 3){
            System.out.println("Martes");        
        }else if(dia == 4){
            System.out.println("Miercoles");        
        }else if(dia == 5){
            System.out.println("Jueves");        
        }else if(dia == 6){
            System.out.println("Viernes");        
        }else if(dia == 7){
            System.out.println("Sabado");        
    }else{
            System.out.println("Opcion no valida");
        }
    }
}
