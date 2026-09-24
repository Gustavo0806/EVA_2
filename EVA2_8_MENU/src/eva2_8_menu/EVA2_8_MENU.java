/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_menu;
import java.util.Scanner;
/**
 *
 * @author bisonte
 */
public class EVA2_8_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner captu = new Scanner(System.in);
        System.out.println(">>>MENU RESTAURANTE LA CUCHARA CROCANTE<<<");
        System.out.println("1. Ventas");
        System.out.println("2. Proovedores");
        System.out.println("3. Empleados");
        System.out.println("4. Invenrario");
        System.out.println("5. Salir");
        System.out.println("Selecciona una opcion:");
        opcion = captu.nextInt();
        if(opcion == 1){
            System.out.println("Menu de ventas");
        }else if(opcion == 2){
            System.out.println("Menu de proovedaores");
        }else if(opcion == 3){
            System.out.println("Menu de Empleados");
        }else if(opcion == 4){
            System.out.println("Menu de Inventario");
        }else if(opcion == 5){
            System.out.println("Menu de Salir");
        }
        
    }
    
}
