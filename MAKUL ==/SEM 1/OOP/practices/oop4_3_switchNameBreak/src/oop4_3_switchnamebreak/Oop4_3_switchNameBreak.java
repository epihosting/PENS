/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4_3_switchnamebreak;

/**
 *
 * @author Asus
 */
public class Oop4_3_switchNameBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char firstInitial='a';
        System.out.println("masukkan huruf awal anda :");
        try{
            firstInitial=(char) System.in.read();
        }catch(Exception e){
            System.out.println("error : "+e.toString());
        }
        
        switch(firstInitial){
            case'a':
                System.out.println("nama anda pasti asep");
                break;
            case'b':
                System.out.println("nama anda pasti brodin");
                break;
            case'c':
                System.out.println("nama anda pasti cecep");
                break;
            default:
                System.out.println("nama anda tidak terkenal");
        }
        // TODO code application logic here
    }
    
}
