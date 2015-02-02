/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4_lth1_pengecekan;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Oop4_lth1_pengecekan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            String inputan = in.next();
            char[] input = inputan.toCharArray();
            for (char kata : input) {
                switch(kata){
                    case '':
                        break;
                }
                System.out.println((int) kata);
            }
        } while (true);
    }
}
