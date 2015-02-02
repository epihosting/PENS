/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop5_2_aksesmultiarray;

import java.text.NumberFormat;

/**
 *
 * @author Asus
 */
public class Oop5_2_aksesMultiArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);
        int nilai[][] = new int[2][3];
        nilai[0][0] = 80;
        nilai[0][1] = 81;
        nilai[0][2] = 78;
        nilai[1][0] = 65;
        nilai[1][1] = 73;
        nilai[1][2] = 71;
        String MK[] = {"RPL", "PBO"};
        double ratarataMK[] = new double[nilai.length];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                ratarataMK[i] += nilai[i][j];
            }ratarataMK[i] /= nilai[0].length;
        }System.out.println("nilai mata kuliah \n");
        System.out.println("MK \tMinggu1\tMinggu2\tMinggu3\tRata-rata");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(MK[i] + "\t");
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print(nilai[i][j] + "\t");
            }System.out.print(nf.format(ratarataMK[i] + "\n"));
        }
    }
}
