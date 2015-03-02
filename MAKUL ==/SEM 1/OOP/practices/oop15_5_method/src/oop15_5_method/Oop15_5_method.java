/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop15_5_method;

/**
 *
 * @author Asus
 */
public class Oop15_5_method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Integer.rotateLeft(3, 1));
        System.out.println(Integer.rotateLeft(5, 2));
        System.out.println(Integer.rotateRight(20, 1));
        System.out.println(Integer.rotateRight(32, 1));
        System.out.println(Integer.reverse(20));
        System.out.println(Integer.highestOneBit(20));
        System.out.println(Integer.lowestOneBit(20));
        System.out.println(Integer.bitCount(20));
        System.out.println(Integer.numberOfLeadingZeros(32));
        System.out.println(Integer.numberOfTrailingZeros(32));
    }

}
