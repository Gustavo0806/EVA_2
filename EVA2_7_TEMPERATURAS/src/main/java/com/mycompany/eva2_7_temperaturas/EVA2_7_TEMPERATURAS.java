/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_temperaturas;

import java.util.Scanner;

/**
 *
 * @author elgus
 */
public class EVA2_7_TEMPERATURAS {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int temp;
        System.out.println("Cual es la temperratura? ");
        temp = captu.nextInt();
        if (temp >= 30) {
            System.out.println("Caluroso");
    }
        else if (temp >= 20) {
            System.out.println("Agradable");
        }
        else if (temp >= 10) {
            System.out.println("Frio");
        }
        else if (temp < 10) {
            System.out.println("Congelado");
        }
}
}