/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author jrodriguezsanjorge
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    float b100=0, b20=0, b5=0, m1=0, D=0;
    System.out.println("teclea los billetes de 100 introducidos");
    b100=ler.nextFloat();
    System.out.println("teclea los billetes de 20 introducidos");
    b20=ler.nextFloat() ;
    System.out.println("teclea los billetes de 5 introducidos");
    b5=ler.nextFloat();
    System.out.println("teclea las monedas de 1 introducidas");
    m1=ler.nextFloat();
    D=b100*100+b20*20+b5*5+m1;
    System.out.println("dinero ="+D+" euros");
    }
    
}
