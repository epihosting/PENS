/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop6_3_concat;

/**
 *
 * @author Asus
 */
public class Oop6_3_concat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1="Monas";
        System.out.println(str1);
        
        String str2="monas";
        System.out.println(str2);
        
        String str3=str1+str2;
        System.out.println(str3);
        
        String str4=str1.concat(str2);
        System.out.println(str4);
        
        str1+=str2;
        System.out.println(str1);
    }
    
}
