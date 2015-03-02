/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop15_4_konversiobj;

/**
 *
 * @author Asus
 */
public class Oop15_4_konversiObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer i = 7;
        Long l = 345L;

        i = l.intValue();
        System.out.println("Nilai pada Integer = " + i);

        l = i.longValue();
        System.out.println("Nilai pada Long = " + l);
    }

}
