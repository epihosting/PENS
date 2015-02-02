package munir2110147053.Modul6;

public class KonversiKarakter {
    public static void main(String[] args) {
        String welkam = "Selamat Datang di PENS";
        System.out.println("Original : " + welkam);
        System.out.println("Huruf Kecil : " + welkam.toLowerCase());
        System.out.println("Huruf Besar : " + welkam.toUpperCase());
        System.out.println("Panjang String : " + welkam.length());
        
        char p = 'P', e = 'E', n = 'N', s = 'S';
        for(int i=0; i<welkam.length(); i++){
            if(welkam.charAt(i) == p && welkam.charAt(i+1) == e && welkam.charAt(i+2) == n && welkam.charAt(i+3) == s) {
                System.out.println("Index kata PENS : " + i);
                break;
            }   
        }
    }
}
