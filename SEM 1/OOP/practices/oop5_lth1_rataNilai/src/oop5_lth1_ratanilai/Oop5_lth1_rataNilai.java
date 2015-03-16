/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop5_lth1_ratanilai;

import java.text.NumberFormat;

/**
 *
 * @author Asus
 */
public class Oop5_lth1_rataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        int nrp[] = new int[4];
            nrp[0] = 1;
            nrp[1] = 2;
            nrp[2] = 3;
            nrp[3] = 4;
        
        int nilai[][] = new int[4][3];
            nilai[0][0] = 81;
            nilai[0][1] = 90;
            nilai[0][2] = 62;
            
            nilai[1][0] = 50;
            nilai[1][1] = 83;
            nilai[1][2] = 87;
            
            nilai[2][0] = 89;
            nilai[2][1] = 55;
            nilai[2][2] = 65;
            
            nilai[3][0] = 77;
            nilai[3][1] = 70;
            nilai[3][2] = 92;

        float avg[] = new float[nilai.length];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                avg[i] += nilai[i][j];
            }avg[i] /= nilai[0].length;
        }
        
        System.out.println("NRP \tRata-Rata");
        System.out.println("-----------------");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nrp[i] + "\t");
            System.out.print(nf.format(avg[i]) + "\n");
        }System.out.println("-----------------");
    }
}
