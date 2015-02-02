/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4_lth2_faktorial;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Oop4_lth2_faktorial {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan bilangan : ");
        int jum = in.nextInt();
        int a = 1;
        for (int x = jum; x > 0; x--) {
            a *= x;
        }System.out.println(jum + "!=" + a);
    }
}
