/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop5_lth3_prima;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Oop5_lth3_prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan bilangan? ");
        
        int bil = masuk.nextInt();
        boolean bprima = true;
        for (int i = 2; i < bil; i++) {
            if ((bil % i) == 0) {
                bprima = false;
                break;
            }
        }
        if (bprima) {
            System.out.println(bil + " adalah bilangan prima ");
        } else {
            System.out.println(bil + " bukan bilangan prima ");
        }
    }

}
