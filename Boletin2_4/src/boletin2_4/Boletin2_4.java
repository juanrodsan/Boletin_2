/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author jrodriguezsanjorge
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    int euros=0,x=0,z=0,k=0,y=0,j=0,b100=0,b20=0,b5=0,m1=0;
    System.out.println("teclea los euros");
    euros=ler.nextInt();
    x=euros/100;
    b100=x;
    z=(euros-b100*100)/20;
    b20=z;
    k=(euros-b100*100-b20*20)/5;
    b5=k;
    j=(euros-b100*100-b20*20-b5*5)/1;
    m1=j;
    System.out.println("\n billetes de 100 = "+b100+"\n billetes de 20 = "+b20+"\n billetes de 5 = "+b5+"\n monedas de 1 = "+m1);
    }
    
}
