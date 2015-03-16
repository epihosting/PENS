/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4_9_contbreak;

/**
 *
 * @author Asus
 */
public class Oop4_9_contbreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        mulai:
        for(a=0;a<2;b++){
            for(b=0;b<3;b++){
                if(b==1) continue mulai;
                System.out.println("a="+a+"; b="+b);
            }
        }
    }
    
}
