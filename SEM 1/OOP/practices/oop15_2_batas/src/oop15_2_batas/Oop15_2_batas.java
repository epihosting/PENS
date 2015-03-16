/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop15_2_batas;

/**
 *
 * @author Asus
 */
public class Oop15_2_batas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nilai Maximum");
        Byte byteObj = new Byte(Byte.MAX_VALUE);
        System.out.println(" byte : " + byteObj);
        Short shortObj = new Short(Short.MAX_VALUE);
        System.out.println(" short: " + shortObj);
        Integer intObj = new Integer(Integer.MAX_VALUE);
        System.out.println(" integer: " + intObj);
        Long longObj = new Long(Long.MAX_VALUE);
        System.out.println(" long : " + longObj);
        Float floatObj = new Float(Float.MAX_VALUE);
        System.out.println(" float : " + floatObj);
        Double doubleObj = new Double(Double.MAX_VALUE);
        System.out.println(" double : " + doubleObj);
    }

}
