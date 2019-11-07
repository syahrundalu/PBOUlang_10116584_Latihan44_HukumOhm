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
 * Nama : Muhammad Syahrun Dalu
 */
public class Baterai {
    
    public float kuatArus;
    public float hambatan;

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan(){
       return kuatArus*hambatan;
    }
    
    
}
