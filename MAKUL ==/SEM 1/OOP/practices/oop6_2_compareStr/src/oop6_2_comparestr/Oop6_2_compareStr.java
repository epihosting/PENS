/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop6_2_comparestr;

/**
 *
 * @author Asus
 */
public class Oop6_2_compareStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "PENS";
        String str2 = "pens";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
