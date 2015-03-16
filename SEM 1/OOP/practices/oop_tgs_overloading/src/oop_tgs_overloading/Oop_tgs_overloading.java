/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_tgs_overloading;

/**
 *
 * @author Asus
 */
public class Oop_tgs_overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Container sumber = new sumur();
        Container small = new Glass(0, 1);
        Container med = new glass(0, 5);
        Container big = new glass(0, 10);
        //mengisi	
        med.fill(sumber);
        small.fill(med);
        big.fill(med);
        //geas ukuran big terisi emoat liter air

    }

}
