/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3_7_shortcircuitand;

/**
 *
 * @author Asus
 */
public class Oop3_7_shortCircuitAnd {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=5,b=7;
        if((a<2) && (b++<10)) b+=2;
        System.out.println(b);
    }
}
