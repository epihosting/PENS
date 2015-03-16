package munir2110147053.Modul6;

import java.util.Scanner;

public class IndexKarakter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String kalimat = s.nextLine();
        System.out.print("Masukkan huruf dicari : ");
        char huruf = s.next().charAt(0);
        boolean ketemu = false;
        String index = "Karakter " + huruf + " terdapat pada index ";

        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == huruf) {
                ketemu = true;
                index += i + ", ";
            }
        }

        if (ketemu == true) {
            System.out.println(index);
        } else {
            System.out.println("Pencarian tidak ditemukan");
        }
    }
}
