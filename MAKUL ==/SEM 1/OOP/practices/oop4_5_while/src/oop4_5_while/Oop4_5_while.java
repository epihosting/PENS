/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4_5_while;

/**
 *
 * @author Asus
 */
public class Oop4_5_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 1;
        int i = 0;
        while (i < 9) {
            int j = 0;
            while (j < i + 1) {
                System.out.print(count);
                j++;
            }count++;
            System.out.println();
            i++;
        }
    }
}
