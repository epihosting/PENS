/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3_9_shortcircuitor;

/**
 *
 * @author Asus
 */
public class Oop3_9_shortCircuitOr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=5,b=7;
        // F  ||  T => T
        if((a<2) || (b++<10)) 
            b+=2;  // executed
        System.out.println(b);
    }    
}
