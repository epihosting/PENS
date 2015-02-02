package munir2110147053.Modul6;

import java.util.Scanner;
public class TukarNama {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("String nama pertama : ");
        String nama1 = s.nextLine();
        System.out.print("String nama kedua : ");
        String nama2 = s.nextLine();

        String[] splitNama1 = nama1.split("\\s+");
        String[] splitNama2 = nama2.split("\\s+");
        
        System.out.println("String nama pertama : " + splitNama1[0] + " " + splitNama2[1]);
        System.out.println("String nama kedua : " + splitNama2[0] + " " + splitNama1[1]);
    }
    
}
