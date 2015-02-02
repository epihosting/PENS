/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop6_lth3_equal;

/**
 *
 * @author Asus
 */
public class Oop6_lth3_equal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EqTest e = new EqTest();
    }

    EqTest() {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "java";
        if(s1==s2){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        
        if(s1==s3){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        
        
    }
}
