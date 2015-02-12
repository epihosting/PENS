/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestContainer;

/**
 *
 * @author Asus
 */
public class Tescontainer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Container sumber = new Sumur();
        Container small = new Glass(0, 1);
        Container med = new Glass(0, 5);
        Container big = new Glass(0, 10);

        // mengisi gelas big dengan 4 liter air
        med.fill(sumber);
        small.fill(med);
        big.fill(med);
        System.out.println("Keterangan volume : ");
        System.out.println("- gelas small(skrg :  " + small.volume + " L" + ", max : " + small.maxVolume + " L)");
        System.out.println("- gelas med(skrg :  " + med.volume + " L" + ", max : " + med.maxVolume + " L)");
        System.out.println("- gelas big(skrg :  " + med.volume + " L" + ", max : " + big.maxVolume + " L)");

    }
}
