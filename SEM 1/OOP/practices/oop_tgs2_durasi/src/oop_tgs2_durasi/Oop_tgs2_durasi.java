package oop_tgs2_durasi;
import java.util.Scanner;
public class Oop_tgs2_durasi {
    public static void main(String[] args) {
        System.out.println("masukkan ");
        Scanner Input=new Scanner (System.in);

        System.out.print("jam awal : ");
        int ja = Input.nextInt();
        
        System.out.print("Menit awal : ");
        int ma = Input.nextInt();
            
        System.out.print("Jam akhir : ");
        int jb = Input.nextInt();
        System.out.print("Menit akhir : ");
        int mb = Input.nextInt();
   
        int j3, sisa, m3;
        int wa, wb, selisih, mtot;

        wa = (3600*ja)+(60*ma);
        wb = (3600*jb)+(60*mb);    

        selisih = wb-wa;
        // in hour 
        j3      = selisih/3600;
        sisa    = selisih%3600; 
        m3      = sisa/60; 
        //in minute
        mtot    = selisih / 60;

        System.out.println ("\nMENGHITUNG DURASI WAKTU");
        System.out.println ("========================");
        System.out.println ("\nWaktu Pertama   = "+ja+":"+ma);
        System.out.println ("Waktu Kedua     = "+jb+":"+mb);
        System.out.println ("\nSelisih Waktu   = "+j3+" jam "+m3+" menit ("+mtot+" menit)");
    }   
}
