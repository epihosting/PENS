/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4_1_ifelse;

/**
 *
 * @author Asus
 */
public class Oop4_1_ifElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char firstInitial='a';
        System.out.println("Masukkan huruf awal nama anda : ");
        try{
            firstInitial=(char)System.in.read();
        }catch(Exception e){
            System.out.println("error : "+e.toString());
        }
        
        if(firstInitial=='a')
            System.out.println("Nama anda pasti Asep");
        else if(firstInitial=='b')
            System.out.println("Nama anda pasti Brodin");
        else if(firstInitial=='c')
            System.out.println("Nama anda pasti Cecep");
        else
            System.out.println("Nama anda tidak terkenal");
    }
}
