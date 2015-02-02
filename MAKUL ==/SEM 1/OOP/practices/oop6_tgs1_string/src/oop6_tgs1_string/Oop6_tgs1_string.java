/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop6_tgs1_string;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Oop6_tgs1_string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp     = new Scanner(System.in);
        System.out.print("kalimat : ");
        String strKal= inp.nextLine();
        System.out.print("karakter yang dicari : ");
        char kar = inp.next().charAt(0);
        boolean isExist = false;
        String index = "Karakter " + kar + " terdapat pada index ";
        for (int i = 0; i < strKal.length(); i++) {
            if (strKal.charAt(i) == kar) {
                isExist = true;
                index += i + ", ";
            }
        }
        if (isExist == true) {
            System.out.println(index);
        } else {
            System.out.println(kar+" tidak ditemukan");
        }
    }
}
