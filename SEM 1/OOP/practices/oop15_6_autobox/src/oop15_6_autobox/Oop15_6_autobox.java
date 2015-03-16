/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop15_6_autobox;

/**
 *
 * @author Asus
 */
public class Oop15_6_autobox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        Integer j;
        i = 1;
        j = new Integer(2);
        i = j.intValue();
        j = new Integer(i);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

}
