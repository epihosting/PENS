package munir2110147053.modul6;

import java.util.Scanner;
public class ReplaceKata {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("String kalimat utama : ");
        String utama = s.nextLine();
        System.out.print("String yang diganti : ");
        String diganti = s.nextLine();
        System.out.print("String pengganti : ");
        String pengganti = s.nextLine();
        
        System.out.println("Kalimat utama menjadi : " + utama.replaceAll(diganti, pengganti));
        
    }
}