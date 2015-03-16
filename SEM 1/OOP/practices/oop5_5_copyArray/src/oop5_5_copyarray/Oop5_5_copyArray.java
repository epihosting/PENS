/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop5_5_copyarray;

/**
 *
 * @author Asus
 */
public class Oop5_5_copyArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1={7,4,8,1,4,1,4};
        int[] array2=new int[3];
        
        System.arraycopy(array1,0,array2,0,3);
        System.out.print("Array1 : ");
        
        for(int i=0;i<array1.length;i++)
            System.out.print(array1[i]+" ");
        
        System.out.println();
        System.out.print("Array2 :");
        
        for(int i=0;i<array2.length;i++)
            System.out.print(array2[i]+" ");
    }
}
