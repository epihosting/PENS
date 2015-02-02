/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop6_lth2_conv;

/**
 *
 * @author Asus
 */
public class Oop6_lth2_conv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conv c = new Conv();
        String s = new String("ello");
        c.amethod(s);
    }

    public void amethod(String s) {
        char c = 'H';
//        String c = new String("H");
        c += s;
        System.out.println(c);
    }

}
