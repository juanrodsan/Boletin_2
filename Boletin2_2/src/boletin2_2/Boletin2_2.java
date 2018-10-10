/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

import java.util.Scanner;

/**
 *
 * @author jrodriguezsanjorge
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
    float temperatura=0, kelvin=0, fahrenheit=0;
    System.out.println("teclea temperatura");
    temperatura=ler.nextFloat();
    kelvin=temperatura+273;
    fahrenheit=temperatura+32;
    System.out.println("grados kelvin ="+kelvin+"\ngrados fahrenheit ="+fahrenheit);
    }
    
}
