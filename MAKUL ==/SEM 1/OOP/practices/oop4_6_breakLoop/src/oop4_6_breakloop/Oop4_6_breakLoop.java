/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4_6_breakloop;

/**
 *
 * @author Asus
 */
public class Oop4_6_breakLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println("iterasi ke "+i);
            i++;
            if(i>10) 
                break;
        }while(true);
    }
    
}
