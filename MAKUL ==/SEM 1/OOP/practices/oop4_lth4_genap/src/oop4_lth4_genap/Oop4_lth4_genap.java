/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4_lth4_genap;

/**
 *
 * @author Asus
 */
public class Oop4_lth4_genap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int g;    
        for(int i=2;i<=20;i++){
            if(i%2==0){
                if(i%6==0)continue;
                    System.out.print(i+" ");
            }
        }System.out.println();
    }
}
