/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan44_hukumohm;

import java.util.Scanner;


/**
 *
 * @author 
 * NIM : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan44_HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Baterai baterai = new Baterai();
        
        
        System.out.println("====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat"
                + " \nPenghantar akan berbanding lurus dengan beda potensial"
                + "\npada ujung-ujung kawat -penghantar tersebut asalkan suhu"
                + "\nkawat dijaga konstan");
        System.out.println("");
        System.out.print("Kuat arus(ampere) : ");
        baterai.kuatArus = scan.nextFloat(); 
        System.out.print("Hambatan(ohm) : ");
        baterai.hambatan = scan.nextFloat();
        System.out.println("Hasil Tegangan : "+baterai.hitungTegangan()+" volt");
        
    }
    
}
