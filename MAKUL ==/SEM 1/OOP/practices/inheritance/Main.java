/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Truk truk1 = new Truk();
        truk1.setJmlRoda(4);
        truk1.setWarna("kuning");
        truk1.setBahanBakar("solar");
        truk1.setKapasitasMesin(1500);
        truk1.setMuatanMaks(1000);

        Truk truk2 = new Truk();
        truk2.setJmlRoda(4);
        truk2.setWarna("merah");
        truk2.setBahanBakar("solar");
        truk2.setKapasitasMesin(2000);
        truk2.setMuatanMaks(1000);

        Taksi taksi1 = new Taksi();
        taksi1.setJmlRoda(4);
        taksi1.setWarna("oranye");
        taksi1.setBahanBakar("bensin");
        taksi1.setKapasitasMesin(1500);
        taksi1.setTarifAwal(10000);
        taksi1.setTarifPerKm(5000);

        Taksi taksi2 = new Taksi();
        taksi2.setJmlRoda(4);
        taksi2.setWarna("biru");
        taksi2.setBahanBakar("bensin");
        taksi2.setKapasitasMesin(1300);
        taksi2.setTarifAwal(7000);
        taksi2.setTarifPerKm(3500);

        Sepeda sepeda1 = new Sepeda();
        sepeda1.setJmlRoda(3);
        sepeda1.setWarna("hitam");
        sepeda1.setJmlSadel(1);
        sepeda1.setJmlGir(2);

        Sepeda sepeda2 = new Sepeda();
        sepeda2.setJmlRoda(2);
        sepeda2.setWarna("putih");
        sepeda2.setJmlSadel(2);
        sepeda2.setJmlGir(5);

        //===================================//

        System.out.println("Truk1; Roda : " + truk1.getjmlRoda() + "; Warna : " + truk1.getWarna() + "; BB : " + truk1.getBahanBakar() + "Kapasitas : " + truk1.getKapasitasMesin() + " Muatan : " + truk1.getMuatanMaks());
    }
}
