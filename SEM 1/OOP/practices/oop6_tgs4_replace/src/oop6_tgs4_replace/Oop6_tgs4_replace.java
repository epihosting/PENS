/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop6_tgs4_replace;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Oop6_tgs4_replace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("String nama pertama : ");
        String nama1 = s.nextLine();
        System.out.print("String nama kedua : ");
        String nama2 = s.nextLine();

        String[] splitNama1 = nama1.split("\\s+");
        String[] splitNama2 = nama2.split("\\s+");
        
        System.out.println("String nama pertama : " + splitNama1[0] + " " + splitNama2[1]);
        System.out.println("String nama kedua : " + splitNama2[0] + " " + splitNama1[1]);
   
    }

}
