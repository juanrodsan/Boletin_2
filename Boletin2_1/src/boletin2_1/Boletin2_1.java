/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;

import java.util.Scanner;

/**
 *
 * @author jrodriguezsanjorge
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
    float precio=0,tarifa=0,porcentaje=0;
    System.out.println("teclea el precio");
    precio=ler.nextFloat();
    System.out.println("teclea la tarifa");
    tarifa=ler.nextFloat();
    porcentaje=(precio-tarifa)*100/precio;
    System.out.println("el porcentaje es"+porcentaje);
    }
    
}
