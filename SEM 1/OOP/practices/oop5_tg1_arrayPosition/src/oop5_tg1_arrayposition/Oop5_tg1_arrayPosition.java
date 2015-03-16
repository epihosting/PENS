/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop5_tg1_arrayposition;

/**
 *
 * @author Asus
 */
public class Oop5_tg1_arrayPosition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] arr = {
            {32, 87, 3, 589},
            {12, 1076, 2000, 8},
            {622, 127, 77, 955}
        };

        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[0].length; y++) {
                if (arr[x][y] == 12) {
                    System.out.print("Found " + arr[x][y] + " at ");
                    System.out.println(x + "," + y);
                }
            }
        }
    }
}
