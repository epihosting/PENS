/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop6_tgs4_change;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Oop6_tgs4_change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("String nama pertama : ");
        String nm1 = inp.nextLine();
        System.out.print("String nama kedua : ");
        String nm2 = inp.nextLine();

        String[] pecahNm1 = nm1.split("\\s+");
        String[] pecahNm2 = nm2.split("\\s+");

        System.out.println
        
        ("String nama pertama : " + pecahNm1[0] + " " + pecahNm2[1]);
        System.out.println("String nama kedua : " + pecahNm2[0] + " " + pecahNm1[1]);
    }

}
