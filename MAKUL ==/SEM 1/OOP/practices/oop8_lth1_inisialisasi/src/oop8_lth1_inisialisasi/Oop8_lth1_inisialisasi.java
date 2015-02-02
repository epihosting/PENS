/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop8_lth1_inisialisasi;

/**
 *
 * @author Asus
 */
public class Oop8_lth1_inisialisasi {

    /**
     * @param args the command line arguments
     */
    public static String getTime(Kalender kal) {
        String tmp;
        tmp =   kal.getTanggal() + "-" +
                kal.getBulan() + "-" +
                kal.getTahun();
        return tmp;
    }

    public static void main(String[] args) {
        Kalender kal = new Kalender(8);

        System.out.println("waktu awal :" + getTime(kal));
        kal.setTanggal(9);


    }

}
