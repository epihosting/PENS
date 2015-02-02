/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3_6_booleanand;

/**
 *
 * @author Asus
 */
public class Oop3_6_booleanAnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=5,b=7;
        // F  & (8<10)T = F
        if((a<2)&(b++<10))
            b+=2;
        System.out.println(b);
        // TODO code application logic here
    }
    
}
