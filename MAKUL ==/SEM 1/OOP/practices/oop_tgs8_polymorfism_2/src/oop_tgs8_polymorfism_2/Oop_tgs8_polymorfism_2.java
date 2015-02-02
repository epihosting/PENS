/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_tgs8_polymorfism_2;

/**
 *
 * @author Asus
 */
public class Oop_tgs8_polymorfism_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Container sumber = new Sumur();
        Container small = new Glass(0, 1);
        Container med = new Glass(0, 5);
        Container big = new Glass(0, 10);

//      isi 4 liter -> gelas med
        med.fill(sumber);
        small.fill(med);
        System.out.println("isi " + med.volume + " liter -> gelas med");
        med.empty(0);
        small.empty(0);

//        isi  6 liter -> gelas  big
        med.fill(sumber);
        small.fill(sumber);
        big.fill(med);
        big.fill(small);
        System.out.println("isi " + big.volume + " liter -> gelas big");
    }
}
