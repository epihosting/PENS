/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop6_tgs2_konversi;

/**
 *
 * @author Asus
 */
public class Oop6_tgs2_konversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c1 = 'P', c2 = 'E', c3 = 'N', c4 = 'S';
        String slmt = "Selamat Datang di PENS";
        System.out.println("Awal \t= " + slmt);
        System.out.println("Kapital = " + slmt.toLowerCase());
        System.out.println("Kecil \t= " + slmt.toUpperCase());
        System.out.println("Panjang = " + slmt.length());
        
        for(int i=0; i<slmt.length(); i++){
            if(slmt.charAt(i) == c1 && 
                slmt.charAt(i+1) == c2 && 
                slmt.charAt(i+2) == c3 && 
                slmt.charAt(i+3) == c4) {
                System.out.println("Index kata PENS = " + i);
                break;
            }   
        }
    }
    
}
