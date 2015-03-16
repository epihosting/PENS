/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop5_tgs2_karakter;

/**
 *
 * @author Asus
 */
public class Oop5_tgs2_karakter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] matKul = {'p', 'e', 'm', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'n', 'b', 'e', 'r', 'b', 'a', 's', 'i', 's', 'o', 'b', 'y', 'e', 'k'};
        int j = 0;
        for (int i = 0; i < matKul.length; i++) {
            if (matKul[i] == 'a') {
                j++;
            }
        }System.out.println("Jumlah Huruf a = " + j);
    }

}
