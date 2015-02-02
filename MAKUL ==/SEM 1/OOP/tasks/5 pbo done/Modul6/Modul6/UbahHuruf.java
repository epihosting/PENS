package munir2110147053.Modul6;

import java.util.Scanner;
public class UbahHuruf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan kata yang mau ditukar : ");
        String masukan = s.nextLine();
        System.out.println("String masukan : " + masukan);
        String hasil = "String hasil : ";
        
        for(int i=0; i<masukan.length(); i++){
            if(i == 0)
                hasil += masukan.charAt(masukan.length()-1);
            else if(i == (masukan.length()-1))
                hasil += masukan.charAt(0);
            else
                hasil += masukan.charAt(i);
        }
        
        System.out.println(hasil);
    }
}