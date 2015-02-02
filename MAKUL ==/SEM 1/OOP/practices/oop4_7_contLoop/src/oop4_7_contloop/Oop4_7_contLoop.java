/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4_7_contloop;

/**
 *
 * @author Asus
 */
public class Oop4_7_contLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        for(a=0;a<2;a++){ //0,1
            for(b=0;b<3;b++){ // 0,1,2
                if(b==1) continue;
                System.out.println("a = " +a+"; b = "+b);
            }
        }
    }
}
