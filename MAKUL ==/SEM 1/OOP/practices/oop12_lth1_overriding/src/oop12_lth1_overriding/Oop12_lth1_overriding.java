/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop12_lth1_overriding;

/**
 *
 * @author Asus
 */
public class Oop12_lth1_overriding extends Base {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Oop12_lth1_overriding o = new Oop12_lth1_overriding();
        int iBase = 0;
        o.amethod(iBase);
    }

    public void amethod(int iOver) {
        System.out.println("Overriding.amethod");
    }
}
