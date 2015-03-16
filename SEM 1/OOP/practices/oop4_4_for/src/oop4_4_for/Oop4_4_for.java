/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4_4_for;

/**
 *
 * @author Asus
 */
public class Oop4_4_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 9; i++) {
            for(int j=0; j<i+1; j++){
                System.out.print(count);
            }count++;
            System.out.println();
        }
    }

}
