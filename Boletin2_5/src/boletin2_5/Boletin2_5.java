/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author jrodriguezsanjorge
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    float S_fixo=0,Comisión=0, Quilometraxe=0, Dietas=0, Km=0, Días=0, SoldoT=0, IRPF=0, Seguridad_S=36, SoldoF=0;
    System.out.println("teclea el sueldo") ;
    S_fixo=ler.nextInt();
    Comisión= S_fixo*5/100;
    System.out.println("teclea los km");
    Km=ler.nextInt();
    Quilometraxe= 2*Km;
    System.out.println("teclea los días");
    Días=ler.nextInt();
    Dietas=Días*30;
    SoldoT=(S_fixo-Comisión-Quilometraxe-Dietas);
    IRPF=SoldoT*18/100;
    SoldoF=SoldoT-IRPF-Seguridad_S;
    System.out.println("Sueldo final= "+SoldoF);
    }
    
}
