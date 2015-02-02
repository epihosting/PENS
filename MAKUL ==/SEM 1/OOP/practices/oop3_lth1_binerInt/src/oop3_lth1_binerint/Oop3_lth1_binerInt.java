/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3_lth1_binerint;

//import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Oop3_lth1_binerInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("konversi desimal ke biner");
//        Scanner msk=new Scanner(System.in);
//        System.out.println("masukkan nilai desimal = ");
//        int bil = msk.nextInt();
//        tumpukkan bn=new tumpukkan(10);
//        int n = bil;
//        while(bil>0){
//            n=bil%2;
//            if(n>0){
//                bn.push(1);
//            }else{
//                bn.push(0);
//                bil=bil/2;
//            }
//            System.out.println("");
//        }
        import java.util.Scanner;
        class Konversi{
            public void desimalkebiner(int a){
                if (a>1) {
                    desimalkebiner(a/2);
                }
                System.out.print(a%2);
            }
        }
        class DesToBin {
            public static void main (String args[]){
                int des, a;
                Konversi angka = new Konversi();
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan Angka : ");
                des = input.nextInt();
                System.out.println("Bilangan Desimalnya : "+des);
                System.out.print("Konversi Binernya : ");
                angka.desimalkebiner(des);
                System.out.println();
            }
        }
    }
    
}
