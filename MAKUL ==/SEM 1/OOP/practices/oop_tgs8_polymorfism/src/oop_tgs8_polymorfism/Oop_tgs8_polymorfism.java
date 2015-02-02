/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_tgs8_polymorfism;

/**
 *
 * @author Asus
 */
public class Oop_tgs8_polymorfism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Container sumber = new Sumur();
        Container small = new Glass(0, 1);
        Container med = new Glass(0, 5);
        Container big = new Glass(0, 10);

        med.fill(sumber);
        med.fill(med);
        big.fill(med);

        System.out.println("small =" + small.volume + "," + small.maxVolume);
        System.out.println("big =" + big.volume + "," + big.maxVolume);

        System.out.println("Glass medium diisi dengan 4 L air");

        med.fill(sumber);
        System.out.println("Sumber mengisi gelas medium " + med.volume);

        small.fill(med);
        System.out.println("Gelas medium mengisi gelas small " + small.volume);

        big.fill(med);
        System.out.println("Gelas medium mengisi gelas big" + big.volume);

    }

}
