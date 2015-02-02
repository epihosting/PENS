/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4_lth3_fibonacci;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Oop4_lth3_fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan berapa deret fibonacci ? ");
        int n = s.nextInt();
        
        System.out.print(n+" deret Fibonacci = ");
        for(int i=1;i<=n;i++)
            System.out.print(createfibo(i) + " ");
        System.out.println();
    }
    private static int createfibo(int n){
        int f;
        if(n==1 || n==2)
            f=1;
        else
            f = createfibo(n-1) + createfibo(n-2);
        return f;
    }
}
