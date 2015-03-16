/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop15_3_binerdll;

/**
 *
 * @author Asus
 */
public class Oop15_3_binerdll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------");
        
        Integer i1 = new Integer(345);
        System.out.println("nilai int = " + i1);
        System.out.println("bil binary = " + Integer.toBinaryString(i1));
        System.out.println("bil hexa = " + Integer.toHexString(i1));
        System.out.println("bil oktal = " + Integer.toOctalString(i1));

        System.out.println("--------");

        Integer i2 = new Integer(675);
        System.out.println("nilai int = " + i2);
        System.out.println("bil binary = " + Integer.toString(i2, 2));
        System.out.println("bil hexa = " + Integer.toString(i2, 8));
        System.out.println("bil oktal = " + Integer.toString(i2, 16));
    }
}
