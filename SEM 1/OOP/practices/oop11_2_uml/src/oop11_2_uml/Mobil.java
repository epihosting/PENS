/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop11_2_uml;

/**
 *
 * @author Asus
 */
public class Mobil  extends Kendaraan{
    int kapasitasMesin;
    String bahanBakar;

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public int getKapasitasMesin() {
        return this.kapasitasMesin;
    }

    public String getBahanBakar() {
        return this.bahanBakar;
    }
}
