/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4_tgs1_determinan;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Oop4_tgs1_determinan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int a, b, c;
        double d,x1,x2;
        System.out.print("Masukan bilangan A:");
        a = masuk.nextInt();
        System.out.print("Masukan bilangan B:");
        b = masuk.nextInt();
        System.out.print("Masukan bilangan C:");
        c = masuk.nextInt();
        
        d = Math.pow(b, 2) - (4 * a * c); // determinan 
        x2=(-b-Math.pow(d,0.5))/2*a; //akar 1
        x1=Math.pow(d,0.5);
        System.out.println("Nilai D= " + d);
        if (d == 0) {
            System.out.println("Akar Kembar");
        }else if (d > 0) {
            System.out.println("Akar Beda");
        }else if (d < 0) {
            System.out.println("Akar Imajiner");
        }
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }

}
