/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop6_tg3_replacechar;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Oop6_tg3_replaceChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan kata yang mau ditukar : ");
        String masukan = s.nextLine();
        System.out.println("String masukan : " + masukan);
        String hasil = "String hasil : ";

        for (int i = 0; i < masukan.length(); i++) {
            if (i == 0) {
                hasil += masukan.charAt(masukan.length() - 1);
            } else if (i == (masukan.length() - 1)) {
                hasil += masukan.charAt(0);
            } else {
                hasil += masukan.charAt(i);
            }
        }
        System.out.println(hasil);
    }

}
